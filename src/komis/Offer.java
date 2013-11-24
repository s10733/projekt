package komis;

import java.util.List;

import komis.db.EntityBase;

public class Offer extends EntityBase {

	// relacja Oferta-Obejrzane
	private Saw saw;

	// relacja Oferta - Transakcja
	private Transaction transactions;
	
	private double price;
	
	//relacja Ofeta-Auta
	private List<Car> cars;	
	
	
	public Transaction getTransactions() {
		return transactions;
	}

	public void setTransactions(Transaction transactions) {
		this.transactions = transactions;
	}

		
		public Saw getSaw() {
		return saw;
	}

	public void setSaw(Saw saw) {
		this.saw = saw;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

			
}
