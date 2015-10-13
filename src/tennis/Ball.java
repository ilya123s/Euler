package tennis;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Ball {

	private int x;

	private int y;

	private int xMovement;

	private int yMovement;

	private int ballDiameter;

	private Game game;

	public Ball(int ballSize, int movementSpeed, Game game) {
		x = 0;
		y = 0;
		xMovement = movementSpeed;
		yMovement = movementSpeed;
		this.game = game;
		this.ballDiameter = ballSize;
	}

	public void moveBall() {

		if ((x + xMovement < 0)
				| (x + xMovement > game.getWidth() - ballDiameter))
			xMovement = -xMovement;

		if (y + yMovement > game.getHeight() - ballDiameter)
			game.gameOver();

		if ((y + yMovement < 0))
			yMovement = -yMovement;

		if (collision()) {
			yMovement = -yMovement;
			y = game.paddle.getPaddleHeightPosition() - ballDiameter;
		}

		x += xMovement;
		y += yMovement;

	}

	public void paint(Graphics2D g) {
		g.setColor(Color.RED);
		g.fillOval(this.x, this.y, ballDiameter, ballDiameter);
	}

	public Rectangle getBounds() {
		return new Rectangle(x, y, ballDiameter, ballDiameter);

	}

	private boolean collision() {
		return game.paddle.getBounds().intersects(getBounds());
	}

}
