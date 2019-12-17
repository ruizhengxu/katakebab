package kebab;

import java.util.List;

import ingredients.Ingredient;
import visiteur.VisiteurDeRegime;
import visiteur.VisiteurDeRegimePescetarien;
import visiteur.VisiteurDeRegimeSansGluten;
import visiteur.VisiteurDeRegimeVegetarien;

public class Kebab {
	
	List<Ingredient> ingredients;

	public Kebab(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public List<Ingredient> listerLesIngredients() {
		return this.ingredients;
	}

	public boolean estVegetarien() {
		VisiteurDeRegime visiteur = new VisiteurDeRegimeVegetarien();
		for(Ingredient ing : this.ingredients) {
			if (!ing.accepter(visiteur)) {
				return false;
			}
		}
		return true;
	}

	public boolean estPescetarien() {
		VisiteurDeRegime visiteur = new VisiteurDeRegimePescetarien();
		for(Ingredient ing : this.ingredients) {
			if (!ing.accepter(visiteur)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean estSansGluten() {
		VisiteurDeRegime visiteur = new VisiteurDeRegimeSansGluten();
		for(Ingredient ing : this.ingredients) {
			if (!ing.accepter(visiteur)) {
				return false;
			}
		}
		return true;
	}

	
}
