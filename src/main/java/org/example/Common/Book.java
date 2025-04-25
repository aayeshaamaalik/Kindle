package org.example.Common;

public class Book {
    private Format format;
    private String title;

    public Book(String title, Format format) {
        this.title = title;
        this.format = format;
    }

    public Format getFormat() {
        return format;
    }

    public String getTitle() {
        return title;
    }
}

