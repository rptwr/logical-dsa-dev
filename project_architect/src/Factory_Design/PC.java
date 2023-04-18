package Factory_Design;

public class PC extends Computer{
	
	private String ram;
	private String hdd;
	public PC(String ram, String hdd) {
		super();
		this.ram = ram;
		this.hdd = hdd;
	}
	
	@Override
	public String getRam() {
		return this.ram;
	}
	@Override
	public String getHDD() {
		return this.hdd;
	}
}
