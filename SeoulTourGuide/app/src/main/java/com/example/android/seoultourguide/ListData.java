package com.example.android.seoultourguide;

public class ListData {

    private String Title;
    private String Body;
    private int ImageId;
    private static final String NO_BODY_PROVIDED = "";
    private static final int NO_IMG_PROVIDED= -1;

    public ListData(String title, String body, int imageId) {
        Title = title;
        Body = body;
        ImageId = imageId;
    }

    public ListData(String title, int imageId) {
        Title = title;
        ImageId = imageId;
    }

    public ListData(String title, String body) {
        Title = title;
        Body = body;
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

    public boolean hasimg(){
        return ImageId != NO_IMG_PROVIDED;
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
