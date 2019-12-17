package kebab;

import java.util.ArrayList;
import java.util.List;

import ingredients.Ingredient;

public class Assiette {
	
	List<Ingredient> ingredients = new ArrayList<Ingredient>();

	public Assiette avec(Ingredient ingredient) {
		this.ingredients.add(ingredient);
		return this;
	}

	public Kebab confectionnerKebab() {
		return new Kebab(this.ingredients);
	}
	
}
