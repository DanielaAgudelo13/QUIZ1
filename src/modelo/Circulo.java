package modelo;

import processing.core.PApplet;

public class Circulo extends Figura {

	public Circulo(int posX, int posY, int tamano, int valor, int dirX, int dirY, boolean quieto, PApplet app) {
		super(posX, posY, tamano, valor, dirX, dirY, quieto, app);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pintar() {
		app.fill(0,155,0);
		app.ellipse(posX, posY, tamano, tamano);
		
	}


}
