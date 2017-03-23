/**
 * Created by Gabor on 23/03/2017.
 */
public class UrlFIxer {
    public static void main(String[] args){
        String url = "https//www.reddit.com/r/nevertellmethebots";

        url = url.replace("bots", "odds");
        url = url.substring(0,7) + ":" + url.substring(7);

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        System.out.println(url);
    }
}

