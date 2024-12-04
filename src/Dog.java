public class Dog extends Animal {

    public static int dogNumber = 0;

    public Dog(String name) {
        super(name);
        dogNumber++;
    }

    @Override
    public void run(int distance){
        if(distance >  500)
            System.out.println("Dogs runs in distance less than 500 meters");
        else
            super.run(distance);
    }

    @Override
    public void swim(int distance){
        if(distance >  10)
            System.out.println("Dogs swims in distance less than 10 meters");
        else
            super.swim(distance);
    }

    public static int getDogNumber() {
        return dogNumber;
    }
}
