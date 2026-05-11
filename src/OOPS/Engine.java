package OOPS;

public class Engine {
	String type, torque,cylinder;
	
	Engine (String type,String torque,String cylinder){
		//L.I
		this.type = type;
		this.torque = torque;
		this.cylinder = cylinder;
	}
	
	public void detailofEngine() {
		System.out.println("Type of Engine:"+type);
		System.out.println("Torque of Engine:"+torque);
		System.out.println("No of Cylinder:"+cylinder);
		System.out.println("***************************");
	}
}
