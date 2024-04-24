package control;

public class FormulaireRestaurant extends Formulaire {
	private int nbPersonnes;
	private int numService;

	public FormulaireRestaurant(int jour, int mois, int nbPersonnes, int numService) {
		super(jour, mois);
		this.nbPersonnes = nbPersonnes;
		this.numService = numService;
	}
	
	
	
}
