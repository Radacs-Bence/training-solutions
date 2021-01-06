package exam02.photo;

import java.util.ArrayList;
import java.util.List;

public class PhotoCollection {

    private List<Photo> photos = new ArrayList<>();

    public void addPhoto(String... names) {
        for (String name : names) {
            photos.add(new Photo(name));
        }
    }

    public void starPhoto(String name, Quality quality) {
        boolean found = false;
        for (Photo photo : photos) {
            if (photo.getName().equals(name)){
                photo.setQuality(quality);
                found = true;
            }
        }

        if (!found){
            throw new PhotoNotFoundException("Photo not found!");
        }
    }

    public int numberOfStars(){
        int stars = 0;
        for (Photo photo : photos) {
            stars += photo.getQuality().getNumberOfStars();
        }
        return stars;
    }

    public List<Photo> getPhotos() {
        return new ArrayList<>(photos);
    }
}
