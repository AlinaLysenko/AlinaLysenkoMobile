package entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder(builderMethodName = "builder")
public class Profile {

    private String email;
    private String username;
    private String password;
}
