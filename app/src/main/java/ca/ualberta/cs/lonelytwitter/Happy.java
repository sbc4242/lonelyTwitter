package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a mood of happy
 *
 * @author Bongchul Sin
 * @version 1.0
 * @see CurrentMood
 * @since 1.0
 */

public class Happy extends CurrentMood{
    private String mood;

    /**
     * Construct happy mood object
     *
     * @param date tweet date
     */

    public Happy (Date date){
        super(date);
    }

    /**
     * Set tweet mood
     *
     * @param mood tweet mood
     */

    public void setMood(String mood){
        this.mood = mood;
    }

    /**
     * Get tweet mood
     *
     * @return returns a happy mood
     */

    public String getMood(){
        return mood;
    }
}
