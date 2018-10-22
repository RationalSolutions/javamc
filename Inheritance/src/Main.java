public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal(1,1,25,35, "Animal");

        Dog dog = new Dog(1, 20, "Yorkie", 2, 4, 1, 20, "Silky");

        dog.eat();
        dog.walk();
        dog.run();
    }

}
