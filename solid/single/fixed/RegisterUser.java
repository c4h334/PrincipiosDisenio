public class RegisterUser{

    private ValidateUser vu;

    public RegisterUser(ValidateUser vu){
        this.vu = vu;
    }

    public void registerUser(User user) {
        if (vu.validateUsername(user.getUsername()) && vu.validatePassword(user.getPassword())) {
            System.out.println("User registered successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    public void loginUser(User user) {
        if (vu.validateUsername(user.getUsername()) && vu.validatePassword(user.getPassword())) {
            System.out.println("User logged in successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}