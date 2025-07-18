package com.custom.costume;

import org.springframework.data.annotation.Id;

public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    private String skinTone;
    private String faceType;

    // Constructors
    public User() {}

    public User(String name, String email, String password, String skinTone, String faceType) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.skinTone = skinTone;
        this.faceType = faceType;
    }

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getSkinTone() { return skinTone; }
    public void setSkinTone(String skinTone) { this.skinTone = skinTone; }

    public String getFaceType() { return faceType; }
    public void setFaceType(String faceType) { this.faceType = faceType; }
}
