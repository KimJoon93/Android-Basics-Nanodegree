package com.example.android.seoultourguide;

public class NewsList {

    private String NewsTitle;
    private String NewsBody;

    public NewsList(String newsTitle, String newsBody) {
        NewsTitle = newsTitle;

        NewsBody = newsBody;
    }

    public String getNewsTitle() {
        return NewsTitle;
    }

    public String getNewsBody() {
        return NewsBody;
    }

    @Override
    public String toString() {
        return "NewsList{" +
                "NewsTitle='" + NewsTitle + '\'' +
                ", NewsBody='" + NewsBody + '\'' +
                '}';
    }
}
