package JavaContent.ClassAndObjects;

public class Dog {
    private static String name;

    public Dog(String name){
        Dog.name = name;
    }
    public  void printName(){
        System.out.println("Name: "+ name );
    }
}