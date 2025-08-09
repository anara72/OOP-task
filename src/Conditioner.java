public class Conditioner {
    String brand;
    String model;
    String color;
    String mini_conditioner;
    int price;


    public Conditioner(String brand) {
        this.brand = brand;
    }

    public Conditioner(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Conditioner(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public Conditioner(String brand, String model, String color, String mini_conditioner) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.mini_conditioner = mini_conditioner;
    }

    public Conditioner(String brand, String model, String color, String mini_conditioner, int price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.mini_conditioner = mini_conditioner;
        this.price = price;
    }

    public void getInfoConditioner() {
        System.out.println("Brand :");
        System.out.println("brand :" + brand + "\n" +
                "model :" + model + "\n" +
                "color :" + color + "\n" +
                "mini_conditioner :" + "\n" +
                "price :" + price);
    }
}