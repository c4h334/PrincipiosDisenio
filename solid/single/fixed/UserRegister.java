public class UserRegister{

    private ValidateUser vu;

    public UserRegister(ValidateUser vu){
        this.vu = vu;
    }

    public void registerUser(User user) {
        if (vu.validateUsername(user.getUsername()) && vu.validatePassword(user.getPassword())) {
            System.out.println("User registered successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

}