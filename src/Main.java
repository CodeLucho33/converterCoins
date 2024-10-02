import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String pairConvertion="";
        boolean  isRepeatOperation =false;
        int amount=0;
        Scanner scanner = new Scanner(System.in);
            Request request = new Request();

        String menuTemplate = """
            1) Dollar ==> Argentine Peso
            2) Argentine Peso ==> Dollar
            3) Dollar ==> Brazilian Real
            4) Brazilian Real ==> Dollar
            5) Dollar ==> Colombian Peso
            6) Colombian Peso ==> Dollar
            7) Exit
        """;
        System.out.println(menuTemplate);
        int option = scanner.nextInt() ;
        while (option >=1 && option <=7){
            switch (option){

                case 1:
                    pairConvertion = "/USD/ARS";
                    System.out.println("Enter value to convert (USD->ARS):");
                    amount = scanner.nextInt();
                    request.getRequest(pairConvertion,amount);
                break;
                case 2:
                    pairConvertion = "/ARS/USD";
                    System.out.println("Enter value to convert (ARS->USD):");
                    amount = scanner.nextInt();
                    request.getRequest(pairConvertion,amount);
                break;
                case 3:
                    pairConvertion = "/USD/BRL";
                    System.out.println("Enter value to convert (USD->BRL):");
                    amount = scanner.nextInt();
                    request.getRequest(pairConvertion,amount);
                    break;
                case 4:
                    pairConvertion = "/BRL/USD";
                    System.out.println("Enter value to convert (BRL->USD):");
                    amount = scanner.nextInt();
                    request.getRequest(pairConvertion,amount);
                    break;
                case 5:
                    pairConvertion = "/USD/COP";
                    System.out.println("Enter value to convert (USD->COP):");
                    amount = scanner.nextInt();
                    request.getRequest(pairConvertion,amount);
                    break;
                case 6:
                    pairConvertion = "/COP/USD";
                    System.out.println("Enter value to convert: (COP->USD)");
                    amount = scanner.nextInt();
                    request.getRequest(pairConvertion,amount);
                    break;
                default:
                    System.out.println("Option invalid");
            }
            System.out.println(menuTemplate);
            option = scanner.nextInt();
        }
        System.out.println("Exited program.");
        scanner.close();

    }
}
