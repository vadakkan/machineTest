package com.lulu.service;

import com.lulu.model.ImageContent;
import com.lulu.model.UploadRequestBody;
import com.lulu.repo.ImageRepo;
import com.lulu.utils.ImageHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    ImageRepo imageRepo;


    @Override
    public Long saveImageContent(UploadRequestBody uploadRequestBody) {

        if (StringUtils.isNotBlank(uploadRequestBody.getImage()) && StringUtils.isNotBlank(uploadRequestBody.getImage())) {
            ImageContent imageContent = new ImageContent();
            imageContent.setImageId(uploadRequestBody.getId());
            String encodeImage = ImageHelper.encodeToString(uploadRequestBody.getImage());
            imageContent.setEncodedImage(encodeImage);
            Long id = imageRepo.save(imageContent).getId();
            return id;
        }
        return null;
    }

    @Override
    public byte[] getImageContentAsBase64(String id) {
        Optional<ImageContent> imageContent = imageRepo.findByImageId(id);
        byte[] decodedBytes = ImageHelper.decodedBytes(imageContent.get().getEncodedImage());
        return decodedBytes;
    }


}
