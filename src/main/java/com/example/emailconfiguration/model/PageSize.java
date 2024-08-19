package com.example.emailconfiguration.model;

public class PageSize {
    private String id;
    private String size;

    public PageSize() {}

    public PageSize(String id, String size) {
        this.id = id;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
