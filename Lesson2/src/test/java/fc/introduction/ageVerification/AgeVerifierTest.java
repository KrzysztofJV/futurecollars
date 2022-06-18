package fc.introduction.ageVerification;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AgeVerifierTest {

    @Test
    public void shouldReturnCorrectResultWhenUserAgeIsHigher() {

        //given
        int firstUserAge = 50;

        //when
        AgeVerifier ageVerifier = new AgeVerifier();
        String firstAgeNumber = ageVerifier.verifyAge(firstUserAge);

        //then
        Assertions.assertEquals(firstAgeNumber,"User's age is more than 18 years old.");
    }

    @Test
    public void shouldReturnCorrectResultWhenUserAgeIsLess() {

        //given
        int firstUserAge = 15;

        //when
        AgeVerifier ageVerifier = new AgeVerifier();
        String firstAgeNumber = ageVerifier.verifyAge(firstUserAge);

        //then
        Assertions.assertEquals(firstAgeNumber,"User's age is less than 18 years old.");
    }

    @Test
    public void shouldReturnCorrectResultWhenUserAgeIsEqual() {

        //given
        int firstUserAge = 18;

        //when
        AgeVerifier ageVerifier = new AgeVerifier();
        String firstAgeNumber = ageVerifier.verifyAge(firstUserAge);

        //then
        Assertions.assertEquals(firstAgeNumber,"User's age is 18 years old.");
    }
}