package sender;
import user.User;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MessageSender {
    public boolean send(String text,User user,String country){
        if (country == user.getUserCountry() && user.getLastTimeSeen() != null){
            System.out.println("The message: "+text+"is for"+user.getEmail()+"from"+user.getUserCountry());
            return true;
        }
        else{
            System.out.println("The user is from the wrong country or has not been active recently");
        return false;
    }}
}
