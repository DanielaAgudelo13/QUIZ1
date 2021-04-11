package modelo;

import processing.core.PApplet;

public class Cuadrado extends Figura {

	public Cuadrado(int posX, int posY, int tamano, int valor, int dirX, int dirY, boolean quieto, PApplet app) {
		super(posX, posY, tamano, valor, dirX, dirY, quieto, app);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pintar() {
		app.fill(0,0,155);
		app.rect(posX, posY, tamano, tamano);
		
	}

	@Override
	public void mover() {
		
		
	}

	

}
