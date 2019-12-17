package visiteur;

import ingredients.*;

public interface VisiteurDeRegime {

	boolean visiter(Agneau ageau);
	boolean visiter(Crevette crevette);
	boolean visiter(Fromage fromage);
	boolean visiter(Oignon oignon);
	boolean visiter(Pain pain);
	boolean visiter(Salade salade);
	boolean visiter(Sauce sauce);
	boolean visiter(Thon thon);
	boolean visiter(Tomate tomate);
	boolean visiter(GaletteDeSarrasin galetteDeSarrasin);
}