public class Main{
    public static void main(String[] args) {

        User u = new User("john_doe", "Password123");

        ValidateUser vu = new ValidateUser();

        RegisterUser ru = new RegisterUser(vu);

        ru.registerUser(u);
        ru.loginUser(u);

        User u2 = new User("kaki", "asda");

        ru.registerUser(u2);
        ru.loginUser(u2);


    }
}