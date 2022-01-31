package my.edu.oop;

public class StaticExample {


    public static void main(String[] args) {

        Friend friend1 = new Friend("SpongeBob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");

//        System.out.println(Friend.numberOfFriends);

        Friend.displayFriends();
    }
}
