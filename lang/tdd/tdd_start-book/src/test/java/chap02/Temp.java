package chap02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Temp {
    @Test
    void password() {
        String passwordLength = "1";
        String password0_9 = "aaaaaaaaa";
        String passwordUpperWord = "bbbbbbbb";


        Boolean check = PasswordCheck.run(passwordLength);
        assertEquals(true, check);

    }
}
