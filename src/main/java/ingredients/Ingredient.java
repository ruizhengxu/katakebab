package ingredients;

import lombok.EqualsAndHashCode;
import visiteur.VisiteurDeRegime;

@EqualsAndHashCode
public abstract class Ingredient {

	public abstract boolean accepter(VisiteurDeRegime visiteur);

}
