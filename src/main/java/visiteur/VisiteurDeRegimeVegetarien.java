package visiteur;

import ingredients.Agneau;
import ingredients.Crevette;
import ingredients.Fromage;
import ingredients.GaletteDeSarrasin;
import ingredients.Oignon;
import ingredients.Pain;
import ingredients.Salade;
import ingredients.Sauce;
import ingredients.Thon;
import ingredients.Tomate;

public class VisiteurDeRegimeVegetarien implements VisiteurDeRegime {

	public boolean visiter(Agneau agneau) {
		return false;
	}

	public boolean visiter(Crevette crevette) {
		return false;
	}

	public boolean visiter(Fromage fromage) {
		return true;
	}

	public boolean visiter(Oignon oignon) {
		return true;
	}

	public boolean visiter(Pain pain) {
		return true;
	}

	public boolean visiter(Salade salade) {
		return true;
	}

	public boolean visiter(Sauce sauce) {
		return true;
	}

	public boolean visiter(Thon thon) {
		return false;
	}

	public boolean visiter(Tomate tomate) {
		return true;
	}

	public boolean visiter(GaletteDeSarrasin galetteDeSarrasin) {
		return false;
	}

}
