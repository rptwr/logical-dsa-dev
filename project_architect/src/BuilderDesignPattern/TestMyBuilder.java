package BuilderDesignPattern;

public class TestMyBuilder {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("5GB RAM", "2TB HDD").build();
//        System.out.println(computer);

        Computer pc = new Computer.ComputerBuilder("5GB RAM", "2TB HDD").setGraphicCardNeeded(true).build();
        System.out.println(pc);
    }
}