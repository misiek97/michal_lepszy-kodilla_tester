public class User {
    private String name;
    private int age;

    public User(String userName, int howOld) {
        name = userName; //this.name = name (from class)
        age = howOld;    //this.age = age (class property)
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
