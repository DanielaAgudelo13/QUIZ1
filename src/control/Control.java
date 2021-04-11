package control;

import java.util.ArrayList;

import modelo.Circulo;
import modelo.Cuadrado;
import modelo.Figura;
import modelo.Triangulo;
import processing.core.PApplet;

public class Control {

	ArrayList figuras = new ArrayList<Figura>();

	PApplet app;

	String[] data;

	public Control(PApplet app) {

		this.app = app;
		this.data = app.loadStrings("../data/hola.txt");
	}

	public void cargarObjeto() {
		for (int i = 0; i < data.length; i++) {

			String[] line = data[i].split(" ");
			String tipo = line[0];
			int tamano = Integer.parseInt(line[1]);
			int posX = Integer.parseInt(line[2]);
			int posY = Integer.parseInt(line[3]);
			int direccion = Integer.parseInt(line[4]);
			int valor = Integer.parseInt(line[5]);

			switch (tipo) {

			case "Cuadrado":
				Cuadrado cuadrado = new Cuadrado(posX, posY, tamano, valor, direccion, direccion, false, app);
				this.figuras.add(cuadrado);

				break;

			case "Circulo":
				Circulo circulo = new Circulo(posX, posY, tamano, valor, direccion, direccion, false, app);
				this.figuras.add(circulo);

				break;

			}
		}
	}

	public void pintar() {
		for (int i = 0; i < figuras.size(); i++) {
			((Figura) figuras.get(i)).pintar();
			((Figura) figuras.get(i)).mover();

		}
	}

	public void chocar() {
		for (int i = 0; i < figuras.size(); i++) {
			for (int j = 0; j < figuras.size(); j++) {
				Figura figuraI = (Figura) figuras.get(i);
				Figura figuraJ = (Figura) figuras.get(j);

				if (figuraI instanceof Circulo && figuraJ instanceof Cuadrado && app.dist(figuraI.getPosX(),
						figuraI.getPosY(), figuraJ.getPosX(), figuraJ.getPosY()) <= figuraJ.getTamano() / 2) {

					int random = (int) app.random(50, 201);

					figuras.add(new Triangulo(figuraI.getPosX(), figuraI.getPosY(), random,
							figuraI.getValor() + figuraJ.getValor(), figuraI.getDirX(), figuraI.getDirY(), false, app));
					figuras.remove(j);
					figuras.remove(i);
				}
			}
		}
	}

	public void detener() {
		for (int i = 0; i < figuras.size(); i++) {
			if (app.dist(app.mouseX, app.mouseY, ((Figura) figuras.get(i)).getPosX(),
					((Figura) figuras.get(i)).getPosY()) < ((Figura) figuras.get(i)).getTamano() / 2) {
				if (((Figura) figuras.get(i)).isQuieto()) {
					((Figura) figuras.get(i)).setQuieto(false);
				} else {
					((Figura) figuras.get(i)).setQuieto(true);
				}
			}
		}
	}

	public void crearObjeto() {
		if (app.mousePressed && (app.mouseButton == app.RIGHT)) {
			int random = (int) app.random(0, 2);
			int randomPosX = (int) app.random(2, 699);
			int randomPosY = (int) app.random(2, 699);
			int randomTam = (int) app.random(50, 201);
			int randomValue = (int) app.random(1, 21);

			switch (random) {
			case 0:
				figuras.add(new Circulo(randomPosX, randomPosY, randomTam, randomValue, 1, -1, false, app));
				break;
			case 1:
				figuras.add(new Cuadrado(randomPosX, randomPosY, randomTam ,randomValue, 1, -1, false, app));
				break;
			}
		}
	}

	public ArrayList getFiguras() {
		return figuras;
	}

	public void setFiguras(ArrayList figuras) {
		this.figuras = figuras;
	}

}
