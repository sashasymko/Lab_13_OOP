package ua.edu.ucu.apps.task1;
import java.time.LocalDate;

public class MyFacebookUser implements User {
    private FacebookUser facebookUser;

    public MyFacebookUser(FacebookUser myFacebookUser) {
        this.facebookUser = facebookUser;
    }
    @Override
    public String getEmail() {
        return facebookUser.getEmail();
    }

    @Override
    public String getCountry() {
        return facebookUser.getUserCountry();
    }

    @Override
    public LocalDate getLastActiveDate() {
        return facebookUser.getUserActiveTime();
    }
}
