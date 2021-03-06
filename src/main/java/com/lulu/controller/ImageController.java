package com.lulu.controller;

import com.lulu.model.UploadRequestBody;
import com.lulu.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ImageController {

    @Autowired
    ImageService imageService;

    /**
     * Save api is used for saving the image data into db
     * @param uploadRequestBody image id and image url
     * @return save id
     */
    @PostMapping("save")
    public Long saveImageContent(@RequestBody UploadRequestBody uploadRequestBody) {
        return imageService.saveImageContent(uploadRequestBody);
    }

    /**
     * getting the image by id
     * @param id image id
     * @return  view image
     */
    @GetMapping("image/{id}")
    public ResponseEntity<byte[]> getImageContentAsBase64(@PathVariable String id) {
        byte[] image = imageService.getImageContentAsBase64(id);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);
        headers.setContentLength(image.length);
        return new ResponseEntity<>(image, headers, HttpStatus.OK);
    }


}
