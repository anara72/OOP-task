import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Brand :");
        String brand1 = scanner.nextLine();
        Conditioner conditioner = new Conditioner(brand1);

        System.out.println("Brant :");
        String brand2 = scanner.nextLine();
        System.out.println("Model :");
        String model2 = scanner.nextLine();
        Conditioner conditioner2 = new Conditioner(brand2, model2);


        System.out.println("Brand :");
        String brand3 = scanner.nextLine();
        System.out.println("Model :");
        String model3 = scanner.nextLine();
        System.out.println("Color :");
        String color3 = scanner.nextLine();
        Conditioner conditioner3 = new Conditioner(brand3, model3, color3);


        System.out.println("Brant :");
        String brand4 = scanner.nextLine();
        System.out.println("Model :");
        String model4 = scanner.nextLine();
        System.out.println("Color :");
        String color4 = scanner.nextLine();
        System.out.println("Mini_conditioner :");
        String mini_conditioner4 = scanner.nextLine();
        Conditioner conditioner4 = new Conditioner(brand4, model4, color4, mini_conditioner4);


        System.out.println("Brant :");
        String brand5 = scanner.nextLine();
        System.out.println("Model :");
        String model5 = scanner.nextLine();
        System.out.println("Color :");
        String color5 = scanner.nextLine();
        System.out.println("Mini_conditioner :");
        String mini_conditioner5 = scanner.nextLine();
        System.out.println("Price:");
        int price5 = scanner.nextInt();
        Conditioner conditioner5 = new Conditioner(brand5, model5, color5, mini_conditioner5, price5);

        System.out.println("-------------Conditioners---------");
        conditioner.getInfoConditioner();
        System.out.println();
        conditioner2.getInfoConditioner();
        System.out.println();
        conditioner3.getInfoConditioner();
        System.out.println();
        conditioner4.getInfoConditioner();
        System.out.println();
        conditioner5.getInfoConditioner();
    }}

//         Task 1  Obekt
//        Conditioner conditioner = new Conditioner();
//        conditioner.brand = "LG";
//        conditioner.model = "Platinum";
//        conditioner.color = "Writ";
//        conditioner.mini_conditioner = "Smart";
//        conditioner.price = 10000;
//        System.out.println(
//                "brand " + conditioner.brand + "\n" +
//                        "model " + conditioner.model + "\n" +
//                        "color " + conditioner.color + "\n" +
//                        "mini_conditioner" + conditioner.mini_conditioner + "\n" +
//                        "price" + conditioner.price);
//
//
//    }
//}