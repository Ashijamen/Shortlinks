package com.example.api.dto;

public class UserDTO {
    public Long id;
    private String link;

    public Long getId() {
        return id;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

}
