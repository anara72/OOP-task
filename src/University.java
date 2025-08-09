public class University {

    private String name;
    private String specialties;
    private int establishedYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialties() {
        return specialties;
    }

    public void setSpecialties(String specialties) {
        this.specialties = specialties;
    }

    public int getEstablishedYear() {
        return establishedYear;
    }

    public void setEstablishedYear(int year) {
        this.establishedYear = year;
    }

    public void printInfo() {
        System.out.println("name :" + name + "\n " +
                "specialties :" + specialties + "\n" +
                " achylgam jyly : " + establishedYear);
    }
}


