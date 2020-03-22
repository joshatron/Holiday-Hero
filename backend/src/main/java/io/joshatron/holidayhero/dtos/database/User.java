package io.joshatron.holidayhero.dtos.database;

import java.time.LocalDateTime;
import java.util.UUID;

public class User {
    private UUID id;
    private String username;
    private String auth;
    private String name;

    private int defaultRollDays;
    private boolean defaultPublic;

    private LocalDateTime created;
    private LocalDateTime lastLogin;
    private int loginAttempts;

    private UserState state;
    private UserLevel level;
}
