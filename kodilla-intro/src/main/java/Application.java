public class Application {
    public static void main(String[] args) {
        Application user = new Application("Adam", 40.5, 178);
        user.checkData();
    }

    public class User {
        String name;
        double age;
        double heigh;

        public User(String name, double age, double heigh;) {
            this.name = name;
            this.age = age;
            this.heigh = heigh;
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
}