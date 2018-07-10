package ru.sbrf.social.network.recomendation;

import java.util.LinkedList;

public class Recommendations implements IRecommendations {
    public LinkedList<Integer> getRecommendedAudioId(int userId) {
        return new LinkedList<>();
    }

    public LinkedList<Integer> getRecommendedFriendId(int userId) {
        return new LinkedList<>();
    }

    public LinkedList<Integer> getRecommendedNewsId(int userId) {
        return new LinkedList<>();
    }

    public LinkedList<Integer> getRecommendedPhotoId(int userId) {
        return new LinkedList<>();
    }
}
