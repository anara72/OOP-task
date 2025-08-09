import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println();
        University[] universities = new University[3];
        University university1 = new University();
        university1.setName("Manas");
        university1.setSpecialties("It");
        university1.setEstablishedYear(1997);

        University university2 = new University();
        university2.setName("Ala Too");
        university2.setSpecialties("England");
        university2.setEstablishedYear(2000);

        University university3 = new University();
        university3.setName("KTY");
        university3.setSpecialties("It");
        university3.setEstablishedYear(1965);

        universities[0] = university1;
        universities[1] = university2;
        universities[2] = university3;

        System.out.println("--------------University----------");
        for (
                University uni : universities) {
            uni.printInfo();
        }


        School[] schools = new School[3];
        School schools1 = new School();
        schools1.setName("Sapat school");
        schools1.setNameAdrres("Baxa");
        schools1.setPrice(30000);

        School schools2 = new School();
        schools2.setName("IT school");
        schools2.setNameAdrres("Gragdanckai");
        schools2.setPrice(18000);

        School schools3 = new School();
        schools3.setName("Compas");
        schools3.setNameAdrres("Chui");
        schools3.setPrice(25000);

        schools[0] = schools1;
        schools[1] = schools2;
        schools[2] = schools3;

        System.out.println("-------------schools------------");
        for (
                School sch : schools) {
            sch.getInfo();
        }

        Car[] cars = new Car[3];

        Car car1 = new Car();
        car1.setBrand("Mersedes");
        car1.setColor("Blek");
        car1.setPrice(50018);

        Car car2 = new Car();
        car2.setBrand("BMW");
        car2.setColor("Writ");
        car2.setPrice(200000);

        Car car3 = new Car();
        car3.setBrand("Tesla");
        car3.setColor("Red");
        car3.setPrice(100000);


        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;


        System.out.println("--------------Car--------");
        for (
                Car car : cars) {
            car.printInfo();
        }


        Person[] people = new Person[3];

        Person people1 = new Person();
        people1.setName("Anara");
        people1.setFirstName("Jakbalieba");
        people1.setAge(50);

        Person people2 = new Person();
        people2.setName("Saikal");
        people2.setFirstName("Kasimalieba");
        people2.setAge(22);

        Person people3 = new Person();
        people2.setName("Aizat");
        people2.setFirstName("Duisheba");
        people2.setAge(22);

        Person people4 = new Person();
        people3.setName("Asel");
        people3.setFirstName("Urmatoba");
        people3.setAge(29);



        people[0] = people1;
        people[1] = people2;
        people[2] = people3;
        System.out.println("------------Person---------");
        for (
                Person person : people) {
            person.getInfo();
            System.out.println();
        }
    }
}


//my person
//        String[] lessons = {"constructor", "array", "method"};
//        MyPersonClass myPerson = new MyPersonClass("Anara", " Jakibalieda", 50, lessons, "plov");
//        MyPersonClass myPerson1 = new MyPersonClass("Anara", "Jakibalieda", 50);
//        myPerson.getMyPerson();
//        myPerson.showLessons();
//        myPerson1.getMyPerson();

//
//
//

//        Task 3 Aizat
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Brand :");
//        String brand1 = scanner.nextLine();
//        Conditioner conditioner = new Conditioner(brand1);
//
//        System.out.println("Brant :");
//        String brand2 = scanner.nextLine();
//        System.out.println("Model :");
//        String model2 = scanner.nextLine();
//        Conditioner conditioner2 = new Conditioner(brand2, model2);
//
//
//        System.out.println("Brand :");
//        String brand3 = scanner.nextLine();
//        System.out.println("Model :");
//        String model3 = scanner.nextLine();
//        System.out.println("Color :");
//        String color3 = scanner.nextLine();
//        Conditioner conditioner3 = new Conditioner(brand3, model3, color3);
//
//
//        System.out.println("Brant :");
//        String brand4 = scanner.nextLine();
//        System.out.println("Model :");
//        String model4 = scanner.nextLine();
//        System.out.println("Color :");
//        String color4 = scanner.nextLine();
//        System.out.println("Mini_conditioner :");
//        String mini_conditioner4 = scanner.nextLine();
//        Conditioner conditioner4 = new Conditioner(brand4, model4, color4, mini_conditioner4);

//        System.out.println("Brant :");
//          String brand5 = scanner.nextLine();
//        System.out.println("Model :");
//        String model5 = scanner.nextLine();
//        System.out.println("Color :");
//       String color5 = scanner.nextLine();
//        System.out.println("Mini_conditioner :");
//        String mini_conditioner5 = scanner.nextLine();
//        System.out.println("Price:");
//        int price5 = scanner.nextInt();
//        Conditioner conditioner5 = new Conditioner(brand5, model5, color5, mini_conditioner5, price5);
//
//     System.out.println("-------------Conditioners---------");
//        conditioner.getInfoConditioner();
//        System.out.println();
//        conditioner2.getInfoConditioner();
//        System.out.println();
//        conditioner3.getInfoConditioner();
//        System.out.println();
//        conditioner4.getInfoConditioner();
//        System.out.println();
//       conditioner5.getInfoConditioner();
//    }}


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