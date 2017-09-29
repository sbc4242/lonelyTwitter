package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a current mood
 *
 * @author Bongchul Sin
 * @version 1.0
 * @see Sad
 * @see Happy
 * @since 1.0
 */


public abstract class CurrentMood {
    private Date date;

    /**
     * Construct a date for current mood
     *
     * @param date tweet date
     */

    public CurrentMood(Date date){
        this.date = date;
    }

    /**
     * Set tweet date
     *
     * @param date tweet date
     */

    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Get tweet date
     *
     * @return returns tweet date
     */

    public Date getDate(){
        return date;
    }

}
