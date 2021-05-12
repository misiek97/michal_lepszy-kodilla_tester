public class SimpleArray {
    public static void main(String[] args) {

        String[] friends = new String[5];

        friends[0] = "Elizabeth";
        friends[1] = "Rafael";
        friends[2] = "Luke";
        friends[3] = "Catherine";
        friends[4] = "Mark";

        System.out.println(friends[3]);

        int numberOfElements = friends.length;
        System.out.println("No of elements in my array:");
        System.out.println(numberOfElements);
    }
}