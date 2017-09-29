package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a Important Tweet
 *
 * @author Bongchul Sin
 * @version 1.0
 * @see Tweet
 * @since 1.0
 */

public class ImportantTweet extends Tweet {

    /**
     * Constructor a Important tweet
     *
     * @param message tweet message
     */

    public ImportantTweet(String message){
        super(message);
    }

    /**
     * Constructor a Important tweet
     *
     * @param message tweet message
     * @param date tweet date
     */

    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * See if it's important
     *
     * @return returns true if it's an important
     */

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
