package tennis;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Game extends JPanel {

    private static int xDimension = 0;

    private static int yDimension = 0;

    public Ball ball;

    public Paddle paddle;

    public Game() {
        this.paddle = new Paddle(60, 10, this);
        this.ball = new Ball(30, 1, this);
    }

    public static void main(String[] args) throws InterruptedException {

        JFrame jframe = new JFrame("Table Tennis");

        Game game = new Game();

        jframe.addKeyListener(game.paddle);
        jframe.setFocusable(true);

        xDimension = 400;
        yDimension = 500;

        jframe.add(game);
        jframe.setSize(xDimension, yDimension);
        jframe.setVisible(true);
        jframe.setBackground(Color.WHITE);
        
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
            game.move();
            game.repaint();
            Thread.sleep(4);
        }

    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        ball.paint(g2d);
        paddle.paint(g2d);
    }

    private void move() {
        ball.moveBall();
        paddle.movePaddle();
    }

    public void gameOver() {
        JOptionPane.showMessageDialog(this, "Game Over", "Game Over", JOptionPane.YES_NO_OPTION);
        System.exit(ABORT);
    }

}
