public class ApplicationUser {
    private String name;
    private double age;
    private double height;

    public ApplicationUser(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void checkData() {
        if (name != null) {
            if (this.age > 30 && this.height > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}
