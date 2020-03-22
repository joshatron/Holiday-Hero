package io.joshatron.holidayhero.dtos.database;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Gift {
    private UUID id;
    private String name;
    private String description;
    private Person person;

    private LocalDate given;
    private GiftStatus status;

    private LocalDateTime created;
    private LocalDateTime modified;
}
