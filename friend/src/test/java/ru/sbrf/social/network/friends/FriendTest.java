package ru.sbrf.social.network.friends;

import static org.junit.jupiter.api.Assertions.*;

class FriendTest {
    Friends friend = new Friends();

    @org.junit.jupiter.api.Test
    void find() {
        String email = friend.findFriend();
        assertEquals(email,"findemail.ru");
    }
}