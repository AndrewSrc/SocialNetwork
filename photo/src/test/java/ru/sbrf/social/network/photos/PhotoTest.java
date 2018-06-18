package ru.sbrf.social.network.photos;

import static org.junit.jupiter.api.Assertions.*;

class PhotoTest {
    private static String PHOTO = "my_photo";
    Photos photo = new Photos();
    int imageId;
    @org.junit.jupiter.api.Test
    void upload() {
        imageId = photo.uploadPhoto(PHOTO);
        assertEquals(imageId, 1);
    }

    @org.junit.jupiter.api.Test
    void view() {
        String imagePath = photo.viewPhoto(1);
        assertEquals(imagePath, PHOTO);
    }
}