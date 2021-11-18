package twitter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import user.User;

import java.util.Date;


@Getter @AllArgsConstructor
public class TwitterUser{
    private String email;
    private String userCountry;
    private Date userLastTimeSeen;
}
