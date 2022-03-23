
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         String fruit = in.next();

//        if(fruit.equals("mango")){
//            System.out.println("King of fruit");
//        }
//        else if(fruit.equals("Banana")){
//            System.out.println("Pazham");
//        }


        // Enhanced switch statement
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Orange" -> System.out.println("Round fruit");
            default -> System.out.println("Unknown fruit");
        }

    }
}
