package ru.sbrf.social.network.friends;

import ru.sbrf.social.network.models.User;

public interface IFriends {
    User findFriend(String Name);
    public void addFriend(String email);
}