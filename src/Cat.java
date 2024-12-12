public class Cat extends Animal {

    public static int catNumber = 0;

    public Cat(String name) {
        super(name);
        catNumber++;
    }

    @Override
    public void run(int distance){
        if(distance >  200 )
            System.out.println("Cats runs in distance less than 200 meters");
        else
            super.run(distance);
    }

    @Override
    public void swim(int distance){
        System.out.println("The cat drowned");
    }

    public static int getCatNumber() {
        return catNumber;
    }
}
