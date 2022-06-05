package fc.introduction.ageVerification;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AgeVerificationTest {

    @Test
    public void shouldCorrectVerifyUserAge() {

        //given
        int firstUserAge = 15;
        int secondUserAge = 18;
        int thirdUserAge = 19;

        //when
        AgeVerification ageVerification = new AgeVerification();
        String firstAgeNumber = ageVerification.ageVerify(firstUserAge);
        String secondAgeNumber = ageVerification.ageVerify(secondUserAge);
        String thirdAgeNumber = ageVerification.ageVerify(thirdUserAge);

        //then
        Assertions.assertEquals(firstAgeNumber,"User's age is less than 18 years old.");
        Assertions.assertEquals(secondAgeNumber,"User's age is 18 years old.");
        Assertions.assertEquals(thirdAgeNumber,"User's age is more than 18 years old.");
    }
}