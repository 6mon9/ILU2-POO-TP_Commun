package control;

public abstract class Reservation {
	private int jour;
	private int mois;
	
	public Reservation(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}
	public abstract String reserver();
	
}
