package ua.edu.ucu.apps.task1;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class TwitterUser {
    private String email;
    private String userCountry;
    private LocalDateTime userActiveTime;
}
