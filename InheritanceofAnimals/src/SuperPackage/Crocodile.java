package SuperPackage;

import AnimalClass1.MainAnimalClass;

public class Crocodile {
	
	public int HardShelledEggs;
//	public int ShowInfo;
	
	
	public void ShowInfo() {
		
		MainAnimalClass main = new MainAnimalClass();
		
	}


	public Crocodile(int hardShelledEggs) {
	super();
	HardShelledEggs = 100;
}


	@Override
	public String toString() {
		return "Crocodile [HardShelledEggs=" + HardShelledEggs + "]";
	}


	public int getHardShelledEggs() {
		return HardShelledEggs;
	}


	public void setHardShelledEggs(int hardShelledEggs) {
		HardShelledEggs = hardShelledEggs;
	}
	

}
