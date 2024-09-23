package main;

public class Cat extends PetLab{


    public Cat(String name){
        this.name = name;

    }
    @Override
    public String makeSound(){
        return "Meow Meow";
    }
}
