import java.awt.*;

public class Block {
    Color red____ = new Color(255, 0, 0);
    Color brown__ = new Color(68, 22, 22);
    Color blue___ = new Color(0, 0, 255);
    Color skyBlue = new Color(0, 247, 255);
    Color yellow_ = new Color(255, 183, 0);

    public Color[][] getBrickBlock() {
        Color[][] block = {
                {brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__},
                {brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__},
                {brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__},
                {brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__},
                {brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__},
                {brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__},
                {brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__},
                {brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__},
                {brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__},
                {brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__},
                {brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__},
                {brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__},
                {brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__},
                {brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__},
                {brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__},
                {brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__, brown__},};
        return block;
    }

    public Color[][] getCoinBlock() {
        Color[][] block = {
                {red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, yellow_},
                {brown__, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, yellow_},
                {brown__, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, yellow_},
                {brown__, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, yellow_},
                {brown__, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, yellow_},
                {brown__, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, yellow_},
                {brown__, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, yellow_},
                {brown__, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, yellow_},
                {brown__, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, yellow_},
                {brown__, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, yellow_},
                {brown__, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, yellow_},
                {brown__, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, yellow_},
                {brown__, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, yellow_},
                {brown__, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, yellow_},
                {brown__, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, yellow_},
                {brown__, blue___, blue___, blue___, blue___, blue___, blue___, blue___, blue___, blue___, blue___, blue___, blue___, blue___, blue___, blue___},};
        return block;
    }

    public Color[][] getFloorBlock() {
        Color[][] block = {
                {red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, yellow_},
                {brown__, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, yellow_},
                {brown__, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, yellow_},
                {brown__, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, yellow_},
                {brown__, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, yellow_},
                {brown__, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, yellow_},
                {brown__, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, yellow_},
                {brown__, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, yellow_},
                {brown__, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, yellow_},
                {brown__, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, yellow_},
                {brown__, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, yellow_},
                {brown__, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, yellow_},
                {brown__, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, yellow_},
                {brown__, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, yellow_},
                {brown__, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, red____, yellow_},
                {brown__, blue___, blue___, blue___, blue___, blue___, blue___, blue___, blue___, blue___, blue___, blue___, blue___, blue___, blue___, blue___},};
        return block;
    }

    public Color[][] getQuestionBlock() {
        Color[][] block = {
                {yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_},
                {yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_},
                {yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_},
                {yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_},
                {yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_},
                {yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_},
                {yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_},
                {yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_},
                {yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_},
                {yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_},
                {yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_},
                {yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_},
                {yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_},
                {yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_},
                {yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_},
                {yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_, yellow_},};
        return block;
    }

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
                {skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue, skyBlue},};
        return block;
    }
}
