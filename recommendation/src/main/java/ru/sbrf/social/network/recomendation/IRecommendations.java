package ru.sbrf.social.network.recomendation;

import java.util.LinkedList;

public interface IRecommendations {
    LinkedList<Integer> getRecommendedNewsId(int userId);
    LinkedList<Integer> getRecommendedFriendId(int userId);
    LinkedList<Integer> getRecommendedAudioId(int userId);
    LinkedList<Integer> getRecommendedPhotoId(int userId);
}
