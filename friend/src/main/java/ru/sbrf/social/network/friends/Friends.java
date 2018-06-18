package ru.sbrf.social.network.friends;

import ru.sbrf.social.network.models.User;

public class Friends implements IFriends {

    public static void main(String[] args) {
        System.out.println("Enter point");
    }

    public User findFriend(String Name) {
        System.out.println("Ищем друзей");

        return new User(Name);
    }

    public void addFriend(User user) {
        System.out.println("Добавляем друзей = " + user.toString());
    }
}