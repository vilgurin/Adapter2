package sender;

import adapter.AdaptedFacebookUser;
import facebook.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import user.User;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

class MessageSenderTest {
    FacebookUser fu;
    AdaptedFacebookUser afu;
    MessageSender ms;
    @BeforeEach
    void setUp() {
        fu = new FacebookUser("123@gmail.com","Ireland",new Date());
        afu = new AdaptedFacebookUser(fu);
        ms = new MessageSender();
    }

    @Test
    void send() {
        assertEquals(true,ms.send("hello!", (User) afu,"Ireland"));
    }
}