package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a mood of sad
 *
 * @author Bongchul Sin
 * @version 1.0
 * @see CurrentMood
 * @since 1.0
 */

public class Sad extends CurrentMood {
    private String mood;

    /**
     * Construct a mood of sad object
     *
     * @param date tweet date
     */

    public Sad (Date date){
        super(date);
    }

    /**
     * Set mood of sad
     *
     * @param mood tweet mood
     */

    public void setMood(String mood){
        this.mood = mood;
    }

    /**
     * Get mood of sad
     *
     * @return returns mood of sad
     */

    public String getMood(){
        return mood;
    }
}
