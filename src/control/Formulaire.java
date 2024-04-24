package control;

public abstract class Formulaire {
	protected int jour;
	protected int mois;
	protected int numEntite;
	
	public Formulaire(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}
}
