import java.awt.*;

public class BlocksTextures {
    private Color skyBlue = new Color(121, 134, 247);
    private Color red____ = new Color(234, 76, 45);
    private Color greenM_ = new Color(131, 121, 41);
    private Color green1_ = new Color(194, 239, 37);
    private Color green2_ = new Color(83, 170, 52);
    private Color green3_ = new Color(68, 103, 27);
    private Color brown__ = new Color(176, 101, 46);
    private Color beidge_ = new Color(249, 218, 184);
    private Color black__ = new Color(31, 31, 31);
    private Color skin___ = new Color(244, 181, 107);
    private Color gold___ = new Color(243, 172, 91);
    private Color gray1__ = new Color(253, 254, 253);
    private Color gray2__ = new Color(185, 188, 189);
    private Color gray3__ = new Color(79, 73, 86);

    //number 0 block
    public Color[][] getSkyBlock() {
        Color[][] block = {
                {skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue}};
        return block;
    }

    //number 1 block
    public Color[][] getFloorBlock() {
        Color[][] block = {
                {brown__, beidge_, beidge_, beidge_, beidge_, beidge_, beidge_, beidge_, beidge_, black__, brown__, beidge_, beidge_, beidge_, beidge_, brown__},
                {beidge_, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, black__, beidge_, brown__, brown__, brown__, brown__, black__},
                {beidge_, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, black__, beidge_, brown__, brown__, brown__, brown__, black__},
                {beidge_, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, black__, beidge_, brown__, brown__, brown__, brown__, black__},
                {beidge_, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, black__, beidge_, black__, brown__, brown__, brown__, black__},
                {beidge_, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, black__, brown__, black__, black__, black__, black__, brown__},
                {beidge_, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, black__, beidge_, beidge_, beidge_, beidge_, beidge_, black__},
                {beidge_, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, black__, beidge_, brown__, brown__, brown__, brown__, black__},
                {beidge_, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, black__, beidge_, brown__, brown__, brown__, brown__, black__},
                {beidge_, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, black__, beidge_, brown__, brown__, brown__, brown__, black__},
                {black__, black__, brown__, brown__, brown__, brown__, brown__, brown__, black__, beidge_, brown__, brown__, brown__, brown__, brown__, black__},
                {beidge_, beidge_, black__, black__, brown__, brown__, brown__, brown__, black__, beidge_, brown__, brown__, brown__, brown__, brown__, black__},
                {beidge_, brown__, beidge_, beidge_, black__, black__, black__, black__, beidge_, brown__, brown__, brown__, brown__, brown__, brown__, black__},
                {beidge_, brown__, brown__, brown__, beidge_, beidge_, beidge_, black__, beidge_, brown__, brown__, brown__, brown__, brown__, brown__, black__},
                {beidge_, brown__, brown__, brown__, brown__, brown__, brown__, black__, beidge_, brown__, brown__, brown__, brown__, brown__, black__, black__},
                {brown__, black__, black__, black__, black__, black__, black__, brown__, beidge_, black__, black__, black__, black__, black__, black__, brown__}};
        return block;
    }

