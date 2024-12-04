public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Tom");
        cat.run(201);
        cat.swim(10);

        Dog dog = new Dog("Jack");
        dog.run(201);
        dog.swim(10);


        Dog dog2 = new Dog("Snickers");
        dog2.run(600);
        dog2.swim(200);

        System.out.println(Cat.getCatNumber());
        System.out.println(Dog.getDogNumber());
        System.out.println(Animal.getAllAnimalNumber());
    }
}