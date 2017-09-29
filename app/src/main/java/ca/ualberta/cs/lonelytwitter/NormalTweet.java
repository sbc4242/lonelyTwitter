package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a NormalTweet
 *
 * @author Bongchul Sin
 * @version 1.0
 * @see Tweet
 * @since 1.0
 */

public class NormalTweet extends Tweet {

    /**
     * Constructor a NormalTweet object
     *
     * @param message tweet message
     */

    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Constructor a NormalTweet object
     *
     * @param message tweet message
     * @param date tweet date
     */

    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * See if it's important
     *
     * @return returns false if it's an important
     */

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }

}