    //number 2 block
    public Color[][] getBrickBlock() {
        Color[][] block = {
                {beidge_, beidge_, beidge_, beidge_, beidge_, beidge_, beidge_, beidge_, beidge_, beidge_, beidge_, beidge_, beidge_, beidge_, beidge_, beidge_},
                {brown__, brown__, brown__, brown__, brown__, brown__, brown__, black__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, black__},
                {brown__, brown__, brown__, brown__, brown__, brown__, brown__, black__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, black__},
                {black__, black__, black__, black__, black__, black__, black__, black__, black__, black__, black__, black__, black__, black__, black__, black__},
                {brown__, brown__, brown__, black__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, black__, brown__, brown__, brown__, brown__},
                {brown__, brown__, brown__, black__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, black__, brown__, brown__, brown__, brown__},
                {brown__, brown__, brown__, black__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, black__, brown__, brown__, brown__, brown__},
                {black__, black__, black__, black__, black__, black__, black__, black__, black__, black__, black__, black__, black__, black__, black__, black__},
                {brown__, brown__, brown__, brown__, brown__, brown__, brown__, black__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, black__},
                {brown__, brown__, brown__, brown__, brown__, brown__, brown__, black__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, black__},
                {brown__, brown__, brown__, brown__, brown__, brown__, brown__, black__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, black__},
                {black__, black__, black__, black__, black__, black__, black__, black__, black__, black__, black__, black__, black__, black__, black__, black__},
                {brown__, brown__, brown__, black__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, black__, brown__, brown__, brown__, brown__},
                {brown__, brown__, brown__, black__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, black__, brown__, brown__, brown__, brown__},
                {brown__, brown__, brown__, black__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, black__, brown__, brown__, brown__, brown__},
                {black__, black__, black__, black__, black__, black__, black__, black__, black__, black__, black__, black__, black__, black__, black__, black__}};
        return block;
    }

    //number 3 block
    public Color[][] getQuestionBlock() {
        Color[][] block = {
                {skyBlue, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, skyBlue},
                {brown__, gold___, gold___, gold___, gold___, gold___, gold___, gold___, gold___, gold___, gold___, gold___, gold___, gold___, gold___, black__},
                {brown__, gold___, black__, gold___, gold___, gold___, gold___, gold___, gold___, gold___, gold___, gold___, gold___, black__, gold___, black__},
                {brown__, gold___, gold___, gold___, gold___, brown__, brown__, brown__, brown__, brown__, gold___, gold___, gold___, gold___, gold___, black__},
                {brown__, gold___, gold___, gold___, brown__, brown__, black__, black__, black__, brown__, brown__, gold___, gold___, gold___, gold___, black__},
                {brown__, gold___, gold___, gold___, brown__, brown__, black__, gold___, gold___, brown__, brown__, black__, gold___, gold___, gold___, black__},
                {brown__, gold___, gold___, gold___, brown__, brown__, black__, gold___, gold___, brown__, brown__, black__, gold___, gold___, gold___, black__},
                {brown__, gold___, gold___, gold___, gold___, black__, black__, gold___, brown__, brown__, brown__, black__, gold___, gold___, gold___, black__},
                {brown__, gold___, gold___, gold___, gold___, gold___, gold___, brown__, brown__, black__, black__, black__, gold___, gold___, gold___, black__},
                {brown__, gold___, gold___, gold___, gold___, gold___, gold___, brown__, brown__, black__, gold___, gold___, gold___, gold___, gold___, black__},
                {brown__, gold___, gold___, gold___, gold___, gold___, gold___, gold___, black__, black__, gold___, gold___, gold___, gold___, gold___, black__},
                {brown__, gold___, gold___, gold___, gold___, gold___, gold___, brown__, brown__, gold___, gold___, gold___, gold___, gold___, gold___, black__},
                {brown__, gold___, gold___, gold___, gold___, gold___, gold___, brown__, brown__, black__, gold___, gold___, gold___, gold___, gold___, black__},
                {brown__, gold___, black__, gold___, gold___, gold___, gold___, gold___, black__, black__, gold___, gold___, gold___, black__, gold___, black__},
                {brown__, gold___, gold___, gold___, gold___, gold___, gold___, gold___, gold___, gold___, gold___, gold___, gold___, gold___, gold___, black__},
                {brown__, black__, black__, black__, black__, black__, black__, black__, black__, black__, black__, black__, black__, black__, black__, black__}};
        return block;
    }

