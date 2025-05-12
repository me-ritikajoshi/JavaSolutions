package JavaContent.Inheritance;

public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public Dog(){
        super("Mutt", "Small", 50);
    }


    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight <15 ? "small" : (weight <35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise() {

    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs move, run and wag their tail");
        if (speed == "slow"){
            walk();
            wagTail();
        }else{
            run();
            bark();
        }
        System.out.println();
    }

    private void bark(){
        System.out.print("Woof!");
    }

    private void run(){
        System.out.print("Running!");
    }

    private void walk(){
        System.out.print("Walking!");
    }

    private void wagTail(){
        System.out.print("Wagging!");
    }
}
