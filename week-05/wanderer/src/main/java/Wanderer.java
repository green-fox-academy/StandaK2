import javax.swing.*;

public class Wanderer {
    public static void main(String[] args) {
        JFrame frame = new JFrame("RPG Game");
        Game game = new Game();
        frame.add(game);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        frame.addKeyListener(game);
    }
}
