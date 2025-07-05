package com.custom.costume;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "event_themes")
public class EventTheme {

    @Id
    private String id;
    private String name; // e.g., "Wedding", "Party", etc.

    // Constructors
    public EventTheme() {}

    public EventTheme(String name) {
        this.name = name;
    }

    // Getters and setters
    public String getId() { return id; }
    public String getName() { return name; }
    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
}
