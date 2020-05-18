package com.lulu.model;

public class UploadRequestBody {

    private String id;
    private String image;

    public UploadRequestBody() {
    }

    public UploadRequestBody(String id, String image) {
        this.id = id;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
