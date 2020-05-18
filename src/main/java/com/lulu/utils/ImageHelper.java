package com.lulu.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;

public class ImageHelper {

    /**
     * used for encoding the image to string
     *
     * @param imageUrl
     * @return encoded image string
     */
    public static String encodeToString(String imageUrl) {

        InputStream inputStream = null;
        ByteArrayOutputStream outputStream = null;
        try {
            URL url = new URL(imageUrl);
            inputStream = new BufferedInputStream(url.openStream());
            outputStream = new ByteArrayOutputStream();
            byte[] buffer = new byte[2048];
            int length;
            while ((length = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, length);
            }
            inputStream.close();
            outputStream.close();
            byte[] response = outputStream.toByteArray();
            String encodedString = Base64.getEncoder().encodeToString(response);
            return encodedString;
        } catch (MalformedURLException e) {
            System.out.println("MalformedURLException :- " + e.getMessage());

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException :- " + e.getMessage());

        } catch (IOException e) {
            System.out.println("IOException :- " + e.getMessage());

        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                System.out.println("Finally IOException :- " + e.getMessage());
            }
        }
        return null;
    }

    public static byte[] decodedBytes(String encodedString) {
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        return decodedBytes;
    }


}
