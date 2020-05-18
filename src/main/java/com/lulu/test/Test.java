package com.lulu.test;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;

public class Test {

//    public static void main(String[] args) throws IOException {
//        String filePath="https://persist.signzy.tech/api/files/85995881/download/0d59eda60c7d45be912867767311af7b935892857f1e46f6a6563a693e042a2e.jpg";
//        byte[] fileContent = new byte[0];
//        try {
//            fileContent = FileUtils.readFileToByteArray(new File(filePath));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        String encodedString = Base64.getEncoder().encodeToString(fileContent);
//        System.out.println(encodedString);
//
//        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
//        FileUtils.writeByteArrayToFile(new File("C:/image/a.jpg"), decodedBytes);
//    }

    public static void main(String[] args) {
        String imageUrl = "https://persist.signzy.tech/api/files/85995881/download/0d59eda60c7d45be912867767311af7b935892857f1e46f6a6563a693e042a2e.jpg";
        // create a sample url String to encode


        // print actual URL String
        System.out.println("Sample URL:\n"
                + imageUrl);

        // Encode into Base64 URL format
        String encodedURL = Base64.getUrlEncoder()
                .encodeToString(imageUrl.getBytes());

        // print encoded URL
        System.out.println("encoded URL:\n"
                + encodedURL);


    }
}
