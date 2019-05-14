import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class StatusBar implements Drawable {

    protected static int statusBarPixels = 80;
    protected int initPixelPosY;
    private List<Movable> movables;
    private Warrior warrior;
    private static boolean battle;

    public StatusBar(List<Movable> movables) {
        this.initPixelPosY = Matrix.getLenght() * Tile.tilePixels + 20;
        this.movables = movables;
        this.battle = false;
    }

    public static void setBattle(boolean status) {
        battle = status;
    }

    @Override
    public void draw(Graphics graphics) {

        graphics.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));

        for (Movable movable : this.movables) {
            if (movable instanceof Warrior){
                this.warrior = (Warrior) movable;
                graphics.drawString("Hero: (Level " + ((Warrior) movable).getLevel() + ")\t HP: " +
                        ((Warrior) movable).getCurrentHealthPoint() + "/" + ((Warrior) movable).getMaxHealthPoint() +
                        "\t|\tDP: " + ((Warrior) movable).getDefendPoint() + "\t|\tSP: " +
                        ((Warrior) movable).getStrikePoint() + ", " + movable.getCurrentPositionXY()[0] +
                        " " + this.warrior.getCurrentPositionXY()[1], 0, this.initPixelPosY);
            }
            if (movable instanceof Boss && Arrays.equals(movable.getCurrentPositionXY(), this.warrior.currentPositionXY)){
                graphics.drawString("Boss: (Level " + ((Boss) movable).getLevel() + ")\t HP: " +
                        ((Boss) movable).getCurrentHealthPoint() + "/" + ((Boss) movable).getMaxHealthPoint() +
                        "\t|\tDP: " + ((Boss) movable).getDefendPoint() + "\t|\tSP: " +
                        ((Boss) movable).getStrikePoint() + ", " + movable.getCurrentPositionXY()[0] +
                        " " + movable.getCurrentPositionXY()[1], 0, this.initPixelPosY + 20);
                drawBattleMessage(graphics,((Boss) movable).getCurrentHealthPoint());

            }
            if (movable instanceof Skeleton && Arrays.equals(movable.getCurrentPositionXY(), this.warrior.currentPositionXY)) {
                graphics.drawString("Skeleton: (Level " + ((Skeleton) movable).getLevel() + ")\t HP: " +
                        ((Skeleton) movable).getCurrentHealthPoint() + "/" + ((Skeleton) movable).getMaxHealthPoint() +
                        "\t|\tDP: " + ((Skeleton) movable).getDefendPoint() + "\t|\tSP: " +
                        ((Skeleton) movable).getStrikePoint(), 0, this.initPixelPosY + 20);
                drawBattleMessage(graphics,((Skeleton) movable).getCurrentHealthPoint());
            }
        }
    }

    private void drawBattleMessage(Graphics graphics, int enemyHealth){
        drawTransRectangle(graphics);
        graphics.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        graphics.setColor(Color.red);
        if (battle){
            graphics.drawString( "Hero: " + this.warrior.getCurrentHealthPoint() + "<<SPACE>> for attack" + "\nEnemy:" + enemyHealth, 90,
                    this.initPixelPosY - Matrix.getLenght() * Tile.tilePixels/2 - 15);
        } else {
            graphics.drawString("PRESS << SPACE >> FOR BATTLE", 90,
                    this.initPixelPosY - Matrix.getLenght() * Tile.tilePixels / 2 - 15);
        }
    }

    private void drawTransRectangle(Graphics graphics){
        Color myColour = new Color(0, 0, 0, 127);
        graphics.setColor(myColour);
        graphics.fillRect(0, Matrix.getLenght() * Tile.tilePixels/2 - 40,
                Matrix.getLenght() * Tile.tilePixels, 80);
        }
}
