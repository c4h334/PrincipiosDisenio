public class UserLogin {
    private ValidateUser vu;

    public UserLogin(ValidateUser vu) {
        this.vu = vu;
    }

    public void loginUser(User user) {
        if (vu.validateUsername(user.getUsername()) && vu.validatePassword(user.getPassword())) {
            System.out.println("User logged in successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

}