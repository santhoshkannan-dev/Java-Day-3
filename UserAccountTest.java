import java.util.Scanner;

class UserAccount {
    private String username;
    private String password;
    private int age;

    public UserAccount(String username, String password, int age) {
        this.username = username;
        this.password = password;
        setAge(age);
    }

    public String getUsername() {
        return this.username;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int newAge) {
        if (newAge >= 0 && newAge <= 120) {
            this.age = newAge;
        } else {
            System.out.println("Error: Invalid age entry.");
        }
    }

    public boolean login(String enteredUsername, String enteredPassword) {
        return this.username.equals(enteredUsername) && this.password.equals(enteredPassword);
    }
}

public class UserAccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        UserAccount user1 = new UserAccount("Santhosh", "mypassword", 23);

        System.out.print("Enter username: ");
        String uname = sc.nextLine();

        System.out.print("Enter password: ");
        String pwd = sc.nextLine();

        if (user1.login(uname, pwd)) {
            System.out.println("Login successful!");
            System.out.println("Welcome " + user1.getUsername() + ", Age: " + user1.getAge());
        } else {
            System.out.println("Login failed! Invalid credentials.");
        }
    }
}
