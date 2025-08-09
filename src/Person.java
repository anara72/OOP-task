public class Person {
    private String name;
    private String firstName;
    private int age;

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

     public void getInfo(){
        System.out.println("name :" + name + "\n"+
                "firstName :" + firstName + "\n"+
                "age :" + age);
     }}