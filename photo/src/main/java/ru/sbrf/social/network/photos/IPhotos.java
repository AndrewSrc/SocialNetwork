package ru.sbrf.social.network.photos;

public interface IPhotos {
    public int uploadPhoto(String imagePath);
    public String viewPhoto(int imageId);
}
