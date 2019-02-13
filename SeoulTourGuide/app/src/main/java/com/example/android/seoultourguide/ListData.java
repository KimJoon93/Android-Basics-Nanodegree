package com.example.android.seoultourguide;

public class ListData {

    private String Title;
    private String Body;
    private int ImageId;
    private static final String NO_BODY_PROVIDED = "";

    public ListData(String title, String body, int imageId) {
        Title = title;
        Body = body;
        ImageId = imageId;
    }

    public ListData(String title, int imageId) {
        Title = title;
        ImageId = imageId;
    }

    public String getTitle() {
        return Title;
    }

    public String getBody() {
        return Body;
    }

    public int getImageId() {
        return ImageId;
    }

    public boolean hasBody(){
        return Body != NO_BODY_PROVIDED;
    }

    @Override
    public String toString() {
        return "ListData{" +
                "Title='" + Title + '\'' +
                ", Body='" + Body + '\'' +
                ", ImageId=" + ImageId +
                '}';
    }
}
