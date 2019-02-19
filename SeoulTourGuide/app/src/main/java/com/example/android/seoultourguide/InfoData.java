package com.example.android.seoultourguide;

public class InfoData {

    private String title;
    private String body;

    public InfoData(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "InfoData{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
