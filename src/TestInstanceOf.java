class Parent{}

// Child class is child of Parent class
class Child extends Parent{}

public class TestInstanceOf {
    public static void main(String[] args) {

        // creating object of child class
        Child cobj = new Child();

        if (cobj instanceof Child){
            System.out.println("cobj is instance of Child class");
        }
        else {
            System.out.println("cobj  not instance of Child class");
        }


        if (cobj instanceof Parent){
            System.out.println("cobj is instance of Parent class");
        }
        else {
            System.out.println("cobj  not instance of Parent class");
        }

        // all the objects of child class return true for isinstance of all it ancestor classes


        if (cobj instanceof Object){
            System.out.println("cobj is instance of Object class");
        }
        else {
            System.out.println("cobj  not instance of Object class");
        }


    }

}
