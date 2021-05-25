public class UserPlay {
    public static void main(String[] args) {
        User[] users = new User[5];
        users[0] = new User("Thomas", 23);
        users[1] = new User("Agnes", 34);
        users[2] = new User("Michael", 56);
        users[3] = new User("Ann", 6);
        users[4] = new User("Eve", 13);
        double sum = 0;
        for (int n = 0; n < users.length; n++) {
            sum += users[n].getAge();
        }
        double average = sum / users.length;

        for (int n = 0; n < users.length; n++) {
            if (users[n].getAge() > average) {
                System.out.println(users[n].getName());
            }
        }
    }

}