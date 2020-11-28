import java.util.Scanner;

public class Switchloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the command line: ");
        String st = sc.nextLine();

        switch (st){
            case "Fouzia":
                System.out.println("I am fouzia");
                break;
            case "Ria":
                System.out.println("I am not ria");
                break;
            default:
                System.out.println("Name not recognised");
        }
    }
}