    //number 4 block
    public Color[][] getCoinBlock() {
        Color[][] block = {
                {skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, gold___, gold___, gold___, gold___, black__, black__, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, skyBlue, gold___, gold___, gold___, gold___, gold___, gold___, black__, black__, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, skyBlue, gold___, gold___, brown__, brown__, gold___, gold___, black__, black__, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, gold___, gold___, brown__, gold___, gold___, black__, gold___, gold___, black__, black__, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, gold___, gold___, brown__, gold___, gold___, black__, gold___, gold___, black__, black__, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, gold___, gold___, brown__, gold___, gold___, black__, gold___, gold___, black__, black__, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, gold___, gold___, brown__, gold___, gold___, black__, gold___, gold___, black__, black__, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, gold___, gold___, brown__, gold___, gold___, black__, gold___, gold___, black__, black__, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, gold___, gold___, brown__, gold___, gold___, black__, gold___, gold___, black__, black__, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, gold___, gold___, brown__, gold___, gold___, black__, gold___, gold___, black__, black__, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, gold___, gold___, brown__, gold___, gold___, black__, gold___, gold___, black__, black__, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, skyBlue, gold___, gold___, black__, black__, gold___, gold___, black__, black__, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, skyBlue, gold___, gold___, gold___, gold___, gold___, gold___, black__, black__, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, gold___, gold___, gold___, gold___, black__, black__, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue}};
        return block;
    }

    //number 5 block
    public Color[][] getMario() {
        Color[][] block = {
                {skyBlue, skyBlue, skyBlue, red____, red____, red____, red____, red____, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, red____, red____, red____, red____, red____, red____, red____, red____, red____, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, greenM_, greenM_, greenM_, skin___, skin___, greenM_, skin___, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, greenM_, skin___, greenM_, skin___, skin___, skin___, greenM_, skin___, skin___, skin___, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, greenM_, skin___, greenM_, greenM_, skin___, skin___, skin___, greenM_, skin___, skin___, skin___, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, greenM_, greenM_, skin___, skin___, skin___, skin___, greenM_, greenM_, greenM_, greenM_, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, skin___, skin___, skin___, skin___, skin___, skin___, skin___, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, greenM_, greenM_, red____, greenM_, greenM_, greenM_, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, greenM_, greenM_, greenM_, red____, greenM_, greenM_, red____, greenM_, greenM_, greenM_, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue},
                {greenM_, greenM_, greenM_, greenM_, red____, red____, red____, red____, greenM_, greenM_, greenM_, greenM_, skyBlue, skyBlue, skyBlue, skyBlue},
                {skin___, skin___, greenM_, red____, skin___, red____, red____, skin___, red____, greenM_, skin___, skin___, skyBlue, skyBlue, skyBlue, skyBlue},
                {skin___, skin___, skin___, red____, red____, red____, red____, red____, red____, skin___, skin___, skin___, skyBlue, skyBlue, skyBlue, skyBlue},
                {skin___, skin___, red____, red____, red____, red____, red____, red____, red____, red____, skin___, skin___, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, red____, red____, red____, skyBlue, skyBlue, red____, red____, red____, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, greenM_, greenM_, greenM_, skyBlue, skyBlue, skyBlue, skyBlue, greenM_, greenM_, greenM_, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue},
                {greenM_, greenM_, greenM_, greenM_, skyBlue, skyBlue, skyBlue, skyBlue, greenM_, greenM_, greenM_, greenM_, skyBlue, skyBlue, skyBlue, skyBlue}};
        return block;
    }

