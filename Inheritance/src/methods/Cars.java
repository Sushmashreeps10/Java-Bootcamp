package methods;

public class Cars {
	
	private String doors;
	private String engine;
	private String drivers;
	private int speed;
	
	
	public Cars(String doors, String engine, String drivers, int speed) {
		// TODO Auto-generated constructor stub
	}
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getDrivers() {
		return drivers;
	}
	public void setDrivers(String drivers) {
		this.drivers = drivers;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
    public String run() {
		 if(doors.equals("closed") && drivers.equals("seated")
					&& engine.equals("on") && speed > 0) {
				return "running";
			} else {
				return "Not running";
			}
	
	
}

	

}
