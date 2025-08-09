public class School {
     private String name;
     private String nameAdrres;
     private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameAdrres() {
        return nameAdrres;
    }

    public void setNameAdrres(String nameAdrres) {
        this.nameAdrres = nameAdrres;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void getInfo(){
        System.out.println("name :" + name + "\n" +
                "nameAdrres :" + nameAdrres + "\n"+
                 "price :" +  price);
    }}
