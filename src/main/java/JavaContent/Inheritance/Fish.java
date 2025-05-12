package JavaContent.Inheritance;

public class Fish extends Animal {
    private int fins;
    private int gills;

    public Fish(String type, String size, double weight, int fins, int gills) {
        super(type,size, weight);
        this.fins = fins;
        this.gills = gills;
    }

    private void moveMuscles(){
        System.out.print("Muscles moving");
    }

    private void moveBackFin(){
        System.out.print("Backfin moving");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                "}" +super.toString();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
         moveMuscles();
         if (speed == "fast"){
             moveBackFin();
         }
        System.out.println();
    }
}
