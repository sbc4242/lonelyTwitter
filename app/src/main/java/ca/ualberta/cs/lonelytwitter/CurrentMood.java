package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bongchul on 9/14/17.
 */


public abstract class CurrentMood {
    private Date date;

    public CurrentMood(Date date){
        this.date = date;
    }


    public void setDate(Date date){
        this.date = date;
    }

    public Date getDate(){
        return date;
    }

}
