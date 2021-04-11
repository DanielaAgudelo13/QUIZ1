package vista;

import control.Control;
import processing.core.PApplet;

public class Main extends PApplet {
	Control control;

	public static void main(String[] args) {
		PApplet.main("vista.Main");

	}

	public void settings () {
		size (700, 700);
	}
	
	public void setup ()  {
		control = new Control (this);
		control.cargarObjeto();
	}
	
	public void draw () {
		background (255);
		control.pintar();
		control.chocar();
		
	}
	
	public void mousePressed() {
		control.detener();
	}
	
}
