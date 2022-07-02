package fc.introduction.ageVerification;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AgeVerifierTest {

    @Test
    public void shouldReturnCorrectResultWhenUserIsMoreThanOfAge() {
        //given
        int age = 50;
        AgeVerifier ageVerifier = new AgeVerifier();

        //when
        String result = ageVerifier.verifyAge(age);

        //then
        Assertions.assertEquals("User's age is more than 18 years old.", result);
    }

    @Test
    public void shouldReturnCorrectResultWhenUserIsLessThanOfAge() {
        //given
        int age = 15;
        AgeVerifier ageVerifier = new AgeVerifier();

        //when
        String result = ageVerifier.verifyAge(age);

        //then
        Assertions.assertEquals("User's age is more than 18 years old.", result);
    }

    @Test
    public void shouldReturnCorrectResultWhenUserIsOfAge() {
        //given
        int age = 18;
        AgeVerifier ageVerifier = new AgeVerifier();

        //when
        String result = ageVerifier.verifyAge(age);

        //then
        Assertions.assertEquals("User's age is 18 years old.", result);
    }
}