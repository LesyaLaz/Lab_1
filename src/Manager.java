public class Manager {

    private String firstName;
    private String secondName;
    private String thirdName;
    private int age;
    private boolean isGoodEmployee;

    public Manager(String firstName, String secondName, String thirdName, int age, boolean isGoodEmployee) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.age = age;
        this.isGoodEmployee = isGoodEmployee;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public int getAge() {
        return age;
    }

    public boolean isGoodEmployee() {
        return isGoodEmployee;
    }
}
