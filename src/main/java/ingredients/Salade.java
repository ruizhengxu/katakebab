package ingredients;

import visiteur.VisiteurDeRegime;

public class Salade extends Ingredient {

	@Override
	public boolean accepter(VisiteurDeRegime visiteur) {
		return visiteur.visiter(this);		
	}

}
