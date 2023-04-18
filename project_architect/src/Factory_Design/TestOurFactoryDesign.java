package Factory_Design;

public class TestOurFactoryDesign {
	
	public static void main(String[] args) {
//		Computer PC = OurFactoryDesign.getComputer(type "PC", ram "512 GB", hdd "1 TB");
		Computer PC = OurFactoryDesign.getComputer("PC", "200GB",  "1 TB");
		System.out.println("Factory PC: " + PC);
	}
}
