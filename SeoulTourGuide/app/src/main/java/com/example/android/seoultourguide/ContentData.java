package com.example.android.seoultourguide;

public class ContentData {
    private String adress;
    private String number;
    private String content;

    public ContentData(String adress, String number, String content) {
        this.adress = adress;
        this.number = number;
        this.content = content;
    }

    public String getAdress() {
        return adress;
    }

    public String getNumber() {
        return number;
    }

    public String getContent() {
        return content;
    }
}
