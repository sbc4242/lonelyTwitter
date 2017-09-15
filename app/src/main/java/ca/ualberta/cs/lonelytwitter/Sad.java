package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bongchul on 9/14/17.
 */

public class Sad extends CurrentMood {
    private String mood;

    public Sad (Date date){
        super(date);
    }

    public void setMood(String mood){
        this.mood = mood;
    }

    public String getMood(){
        return mood;
    }
}
