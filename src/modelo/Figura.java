package modelo;

import processing.core.PApplet;

public abstract class Figura {
	
		int posX;
		int posY; 
		int tamano;
		int valor;
		int dirX;
		int dirY; 
		boolean quieto;
		PApplet app;
		
	public Figura (int posX, int posY, int tamano, int valor, int dirX, int dirY, boolean quieto, PApplet app) {
		
		this.posX = posX; 
		this.posY = posY; 
		this.tamano = tamano;
		this.valor = valor;
		this.dirX = dirX;
		this.dirY = dirY;
		this.quieto = quieto;
		this.app = app; 
	
	}
	  
	public abstract void pintar ();
	
	public void mover () {
		posX += 2*dirX;
		posY += 2*dirY;
		if (posX <=0 || posX >=700) {
			this.dirX *=-1;
		}
		if (posY <=0 || posY >=700) {
			this.dirY *=-1;
		}
	}
	

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getDirX() {
		return dirX;
	}

	public void setDirX(int dirX) {
		this.dirX = dirX;
	}

	public int getDirY() {
		return dirY;
	}

	public void setDirY(int dirY) {
		this.dirY = dirY;
	}

	public boolean isQuieto() {
		return quieto;
	}

	public void setQuieto(boolean quieto) {
		this.quieto = quieto;
	}
	
	
}
