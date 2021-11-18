package adapter;
import user.User;
import twitter.TwitterUser;
import java.util.Date;


public class AdaptedTwitterUser implements User {
    private TwitterUser twitterUser;
    public AdaptedTwitterUser(TwitterUser user){
        this.twitterUser = user;
    }


    @Override
    public String getEmail() {
        return twitterUser.getEmail();
    }

    @Override
    public String getUserCountry() {
        return twitterUser.getUserCountry();
    }

    @Override
    public Date getLastTimeSeen() {
        return twitterUser.getUserLastTimeSeen();
    }
}
