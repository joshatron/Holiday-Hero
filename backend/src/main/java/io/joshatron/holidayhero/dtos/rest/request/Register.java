package io.joshatron.holidayhero.dtos.rest.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Register {
    private String username;
    private String password;
}
