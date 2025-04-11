package JavaContent.ClassAndObjects;

public class Dog {
    private static String name;
    private String breed;

    public Dog(String name, String breed){
        Dog.name = name;
        this.breed = breed;
    }
    public  void printName(){
        System.out.println("Name: "+ name );
        System.out.println("Breed: "+ breed);
    }


}