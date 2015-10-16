package tennis.flow;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import tennis.components.impl.Ball;
import tennis.components.impl.Paddle;

public class GameController extends JPanel {

    private static final long serialVersionUID = 1L;

    private Ball ball;

    private Paddle paddle;

    public GameController() {
        this.paddle = new Paddle(60, 10, this);
        this.ball = new Ball(30, 1, this);
        this.setBackground(Color.WHITE);
    }

    public Ball getBall() {
        return ball;
    }

    public Paddle getPaddle() {
        return paddle;
    }

    public void runGameFlow() throws InterruptedException {
        while (true) {
            move();
            paint(getGraphics());
            Thread.sleep(4);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        ball.paint(g2d);
        paddle.paint(g2d);
    }

    private void move() {
        //        ball.moveBall();
        //        paddle.movePaddle();
    }

    public void gameOver() {
        JOptionPane.showMessageDialog(this, "Game Over", "Game Over", JOptionPane.YES_NO_OPTION);
        System.exit(ABORT);
    }
}
