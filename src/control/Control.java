package control;

import java.util.ArrayList;

import modelo.Circulo;
import modelo.Cuadrado;
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

	public void cargarObjeto () {
		for (int i = 0; i < data.length; i ++) {
			
			String [] line = data[i].split(" ");
			String tipo = line[0];
			int tamano = Integer.parseInt(line [1]);
			int posX = Integer.parseInt(line [2]);
			int posY = Integer.parseInt(line [3]);
			int direccion = Integer.parseInt(line [4]);
			int valor = Integer.parseInt(line [5]);
			
			
			switch (tipo) {
			
			case "Cuadrado":
				Cuadrado cuadrado = new Cuadrado (posX, posY,tamano, valor, direccion, direccion, true, app);
				this.figuras.add(cuadrado);
				
				break;
				
			case "Circulo":
				Circulo circulo = new Circulo (posX, posY,tamano, valor, direccion, direccion, true, app);
				this.figuras.add(circulo);
				
				break;
		
			}
		}
	}
	
	public void pintar () {
		for (int i = 0; i < figuras.size();i ++) {
			((Figura) figuras.get(i)).pintar();
			((Figura) figuras.get(i)).mover();
			
		}
	}

	public ArrayList getFiguras() {
		return figuras;
	}

	public void setFiguras(ArrayList figuras) {
		this.figuras = figuras;
	}
	
		
}
