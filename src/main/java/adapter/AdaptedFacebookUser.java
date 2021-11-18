package adapter;
import user.User;
import facebook.FacebookUser;
import java.util.Date;


public class AdaptedFacebookUser implements User {
    private FacebookUser facebookUser;

    public AdaptedFacebookUser (FacebookUser user){
        this.facebookUser = user;
    }

    @Override
    public String getEmail() {
        return facebookUser.getEmail();
    }

    @Override
    public String getUserCountry() {
        return facebookUser.getUserCountry();
    }

    @Override
    public Date getLastTimeSeen() {
        return facebookUser.getUserLastTimeSeen();
    }
}
