// Custom exception classes
class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class InvalidEmailException extends RuntimeException {
    public InvalidEmailException(String message) {
        super(message);
    }
}

class InvalidPasswordException extends RuntimeException {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

// User.java
class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private int age;

    // Constructor
    public User(int id, String name, String email, String password, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}

// UserService.java
class UserService {
    // Method to process admission
    public void getAdmission(User u) {
        if (u.getAge() >= 18) {
            System.out.println(u.getName() + " is eligible for admission.");
        } else {
            System.out.println(u.getName() + " is not eligible for admission.");
        }
    }

    // Method to verify user profile
    public void verifyUser(User u) {
        validateAge(u.getAge());
        validateEmail(u.getEmail());
        validatePassword(u.getPassword());
        System.out.println("User " + u.getName() + " is successfully verified.");
    }

    // Age validation
    private void validateAge(int age) {
        if (age < 5) {
            throw new InvalidAgeException("Age must be 5 or above.");
        }
    }

    // Email validation
    private void validateEmail(String email) {
        if (!(email.endsWith("@gmail.com") || email.endsWith("@live.com") || email.endsWith("@outlook.com"))) {
            throw new InvalidEmailException("Email must belong to @gmail.com, @live.com, or @outlook.com.");
        }
    }

    // Password validation
    private void validatePassword(String password) {
        if (password.length() < 8 || password.length() > 15) {
            throw new InvalidPasswordException("Password must be between 8 to 15 characters.");
        }
        if (!password.matches(".*[A-Z].*")) {
            throw new InvalidPasswordException("Password must contain at least 1 uppercase letter.");
        }
        if (!password.matches(".*[a-z].*")) {
            throw new InvalidPasswordException("Password must contain at least 1 lowercase letter.");
        }
        if (!password.matches(".*\\d.*")) {
            throw new InvalidPasswordException("Password must contain at least 1 number.");
        }
        if (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            throw new InvalidPasswordException("Password must contain at least 1 special character.");
        }
    }
}

// Main.java
 class Main {
    public static void main(String[] args) {
        User user = new User(1, "John Doe", "john@gmail.com", "Pass@123", 20);

        UserService userService = new UserService();

        // Process admission
        userService.getAdmission(user);

        // Verify user
        try {
            userService.verifyUser(user);
        } catch (RuntimeException e) {
            System.out.println("Verification failed: " + e.getMessage());
        }
    }
}
