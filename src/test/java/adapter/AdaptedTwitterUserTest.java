package adapter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twitter.TwitterUser;
import java.util.Date;


import static org.junit.jupiter.api.Assertions.*;

class AdaptedTwitterUserTest {

    TwitterUser tUser;
    AdaptedTwitterUser tUserAdapted;

    @BeforeEach
    void setUp() {
        tUser = new TwitterUser("123@gmail.com","India",new Date());
        tUserAdapted = new AdaptedTwitterUser(tUser);
    }

    @Test
    void getEmail() {
        assertEquals(tUser.getEmail(),tUserAdapted.getEmail());
    }

    @Test
    void getUserCountry() {
        assertEquals(tUser.getUserCountry(),tUserAdapted.getUserCountry());
    }

    @Test
    void getLastTimeSeen() {
        assertEquals(tUser.getUserCountry(),tUserAdapted.getUserCountry());
    }
}