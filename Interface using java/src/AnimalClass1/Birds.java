package AnimalClass1;

public class Birds extends MainAnimalClass {
	public int AnimalWithFeaters;
	public int CanFly;
	public int getAnimalWithFeaters() {
		return AnimalWithFeaters;
	}
	public void setAnimalWithFeaters(int animalWithFeaters) {
		AnimalWithFeaters = animalWithFeaters;
	}
	public int getCanFly() {
		return CanFly;
	}
	public void setCanFly(int canFly) {
		CanFly = canFly;
	}
	@Override
	public String toString() {
		return "Birds [AnimalWithFeaters=" + AnimalWithFeaters + ", CanFly=" + CanFly + "]";
	}
	public Birds(int animalWithFeaters, int canFly) {
		super();
		AnimalWithFeaters = 100;
		CanFly = 200;
	}
	

}
