package basic_programs;

public class Login {
    public static void main(String[] args) {
        System.out.println("login success: " + login("cusnatsova@gmail.com", "12345"));
        System.out.println("login success: " + login("9786728840", "1234", true));
    }

    public static String login(String email, String password) {
        return email + "," + password;
    }

    public static String login(String phone, String password, boolean isPhoneLogin) {
        return phone + "," + password + "," + isPhoneLogin;
    }
}
