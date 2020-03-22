package io.joshatron.holidayhero.dtos.database;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class WishList {
    private UUID id;
    private String name;
    private String description;
    private User owner;

    private boolean isPublic;
    private String shareCode;
    private List<User> shared;

    private List<Gift> items;
    private List<Occasion> occasions;
    private LocalDate next;

    private LocalDateTime created;
    private LocalDateTime modified;
}
