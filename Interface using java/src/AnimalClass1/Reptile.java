package AnimalClass1;

public class Reptile extends MainAnimalClass {
	public int DrySkin;
	public int BackBone;
	public int SoftShelledEggs;
	public int getDrySkin() {
		return DrySkin;
	}
	public boolean setDrySkin(int drySkin) {
		if(DrySkin >= 30) {
			return true;
		}else {
			return false;
		}
//		DrySkin = 20;
	}
	public int getBackBone() {
		return BackBone;
	}
	public void setBackBone(int backBone) {
		BackBone = backBone;
	}
	public int getSoftShelledEggs() {
		return SoftShelledEggs;
	}
	public void setSoftShelledEggs(int softShelledEggs) {
		SoftShelledEggs = softShelledEggs;
	}
	@Override
	public String toString() {
		return "Reptile [DrySkin=" + DrySkin + ", BackBone=" + BackBone + ", SoftShelledEggs=" + SoftShelledEggs + "]";
	}
	public Reptile(int i, int j, int k) {
		super();
		DrySkin = 20;
		BackBone = 30;
		SoftShelledEggs = 40;
	}
	

}
