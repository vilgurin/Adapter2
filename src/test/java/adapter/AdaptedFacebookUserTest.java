package adapter;
import facebook.FacebookUser;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AdaptedFacebookUserTest {

    FacebookUser fUser;
    AdaptedFacebookUser fUserAdapted;

    @BeforeEach
    void setUp() {
        fUser = new FacebookUser("123@gmail.com","UA",new Date());
        fUserAdapted = new AdaptedFacebookUser(fUser);

    }

    @Test
    void getEmail() {
        assertEquals(fUser.getEmail(),fUserAdapted.getEmail());

    }

    @Test
    void getUserCountry() {
        assertEquals(fUser.getUserCountry(),fUserAdapted.getUserCountry());
    }

    @Test
    void getLastTimeSeen() {
        assertEquals(fUser.getUserLastTimeSeen(),fUserAdapted.getLastTimeSeen());
    }
}