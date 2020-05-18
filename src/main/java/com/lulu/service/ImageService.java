package com.lulu.service;

import com.lulu.model.UploadRequestBody;

public interface ImageService {
    Long saveImageContent(UploadRequestBody uploadRequestBody) ;

    byte[] getImageContentAsBase64(String id);
}
