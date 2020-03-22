package io.joshatron.holidayhero.dtos.database;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Person {
    private UUID id;
    private String name;
    private String description;
    private User owner;
    private User user;

    private List<Gift> ideas;

    private LocalDateTime created;
    private LocalDateTime modified;
}
