package Factory_Design;

public abstract class Computer {
	public abstract String getRam();
	public abstract String getHDD();
	@Override
	public String toString() {
		return "Computer [getRam()=" + getRam() + ", getHDD()=" + getHDD() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
