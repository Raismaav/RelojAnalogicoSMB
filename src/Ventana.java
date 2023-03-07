import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class Ventana extends JFrame implements Runnable {
    private static final int PIXEL_SHAPE = 3, APPBAR_HEIGT = 0;
    private static final int[][] STAGE = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 9, 0, 0, 11, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 2, 3, 2, 0, 0, 0, 0, 0, 0, 4, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 0, 0, 0},
            {0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 4, 4, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
    };
    private Image background, buffer;
    private Thread hilo;
    private int min, hora, sec;
    private int manecillaSegundos = 48 * PIXEL_SHAPE, manecillaMinutos = 32 * PIXEL_SHAPE, manecillaHora = 16 * PIXEL_SHAPE;

    public Ventana() {
        setTitle("Reloj Analógico");
        setResizable(false);
        setSize(PIXEL_SHAPE * 384,PIXEL_SHAPE * 256 + APPBAR_HEIGT);
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

        blockSelector(backgroundBuffer);
        graphics.drawImage(buffer,0,0,this);
    }

    private void blockSelector(Graphics graphics) {
        BlocksTextures blocks = new BlocksTextures();
        for (int i = 0; i <= STAGE.length - 1; i++) {
            for (int j = 0; j <= STAGE[i].length - 1; j++) {
                switch (STAGE[i][j]) {
                    case 0:
                        blockPainter(16 * j, APPBAR_HEIGT + (16 * i), blocks.getSkyBlock(), graphics);
                        break;

                    case 1:
                        blockPainter(16 * j, APPBAR_HEIGT + (16 * i), blocks.getFloorBlock(), graphics);
                        break;

                    case 2:
                        blockPainter(16 * j, APPBAR_HEIGT + (16 * i), blocks.getBrickBlock(), graphics);
                        break;

                    case 3:
                        blockPainter(16 * j, APPBAR_HEIGT + (16 * i), blocks.getQuestionBlock(), graphics);
                        break;

                    case 4:
                        blockPainter(16 * j, APPBAR_HEIGT + (16 * i), blocks.getCoinBlock(), graphics);
                        break;

                    case 5:
                        blockPainter(16 * j, APPBAR_HEIGT + (16 * i), blocks.getMario(), graphics);
                        break;

                    case 6:
                        blockPainter(16 * j, APPBAR_HEIGT + (16 * i), blocks.getGoomba(), graphics);
                        break;

                    case 7:
                        blockPainter(16 * j, APPBAR_HEIGT + (16 * i), blocks.getNumberThreeBlock(), graphics);
                        break;

                    case 8:
                        blockPainter(16 * j, APPBAR_HEIGT + (16 * i), blocks.getNumberSixBlock(), graphics);
                        break;

                    case 9:
                        blockPainter(16 * j, APPBAR_HEIGT + (16 * i), blocks.getNumberNineBlock(), graphics);
                        break;

                    case 10:
                        blockPainter(16 * j, APPBAR_HEIGT + (16 * i), blocks.getNumberTwelveBlock(), graphics);
                        break;
                }
            }
        }
    }

    private void blockPainter(int x, int y, Color[][] pixels, Graphics graphics) {
        for (int i = 0; i <= pixels.length - 1; i++) {
            for (int j = 0; j <= pixels[i].length - 1; j++) {
                graphics.setColor(pixels[i][j]);
                graphics.fillRect(PIXEL_SHAPE * (j + x), PIXEL_SHAPE * (i + y), PIXEL_SHAPE, PIXEL_SHAPE);
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
            gbuffer.drawLine(72 * PIXEL_SHAPE, 88 * PIXEL_SHAPE, 72 * PIXEL_SHAPE + (int) getX(anguloHora, manecillaHora), 88 * PIXEL_SHAPE + (int) getY(anguloHora, manecillaHora));

            gbuffer.setColor(Color.BLUE);
            gbuffer.drawLine(72 * PIXEL_SHAPE, 88 * PIXEL_SHAPE, 72 * PIXEL_SHAPE + (int) getX(anguloMin, manecillaMinutos), 88 * PIXEL_SHAPE + (int) getY(anguloMin, manecillaMinutos));

            gbuffer.setColor(Color.BLACK);
            gbuffer.drawLine(72 * PIXEL_SHAPE, 88 * PIXEL_SHAPE, 72 * PIXEL_SHAPE + (int) getX(anguloSec, manecillaSegundos), 88 * PIXEL_SHAPE + (int) getY(anguloSec, manecillaSegundos));
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