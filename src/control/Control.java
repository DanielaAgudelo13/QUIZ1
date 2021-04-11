package control;

import java.util.ArrayList;

import modelo.Figura;
import processing.core.PApplet;

public class Control {
	
	ArrayList figuras = new ArrayList <Figura> ();
	
	PApplet app;
	
	
	String[] data;
	
	
	public Control (PApplet app) {
		
		this.app = app;
		this.data = app.loadStrings ("../data/hola.txt");
	}

	public void test () {
		for (int i = 0; i < data.length; i ++) {
			System.out.println(data[i]);
		}
	}
}
