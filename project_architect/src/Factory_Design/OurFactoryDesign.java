package Factory_Design;

public class OurFactoryDesign {
	
	public static Computer getComputer(String type, String ram, String hdd) {
		
		if("PC".equalsIgnoreCase(type)) {
			return new PC(ram, hdd);
		
		}
		else if ("Server".equalsIgnoreCase(type)) {
			return new Server(ram, hdd);
		}
		return null;
	}
}