    //number 6 block
    public Color[][] getGoomba() {
        Color[][] block = {
                {skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, brown__, brown__, brown__, brown__, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, brown__, brown__, brown__, brown__, brown__, brown__, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, skyBlue, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, brown__, black__, black__, brown__, brown__, brown__, brown__, brown__, brown__, black__, black__, brown__, skyBlue, skyBlue},
                {skyBlue, brown__, brown__, brown__, beidge_, black__, brown__, brown__, brown__, brown__, black__, beidge_, brown__, brown__, brown__, skyBlue},
                {skyBlue, brown__, brown__, brown__, beidge_, black__, black__, black__, black__, black__, black__, beidge_, brown__, brown__, brown__, skyBlue},
                {brown__, brown__, brown__, brown__, beidge_, black__, beidge_, brown__, brown__, beidge_, black__, beidge_, brown__, brown__, brown__, brown__},
                {brown__, brown__, brown__, brown__, beidge_, beidge_, beidge_, brown__, brown__, beidge_, beidge_, beidge_, brown__, brown__, brown__, brown__},
                {brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__},
                {skyBlue, brown__, brown__, brown__, brown__, beidge_, beidge_, beidge_, beidge_, beidge_, beidge_, brown__, brown__, brown__, brown__, skyBlue},
                {skyBlue, skyBlue, skyBlue, skyBlue, beidge_, beidge_, beidge_, beidge_, beidge_, beidge_, beidge_, beidge_, skyBlue, skyBlue, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, skyBlue, beidge_, beidge_, beidge_, beidge_, beidge_, beidge_, beidge_, beidge_, black__, black__, skyBlue, skyBlue},
                {skyBlue, skyBlue, skyBlue, black__, black__, beidge_, beidge_, beidge_, beidge_, beidge_, black__, black__, black__, black__, black__, skyBlue},
                {skyBlue, skyBlue, skyBlue, black__, black__, black__, beidge_, beidge_, beidge_, black__, black__, black__, black__, black__, black__, skyBlue},
                {skyBlue, skyBlue, skyBlue, skyBlue, black__, black__, black__, skyBlue, skyBlue, black__, black__, black__, black__, black__, skyBlue, skyBlue}};
        return block;
    }

    //number 7 block
    public Color[][] getNumberThreeBlock() {
        Color[][] block = {
                {skyBlue, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, skyBlue},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray1__, gray1__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__, gray3__, gray1__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray1__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray1__, gray1__, gray1__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__, gray3__, gray1__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray1__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray1__, gray1__, gray3__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__, gray3__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {skyBlue, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__}};
        return block;
    }

    //number 8 block
    public Color[][] getNumberSixBlock() {
        Color[][] block = {
                {skyBlue, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, skyBlue},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray1__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray1__, gray3__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray1__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray1__, gray1__, gray1__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray1__, gray3__, gray3__, gray1__, gray3__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray1__, gray3__, gray2__, gray1__, gray3__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__, gray1__, gray1__, gray3__, gray3__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__, gray3__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {skyBlue, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__}};
        return block;
    }

    //number 9 block
    public Color[][] getNumberNineBlock() {
        Color[][] block = {
                {skyBlue, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, skyBlue},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray1__, gray1__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray1__, gray3__, gray3__, gray1__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray1__, gray3__, gray2__, gray1__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray3__, gray1__, gray1__, gray1__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__, gray3__, gray1__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray1__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray1__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {skyBlue, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__}};
        return block;
    }

    //number 10 block
    public Color[][] getNumberTwelveBlock() {
        Color[][] block = {
                {skyBlue, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, skyBlue},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray1__, gray3__, gray2__, gray1__, gray1__, gray1__, gray3__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray1__, gray3__, gray2__, gray3__, gray3__, gray3__, gray1__, gray3__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray1__, gray3__, gray2__, gray2__, gray2__, gray2__, gray1__, gray3__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray1__, gray3__, gray2__, gray2__, gray1__, gray1__, gray3__, gray3__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray1__, gray3__, gray2__, gray1__, gray3__, gray3__, gray3__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray1__, gray3__, gray2__, gray1__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray1__, gray3__, gray2__, gray3__, gray1__, gray1__, gray1__, gray3__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray3__, gray3__, gray2__, gray2__, gray3__, gray3__, gray3__, gray3__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {skyBlue, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__}};
        return block;
    }

    //number 11 block
    public Color[][] getFireBarBlock() {
        Color[][] block = {
                {skyBlue, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, skyBlue},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray1__, gray1__, gray3__, gray3__, gray3__, gray3__, gray1__, gray1__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray1__, gray1__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray1__, gray1__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray1__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray1__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray1__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray1__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray1__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray1__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray1__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray1__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray1__, gray1__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray1__, gray1__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray1__, gray1__, gray3__, gray3__, gray3__, gray3__, gray1__, gray1__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray1__, gray1__, gray1__, gray1__, gray1__, gray1__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {gray1__, gray2__, gray3__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__, gray2__, gray3__},
                {gray1__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray2__, gray3__},
                {skyBlue, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__, gray3__}};
        return block;
    }

