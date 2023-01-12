package arrayListTask;

public class Fruit {

	private String FruitName;
	private int pirce;
	
	public Fruit() {;}

	public String getFruitName() {
		return FruitName;
	}

	public void setFruitName(String fruitName) {
		FruitName = fruitName;
	}

	public int getPirce() {
		return pirce;
	}

	public void setPirce(int pirce) {
		this.pirce = pirce;
	}

	@Override
	public String toString() {
		return "Fruit [FruitName=" + FruitName + ", pirce=" + pirce + "]";
	}
	
	
}
