package tennis;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Paddle implements KeyListener {

    private int xMovement;

    private int x;

    private int paddleWidth;

    private int paddleHeight;

    private Game game;

    public Paddle(int paddleWidth, int paddleHeight, Game game) {
        this.paddleHeight = paddleHeight;
        this.paddleWidth = paddleWidth;
        this.game = game;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
            xMovement = -1;
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            xMovement = 1;

    }

    @Override
    public void keyReleased(KeyEvent arg0) {
        xMovement = 0;

    }

    @Override
    public void keyTyped(KeyEvent arg0) {
        // TODO Auto-generated method stub

    }

    public void paint(Graphics2D g) {
        g.setColor(Color.BLACK);
        g.fillRect(x, game.getHeight() - paddleHeight, paddleWidth, paddleHeight);
    }

    public void movePaddle() {
        if (x + xMovement > 0 && x + xMovement < game.getWidth() - paddleWidth)
            x += xMovement;
    }

}
