import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();

        switch (empId){
            case 1->
                System.out.println("1 is in unknown dept");
            case 2 ->
                System.out.println("2 is in unknown dept");
            case 3 ->{
                switch (department) {
                    case "IT" -> System.out.println("3 is in IT");
                    case "HR" -> System.out.println("3 is in HR");
                }
                }
        }
    }
}
