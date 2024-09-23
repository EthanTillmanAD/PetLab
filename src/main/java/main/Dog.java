package main;

public class Dog extends PetLab {

    public Dog(String name) {
        this.name = name;

    }
    @Override
    public String makeSound(){
        return "Woof Woof";
    }
}
