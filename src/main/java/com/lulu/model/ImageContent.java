package com.lulu.model;

import javax.persistence.*;

@Entity
@Table(name = "imagecontent")
public class ImageContent {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "image_id",unique = true)
    private String imageId;

    @Column(name = "encoded_image", columnDefinition = "text")
    private String encodedImage;

    public ImageContent() {
    }

    public ImageContent(Long id, String imageId, String encodedImage) {
        this.id = id;
        this.imageId = imageId;
        this.encodedImage = encodedImage;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEncodedImage() {
        return encodedImage;
    }

    public void setEncodedImage(String encodedImage) {
        this.encodedImage = encodedImage;
    }
}
