public class Car{
    private String brand;
    private String color;
    private int price;


  public String getBrand () {
      return brand;
  }
  public String getColor(){
      return color;
  }
  public int getPrice(){
       return price;

  }

  public void setBrand(String brand) {
      this.brand = brand;

  }
   public void setColor(String color){
       this.color = color;
   }
   public void setPrice(int price){
       this.price = price;
   }
   public void printInfo(){
    System.out.println("brand ;" + brand +"\n"+
            "color :" + color + "\n"+
             "price :" + price);
   }}