package SuperPackage;

import AnimalClass1.MainAnimalClass;

public class Eel {
	
	public int ReleaseElectricCharge;
	
	
	MainAnimalClass main = new MainAnimalClass();


	public int getReleaseElectricCharge() {
		return ReleaseElectricCharge;
	}


	public void setReleaseElectricCharge(int releaseElectricCharge) {
		ReleaseElectricCharge = releaseElectricCharge;
	}


	public MainAnimalClass getMain() {
		return main;
	}


	public void setMain(MainAnimalClass main) {
		this.main = main;
	}

}