    //number 12 block
    public Color[][] getLeftPipelineBlock() {
        Color[][] block = {
                {skyBlue, green3_, green1_, green1_, green1_, green2_, green2_, green1_, green1_, green1_, green1_, green1_, green1_, green2_, green1_, green1_},
                {skyBlue, green3_, green1_, green1_, green1_, green2_, green2_, green1_, green1_, green1_, green1_, green1_, green1_, green2_, green1_, green1_},
                {skyBlue, green3_, green1_, green1_, green1_, green2_, green2_, green1_, green1_, green1_, green1_, green1_, green1_, green2_, green1_, green1_},
                {skyBlue, green3_, green1_, green1_, green1_, green2_, green2_, green1_, green1_, green1_, green1_, green1_, green1_, green2_, green1_, green1_},
                {skyBlue, green3_, green1_, green1_, green1_, green2_, green2_, green1_, green1_, green1_, green1_, green1_, green1_, green2_, green1_, green1_},
                {skyBlue, green3_, green1_, green1_, green1_, green2_, green2_, green1_, green1_, green1_, green1_, green1_, green1_, green2_, green1_, green1_},
                {skyBlue, green3_, green1_, green1_, green1_, green2_, green2_, green1_, green1_, green1_, green1_, green1_, green1_, green2_, green1_, green1_},
                {skyBlue, green3_, green1_, green1_, green1_, green2_, green2_, green1_, green1_, green1_, green1_, green1_, green1_, green2_, green1_, green1_},
                {skyBlue, green3_, green1_, green1_, green1_, green2_, green2_, green1_, green1_, green1_, green1_, green1_, green1_, green2_, green1_, green1_},
                {skyBlue, green3_, green1_, green1_, green1_, green2_, green2_, green1_, green1_, green1_, green1_, green1_, green1_, green2_, green1_, green1_},
                {skyBlue, green3_, green1_, green1_, green1_, green2_, green2_, green1_, green1_, green1_, green1_, green1_, green1_, green2_, green1_, green1_},
                {skyBlue, green3_, green1_, green1_, green1_, green2_, green2_, green1_, green1_, green1_, green1_, green1_, green1_, green2_, green1_, green1_},
                {skyBlue, green3_, green1_, green1_, green1_, green2_, green2_, green1_, green1_, green1_, green1_, green1_, green1_, green2_, green1_, green1_},
                {skyBlue, green3_, green1_, green1_, green1_, green2_, green2_, green1_, green1_, green1_, green1_, green1_, green1_, green2_, green1_, green1_},
                {skyBlue, green3_, green1_, green1_, green1_, green2_, green2_, green1_, green1_, green1_, green1_, green1_, green1_, green2_, green1_, green1_},
                {skyBlue, green3_, green1_, green1_, green1_, green2_, green2_, green1_, green1_, green1_, green1_, green1_, green1_, green2_, green1_, green1_}};
        return block;
    }

    //number 13 block
    public Color[][] getRightPipelineBlock() {
        Color[][] block = {
                {green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green1_, green2_, green1_, green1_, green3_, skyBlue},
                {green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green1_, green2_, green1_, green1_, green1_, green3_, skyBlue},
                {green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green1_, green2_, green1_, green1_, green3_, skyBlue},
                {green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green1_, green2_, green1_, green1_, green1_, green3_, skyBlue},
                {green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green1_, green2_, green1_, green1_, green3_, skyBlue},
                {green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green1_, green2_, green1_, green1_, green1_, green3_, skyBlue},
                {green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green1_, green2_, green1_, green1_, green3_, skyBlue},
                {green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green1_, green2_, green1_, green1_, green1_, green3_, skyBlue},
                {green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green1_, green2_, green1_, green1_, green3_, skyBlue},
                {green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green1_, green2_, green1_, green1_, green1_, green3_, skyBlue},
                {green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green1_, green2_, green1_, green1_, green3_, skyBlue},
                {green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green1_, green2_, green1_, green1_, green1_, green3_, skyBlue},
                {green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green1_, green2_, green1_, green1_, green3_, skyBlue},
                {green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green1_, green2_, green1_, green1_, green1_, green3_, skyBlue},
                {green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green1_, green2_, green1_, green1_, green3_, skyBlue},
                {green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green1_, green2_, green1_, green1_, green1_, green3_, skyBlue}};
        return block;
    }

