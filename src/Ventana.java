import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Calendar;

public class Ventana extends JFrame implements Runnable {
    private static final int PIXEL_SHAPE = 1, APPBAR_HEIGT = 28;
    private Image background, buffer;
    private Thread hilo;
    private int min, hora, sec;
    private int manecillaSegundos = 100, manecillaMinutos = 70, manecillaHora = 50;

    public Ventana() {
        setTitle("Reloj Analógico");
        setResizable(false);
        setSize(384,256);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        hilo = new Thread(this);
        hilo.start();
    }

    public void run() {
        while(true) {
            try {
                repaint();
                hilo.sleep(1000);
            } catch (InterruptedException ex) {}
        }
    }

    public void paint(Graphics graphics) {
        background = createImage(getWidth(), getHeight());
        Graphics backgroundGraphics = background.getGraphics();
        backgroundUpdate(backgroundGraphics);
        clockUpdate(graphics);
    }

    private void backgroundUpdate(Graphics graphics) {
        buffer = createImage(getWidth(), getHeight());
        Graphics backgroundBuffer = buffer.getGraphics();
        graphics.setColor(Color.BLUE);
        graphics.drawRect(0, 0, getWidth(), getHeight());

        blockPainter (128, APPBAR_HEIGT + 64, backgroundBuffer);
        graphics.drawImage(buffer,0,0,this);
    }

    private void blockPainter (int x, int y, Graphics graphics) {
        Block block = new Block();
        Color[][] pixels = block.getFloorBlock();
        for (int i = 0; i <= pixels.length - 1; i++) {
            for (int j = 0; j <= pixels[i].length - 1; j++) {
                graphics.setColor(pixels[i][j]);
                graphics.fillRect(PIXEL_SHAPE * (i + x), PIXEL_SHAPE * (j + y), PIXEL_SHAPE, PIXEL_SHAPE);
            }
        }
    }

    private void clockUpdate(Graphics graphics) {
        double anguloHora, anguloMin, anguloSec;

        Calendar calendar = Calendar.getInstance();
        if(calendar.get(Calendar.SECOND) != sec) {

            hora = calendar.get(Calendar.HOUR);
            min = calendar.get(Calendar.MINUTE);
            sec = calendar.get(Calendar.SECOND);

            buffer = createImage(getWidth(), getHeight());
            Graphics2D gbuffer = (Graphics2D) buffer.getGraphics();
            gbuffer.drawImage(background,0,0,this);


            anguloHora = calculoAnguloH(hora);
            anguloMin = calculoAnguloMS(min);
            anguloSec = calculoAnguloMS(sec);

            gbuffer.setColor(Color.RED);
            gbuffer.drawLine(getWidth()/2, getHeight()/2, getWidth() / 2 + (int) getX(anguloHora, manecillaHora), getHeight() / 2 + (int) getY(anguloHora, manecillaHora));

            gbuffer.setColor(Color.BLUE);
            gbuffer.drawLine(getWidth()/2, getHeight()/2, getWidth() / 2 + (int) getX(anguloMin, manecillaMinutos), getHeight() / 2 + (int) getY(anguloMin, manecillaMinutos));

            gbuffer.setColor(Color.BLACK);
            gbuffer.drawLine(getWidth()/2, getHeight()/2, getWidth() / 2 + (int) getX(anguloSec, manecillaSegundos), getHeight() / 2 + (int) getY(anguloSec, manecillaSegundos));
            graphics.drawImage(buffer,0,0,this);
        }
    }

    private double getX(double angulo, int radio) {
        double x = (double) radio * (Math.cos(Math.toRadians(angulo)));
        return x;
    }

    private double getY(double angulo, int radio) {
        double y = (double) radio * (Math.sin(Math.toRadians(angulo)));
        return y;
    }

    private int calculoAnguloH(int hora) {
        int angulo = hora * 30 - 90;
        return angulo;
    }

    private int calculoAnguloMS(int min) {
        int angulo = min * 6 - 90;
        return angulo;
    }
}