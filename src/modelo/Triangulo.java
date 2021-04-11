package modelo;

import processing.core.PApplet;

public class Triangulo extends Figura {

	public Triangulo(int posX, int posY, int tamano, int valor, int dirX, int dirY, boolean quieto, PApplet app) {
		super(posX, posY, tamano, valor, dirX, dirY, quieto, app);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pintar() {
		app.fill(255,0,0);
		app.triangle(posX, posY, posX+50, posY-80, posX+100, posY);
		
	}

	@Override
	public void mover() {
		
		
	}
	


}