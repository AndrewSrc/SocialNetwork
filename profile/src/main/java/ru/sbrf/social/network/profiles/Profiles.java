package ru.sbrf.social.network.profiles;

import ru.sbrf.social.network.photos.IPhotos;
import ru.sbrf.social.network.photos.Photos;

public class Profiles implements IProfiles, IPhotos {

    Photos photo = new Photos();

    @Override
    public void viewProfile() {

    }

    @Override
    public int uploadPhoto(String imagePath) {
        return 0;
    }

    @Override
    public String viewPhoto(int imageId) {
        return photo.viewPhoto(1);
    }

}
