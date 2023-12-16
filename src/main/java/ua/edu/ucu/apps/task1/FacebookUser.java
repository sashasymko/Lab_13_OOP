package ua.edu.ucu.apps.task1;
import java.time.LocalDate;

import lombok.Data;

@Data
public class FacebookUser {
    private String email;
    private String userCountry;
    private LocalDate userActiveTime;
}
