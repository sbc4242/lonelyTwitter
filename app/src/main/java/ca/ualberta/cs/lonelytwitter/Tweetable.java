package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 *
 * Interface of Tweetable
 *
 * @author Bongchul Sin
 * @version 1.0
 * @since 1.0
 */

public interface Tweetable {

    /**
     * Get tweet message
     *
     * @return
     */

    public String getMessage();

    /**
     * Get tweet date
     *
     * @return
     */

    public Date getDate();



}
