package practicing.builder;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Artem", "Trofymenko").age(21).address("Poland").build();
        System.out.println( user.toString());
    }
}
