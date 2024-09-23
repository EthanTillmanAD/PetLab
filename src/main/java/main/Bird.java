package main;

public class Bird extends PetLab{


    public Bird(String name){
        this.name = name;

    }
    @Override
    public String makeSound(){
        return "Chirp Chirp";
    }
}