    //number 14 block
    public Color[][] getTopLeftPipelineBlock() {
        Color[][] block = {
                {green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_},
                {green3_, green1_, green1_, green1_, green1_, green1_, green1_, green1_, green1_, green1_, green1_, green1_, green1_, green1_, green1_, green1_},
                {green3_, green2_, green2_, green2_, green2_, green2_, green1_, green1_, green1_, green1_, green1_, green1_, green2_, green2_, green2_, green2_},
                {green3_, green1_, green1_, green1_, green2_, green2_, green1_, green1_, green1_, green1_, green1_, green1_, green2_, green1_, green1_, green2_},
                {green3_, green1_, green1_, green1_, green2_, green2_, green1_, green1_, green1_, green1_, green1_, green1_, green2_, green1_, green1_, green2_},
                {green3_, green1_, green1_, green1_, green2_, green2_, green1_, green1_, green1_, green1_, green1_, green1_, green2_, green1_, green1_, green2_},
                {green3_, green1_, green1_, green1_, green2_, green2_, green1_, green1_, green1_, green1_, green1_, green1_, green2_, green1_, green1_, green2_},
                {green3_, green1_, green1_, green1_, green2_, green2_, green1_, green1_, green1_, green1_, green1_, green1_, green2_, green1_, green1_, green2_},
                {green3_, green1_, green1_, green1_, green2_, green2_, green1_, green1_, green1_, green1_, green1_, green1_, green2_, green1_, green1_, green2_},
                {green3_, green1_, green1_, green1_, green2_, green2_, green1_, green1_, green1_, green1_, green1_, green1_, green2_, green1_, green1_, green2_},
                {green3_, green1_, green1_, green1_, green2_, green2_, green1_, green1_, green1_, green1_, green1_, green1_, green2_, green1_, green1_, green2_},
                {green3_, green1_, green1_, green1_, green2_, green2_, green1_, green1_, green1_, green1_, green1_, green1_, green2_, green1_, green1_, green2_},
                {green3_, green1_, green1_, green1_, green2_, green2_, green1_, green1_, green1_, green1_, green1_, green1_, green2_, green1_, green1_, green2_},
                {green3_, green1_, green1_, green1_, green2_, green2_, green1_, green1_, green1_, green1_, green1_, green1_, green2_, green1_, green1_, green2_},
                {green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_},
                {skyBlue, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_}};
        return block;
    }

    //number 15 block
    public Color[][] getTopRightPipelineBlock() {
        Color[][] block = {
                {green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_},
                {green1_, green1_, green1_, green1_, green1_, green1_, green1_, green1_, green1_, green1_, green1_, green1_, green1_, green1_, green1_, green3_},
                {green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green3_},
                {green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green1_, green2_, green1_, green1_, green3_},
                {green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green1_, green2_, green1_, green1_, green1_, green3_},
                {green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green1_, green2_, green1_, green1_, green3_},
                {green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green1_, green2_, green1_, green1_, green1_, green3_},
                {green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green1_, green2_, green1_, green1_, green3_},
                {green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green1_, green2_, green1_, green1_, green1_, green3_},
                {green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green1_, green2_, green1_, green1_, green3_},
                {green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green1_, green2_, green1_, green1_, green1_, green3_},
                {green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green1_, green2_, green1_, green1_, green3_},
                {green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green1_, green2_, green1_, green1_, green1_, green3_},
                {green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green2_, green1_, green2_, green1_, green1_, green3_},
                {green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_},
                {green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, green3_, skyBlue}};
        return block;
    }
}
