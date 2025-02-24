package AnimalClass1;

public class Fish extends MainAnimalClass{
	public int LiveINwater;
	public int HasGills;
	public int getLiveINwater() {
		return LiveINwater;
	}
	public void setLiveINwater(int liveINwater) {
		LiveINwater = liveINwater;
	}
	public int getHasGills() {
		return HasGills;
	}
	public void setHasGills(int hasGills) {
		HasGills = hasGills;
	}
	@Override
	public String toString() {
		return "Fish [LiveINwater=" + LiveINwater + ", HasGills=" + HasGills + "]";
	}
	//constructure
	public Fish(int liveINwater, int hasGills) {
		super();
		LiveINwater = 50;
		HasGills = 60;
	}
	

}
