package io.joshatron.holidayhero.dtos.database;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Occasion {
    private UUID id;
    private String name;
    private String description;
    private User owner;

    private LocalDate day;
    private LocalDate dayThisYear;
    private int currentYear;

    private List<Person> giving;
    private List<Gift> given;
    private List<Gift> received;

    private LocalDateTime created;
    private LocalDateTime modified;
}
