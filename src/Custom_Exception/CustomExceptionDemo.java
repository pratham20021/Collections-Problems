package Custom_Exception;

class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {

    public static void main(String[] args) {

        int age = 16;

        try {
            validateAge(age);
            System.out.println("Eligible for voting");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    static void validateAge(int age) {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
    }
}
