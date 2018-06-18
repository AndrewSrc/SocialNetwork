package ru.sbrf.social.network.photos;

public class Photos implements IPhotos {
    private String imagePath;
    public int uploadPhoto(String imagePath) {
        this.imagePath = imagePath;
        System.out.println("Загружаем фото");
        return 1;
    }

    public String viewPhoto(int imageId) {
        System.out.println("Просматриваем фото");
        return "my_photo";
    }
}
