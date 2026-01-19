public class Main{
    public static void main(String[] args) {

        User u = new User("john_doe", "Password123");

        ValidateUser vu = new ValidateUser();

        UserRegister ru = new UserRegister(vu);
        UserLogin lu = new UserLogin(vu);


        ru.registerUser(u);
        lu.loginUser(u);

        User u2 = new User("kaki", "asda");

        ru.registerUser(u2);
        lu.loginUser(u2);


    }
}