package tennis;

import java.awt.Color;
import java.awt.Graphics2D;

public class Ball {

    private int x;

    private int y;

    private int xMovement;

    private int yMovement;

    private int ballSize;

    private Game game;

    public Ball(int ballSize, int movementSpeed, Game game) {
        x = 0;
        y = 0;
        xMovement = movementSpeed;
        yMovement = movementSpeed;
        this.game = game;
        this.ballSize = ballSize;
    }

    public void moveBall() {

        if ((x + xMovement < 0) || (x + xMovement > game.getWidth() - ballSize))
            xMovement = -xMovement;
        if ((y + yMovement < 0) || (y + yMovement > game.getHeight() - ballSize))
            yMovement = -yMovement;

        x += xMovement;
        y += yMovement;

    }

    public void paint(Graphics2D g) {
        g.setColor(Color.RED);
        g.fillOval(this.x, this.y, ballSize, ballSize);
    }

}
