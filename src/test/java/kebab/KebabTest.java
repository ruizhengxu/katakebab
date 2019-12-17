package kebab;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import ingredients.Agneau;
import ingredients.Crevette;
import ingredients.Fromage;
import ingredients.GaletteDeSarrasin;
import ingredients.Ingredient;
import ingredients.Oignon;
import ingredients.Pain;
import ingredients.Salade;
import ingredients.Sauce;
import ingredients.Thon;
import ingredients.Tomate;

import static org.assertj.core.api.Assertions.*;

public class KebabTest {
	
	private Kebab kebabAgneau;
	private Kebab kebabVegetarien;
	private Kebab kebabCrevette;
	private Kebab kebabThon;
	private Kebab kebabGalette;

	private static final Ingredient TOMATE = new Tomate();
	private static final Ingredient AGNEAU = new Agneau();
	private static final Ingredient SAUCE = new Sauce();
	private static final Ingredient OIGNON = new Oignon();
	private static final Ingredient PAIN = new Pain();
	private static final Ingredient SALADE = new Salade();
	private static final Ingredient CREVETTE = new Crevette();
	private static final Ingredient THON = new Thon();
	private static final Ingredient FROMAGE = new Fromage();
	private static final Ingredient GALLETTEDESARRASIN = new GaletteDeSarrasin();
	
	@Before
	public void confectionnerLesKebabs() {
		this.kebabAgneau = new Assiette()
				.avec(PAIN)
				.avec(OIGNON)
				.avec(SAUCE)
				.avec(AGNEAU)
				.avec(TOMATE)
				.confectionnerKebab();
		
		this.kebabVegetarien = new Assiette()
				.avec(PAIN)
				.avec(SALADE)
				.avec(OIGNON)
				.avec(SAUCE)
				.avec(TOMATE)
				.confectionnerKebab();
		
		this.kebabCrevette = new Assiette()
				.avec(PAIN)
				.avec(SALADE)
				.avec(OIGNON)
				.avec(SAUCE)
				.avec(TOMATE)
				.avec(CREVETTE)
				.confectionnerKebab();
		
		this.kebabThon = new Assiette()
				.avec(PAIN)
				.avec(OIGNON)
				.avec(SAUCE)
				.avec(THON)
				.avec(FROMAGE)
				.avec(TOMATE)
				.confectionnerKebab();
		
		this.kebabGalette = new Assiette()
				.avec(GALLETTEDESARRASIN)
				.avec(AGNEAU)
				.avec(OIGNON)
				.avec(SALADE)
				.avec(SAUCE)
				.avec(TOMATE)
				.confectionnerKebab();
	}

	@Test
	public void un_kebab_contient_bien_tous_les_ingredients_ajoutes() {
		
		assertThat(kebabAgneau.listerLesIngredients()).containsExactly(PAIN, OIGNON, SAUCE, AGNEAU, TOMATE);
		assertThat(kebabVegetarien.listerLesIngredients()).containsExactly(PAIN, SALADE, OIGNON, SAUCE, TOMATE);
		assertThat(kebabCrevette.listerLesIngredients()).containsExactly(PAIN, SALADE, OIGNON, SAUCE, TOMATE, CREVETTE);
		assertThat(kebabThon.listerLesIngredients()).containsExactly(PAIN, OIGNON, SAUCE, THON, FROMAGE, TOMATE);
	}
	
	@Test
	public void un_kebab_agneau_ne_doit_pas_etre_un_kebab_vegetarien() {
		assertFalse(kebabAgneau.estVegetarien());
	}
	
	@Test
	public void un_kebab_vegetarien_est_un_kebab_vegetarien() {
		assertTrue(kebabVegetarien.estVegetarien());
	}
	
	@Test
	public void un_kebab_crevette_ne_doit_pas_etre_un_kebab_vegetarien() {
		assertFalse(kebabCrevette.estVegetarien());
	}
	
	@Test
	public void un_kebab_thon_ne_doit_pas_etre_un_kebab_vegetarien() {
		assertFalse(kebabThon.estVegetarien());
	}
	
	@Test
	public void un_kebab_agneau_ne_doit_pas_etre_un_kebab_pescetarien() {
		assertFalse(kebabAgneau.estPescetarien());
	}
	
	@Test
	public void un_kebab_vegetarien_est_un_kebab_pescetarien() {
		assertTrue(kebabVegetarien.estPescetarien());
	}
	
	@Test
	public void un_kebab_crevette_est_un_kebab_pescetarien() {
		assertTrue(kebabCrevette.estPescetarien());
	}
	
	@Test
	public void un_kebab_thon_est_un_kebab_pescetarien() {
		assertTrue(kebabThon.estPescetarien());
	}
	
	@Test
	public void un_kebab_thon_ne_doit_pas_être_un_kebab_sans_gluten() {
		assertFalse(kebabThon.estSansGluten());
	}
	
	@Test
	public void un_kebab_galette_est_un_kebab_sans_gluten() {
		assertTrue(kebabGalette.estSansGluten());
	}
}
