package com.lulu.repo;

import com.lulu.model.ImageContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ImageRepo extends JpaRepository<ImageContent, Long> {

    @Query("select  i from ImageContent i where i.imageId  = :imageId")
    Optional<ImageContent> findByImageId(@Param("imageId") String imageId);
}
