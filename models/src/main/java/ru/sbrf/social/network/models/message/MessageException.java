package ru.sbrf.social.network.models.message;

public class MessageException extends Exception
{

    public MessageException(int n) {
        super("Message length should be less than " + n + " symbols");
    }
}
