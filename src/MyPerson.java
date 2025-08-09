public class MyPerson {

    public class MyPersonClass {
        String name;
        String firstName;
        int age;
        String[] lessons;
        String food;


        public MyPersonClass(String name, String firstName, int age, String[] lessons, String food) {
            this.name = name;
            this.firstName = firstName;
            this.age = age;
            this.lessons = lessons;
            this.food = food;
        }

        public MyPersonClass(String name, String firstName, int age) {
            this.name = name;
            this.firstName = firstName;
            this.age = age;
        }

        public void getMyPerson() {
            System.out.println(
                    "Name: " + name + "\n" +
                            "FirstName " + firstName + "\n" +
                            "Age " + age + "\n" +
                            "Food " + food);
        }


        public void showLessons() {
            System.out.println();
            for (String lesson : this.lessons) {
                System.out.println(lesson);
            }
        }
    }}