public class Animal {

    private static int allAnimalNumber = 0;
    private String name = "";

    public Animal(String name) {
        this.name = name;
        allAnimalNumber++;
    }

    public void run(int distance) {
        System.out.println(this.name + " ran " + distance + " meters");
    }

    public void swim(int distance) {
        System.out.println(this.name + " swam " + distance + " meters");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static int getAllAnimalNumber() {
        return allAnimalNumber;
    }
}
