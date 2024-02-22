package peaksoft;

public class Shark extends Animal {
    private String name = "Shark";

    public String getName() {
        return name;
    }

    public void attack() {
        System.out.println("Shark attacks");
    }
}
