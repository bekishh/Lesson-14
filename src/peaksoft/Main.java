// Polymorphism (Полиморфизм)
// 21-02-2024

package peaksoft;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Shark(), new Turtle(), new Eagle()};
        Animal animal = new Animal();

        Shark[] sharks = new Shark[1];
        Turtle[] turtles = new Turtle[2];
        Eagle[] eagles = new Eagle[3];

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Shark) {
                System.out.println("---------------- Shark ----------------");
                sharks[i] = (Shark) animals[i];
                sharks[i].attack();
                animal.eat(((Shark) animals[i]).getName());
            } else if (animals[i] instanceof Turtle) {
                System.out.println("---------------- Turtle ---------------");
                turtles[i] = (Turtle) animals[i];
                turtles[i].swim();
                animal.eat(((Turtle) animals[i]).getName());
            } else if (animals[i].getClass() == Eagle.class) {
                System.out.println("---------------- Eagle ----------------");
                eagles[i] = (Eagle) animals[i];
                eagles[i].fly();
                animal.eat(((Eagle) animals[i]).getName());
            }
        }
    }
}