package fc.introduction.ageVerification;

public class AgeVerifier {

    public String verifyAge(int age) {

        if (age > 18) {
            return "User's age is more than 18 years old.";
        } else if (age == 18) {
            return "User's age is 18 years old.";
        } else {
            return "User's age is less than 18 years old.";
        }
    }
}
