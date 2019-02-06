package com.example.android.jtunes;

public class SingInfo {

    private String singTitle;
    private String singerName;

    public SingInfo(String singTitle, String singerName) {
        this.singTitle = singTitle;
        this.singerName = singerName;
    }

    public String getSingTitle() {
        return singTitle;
    }

    public String getSingerName() {
        return singerName;
    }
}
