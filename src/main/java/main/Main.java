package main;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many pets do you have?");
        int numOfPets = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What are the types of pets you have?");
        String[] typesOfPets = scanner.nextLine().split(" ");

        System.out.println("What are each of their names?");
        String[] namesOfPets = scanner.nextLine().split(" ");

        PetLab[] pets = new PetLab[numOfPets];

        for(int i = 0; i < numOfPets; i++){
            switch (typesOfPets[i].toLowerCase()){
                case "dog":

                    pets[i] = new Dog(namesOfPets[i]);

                    break;
                case "cat":

                    pets[i] = new Cat(namesOfPets[i]);

                    break;
                case "bird":
                    pets[i] = new Bird(namesOfPets[i]);
                    break;
            }
        }
        for(PetLab pet : pets){
            System.out.println(pet.getName() + " Says " + pet.makeSound());
        }
    }
}