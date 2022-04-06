import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner howMany = new Scanner(System.in);
        System.out.println("How many pets do you have?");

        int petAmount = howMany.nextInt();

        Pets[] petList = new Pets[petAmount];

        for(int i = 0; i < petAmount; i++){

            Scanner petType = new Scanner(System.in);
            System.out.println("What kind pets do you have?");
            String animal = petType.next();


            Scanner pName = new Scanner(System.in);
            System.out.println("What is your pet's name");
            String petName = pName.next();

            switch (animal.toLowerCase()){
                case "dog" :
                    Dog dog1 = new Dog(petName, animal);
                    petList[0] = dog1;
                    dog1.Sound();
                    break;
                case "cat" :
                    Cat cat1 = new Cat(petName, animal);
                    petList[1] = cat1;
                    cat1.Sound();
                    break;
                case "snake" :
                    Snake snake1 = new Snake(petName, animal);
                    petList[2] = snake1;
                    snake1.Sound();
                    break;
                default:
                    System.out.println("Try Dog, Cat or Snake");

            }

            System.out.println(Arrays.toString(petList));


        }
    }

}
