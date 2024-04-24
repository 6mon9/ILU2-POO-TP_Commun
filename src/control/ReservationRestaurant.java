package control;

public class ReservationRestaurant extends Reservation {
	private int nService;
	private int numTable;
	
	public ReservationRestaurant(int jour, int mois,int nService,int numTable) {
		super(jour, mois);
		this.nService = nService;
		this.numTable = numTable;
		// TODO Auto-generated constructor stub
	}

	
	public String toString() {
		String service ;
		if (nService==1) {
			service = "premier";
		}else {
			service = "deuxième";
		}
		return ("Le "+jour+"/"+mois+"\nTable "+numTable+" pour le "+service+" service.");
	}


}
