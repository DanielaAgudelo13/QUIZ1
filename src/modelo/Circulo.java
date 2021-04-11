package modelo;

import processing.core.PApplet;

public class Circulo extends Figura {

	public Circulo(int posX, int posY, int tamano, int valor, int dirX, int dirY, boolean quieto, PApplet app) {
		super(posX, posY, tamano, valor, dirX, dirY, quieto, app);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pintar() {
		int randomR = (int) app.random(0, 256);
		int randomG = (int) app.random(0, 256);
		int randomB = (int) app.random(0, 256);
		app.fill(randomR, randomG, randomB);
		app.ellipse(posX, posY, tamano, tamano);
		app.fill(255);
		app.textAlign(app.CENTER, app.CENTER);
		app.textSize(tamano - tamano / 2);
		app.text(valor, posX, posY);
		
	}


}
