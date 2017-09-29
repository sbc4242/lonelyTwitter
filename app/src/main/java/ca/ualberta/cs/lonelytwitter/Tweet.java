/*
 * Class Name: Tweet
 *
 * Version: Version 1.0
 *
 * Date : September 28, 2017
 *
 * Copyright (c) Team X, CMPUT301, University of Alberta. All Rights Reserved. You may use, distribute or modify this code under terms and conditions of the Code of Students Behaviour at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a Tweet
 *
 * @author Bongchul Sin
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    /**
     * Constructor Tweet objects
     *
     * @param message tweet message
     */

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    /**
     * Constructor Tweet objects
     *
     * @param message tweet message
     * @param date tweet date
     */

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * Sets tweet date
     *
     * @param date tweet date
     */

    public void setDate(Date date){
        this.date = date;
    }


    /**
     * Sets tweet messages
     *
     * @param message Tweet message
     * @throws TweetTooLongException
     */


    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() <= 140){
            this.message = message;
        } else{
            throw new TweetTooLongException();
        }
    }

    /**
     * Gets tweet date
     *
     * @return return tweet date
     */

    public Date getDate(){
        return date;
    }

    /**
     * Gets message
     *
     * @return return message
     */

    public String getMessage(){
        return message;
    }

    /**
     *
     * @return return if it's important
     */

    public abstract Boolean isImportant();

    /**
     * Combines message and date and creates into one string.
     *
     * @return returns a line saying date and message
     */

    public String toString() {
        return date.toString() + " | " + message;

    }


}
