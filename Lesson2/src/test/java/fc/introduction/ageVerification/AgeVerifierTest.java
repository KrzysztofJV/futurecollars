package fc.introduction.ageVerification;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AgeVerifierTest {

    @Test
    public void shouldPrintCorrectResultWhenUserAgeIsHigher() {

        //given
        int firstUserAge = 50;
        int secondUserAge = 20;
        int thirdUserAge = 19;

        //when
        AgeVerifier ageVerifier = new AgeVerifier();
        String firstAgeNumber = ageVerifier.ageVerify(firstUserAge);
        String secondAgeNumber = ageVerifier.ageVerify(secondUserAge);
        String thirdAgeNumber = ageVerifier.ageVerify(thirdUserAge);

        //then
        Assertions.assertEquals(firstAgeNumber,"User's age is more than 18 years old.");
        Assertions.assertEquals(secondAgeNumber,"User's age is more than 18 years old.");
        Assertions.assertEquals(thirdAgeNumber,"User's age is more than 18 years old.");
    }

    @Test
    public void shouldPrintCorrectResultWhenUserAgeIsLess() {

        //given
        int firstUserAge = 15;
        int secondUserAge = 14;
        int thirdUserAge = 2;

        //when
        AgeVerifier ageVerifier = new AgeVerifier();
        String firstAgeNumber = ageVerifier.ageVerify(firstUserAge);
        String secondAgeNumber = ageVerifier.ageVerify(secondUserAge);
        String thirdAgeNumber = ageVerifier.ageVerify(thirdUserAge);

        //then
        Assertions.assertEquals(firstAgeNumber,"User's age is less than 18 years old.");
        Assertions.assertEquals(secondAgeNumber,"User's age is less than 18 years old.");
        Assertions.assertEquals(thirdAgeNumber,"User's age is less than 18 years old.");
    }

    @Test
    public void shouldPrintCorrectResultWhenUserAgeIsEqual() {

        //given
        int firstUserAge = 18;
        int secondUserAge = 18;

        //when
        AgeVerifier ageVerifier = new AgeVerifier();
        String firstAgeNumber = ageVerifier.ageVerify(firstUserAge);
        String secondAgeNumber = ageVerifier.ageVerify(secondUserAge);

        //then
        Assertions.assertEquals(firstAgeNumber,"User's age is 18 years old.");
        Assertions.assertEquals(secondAgeNumber,"User's age is 18 years old.");
    }
}