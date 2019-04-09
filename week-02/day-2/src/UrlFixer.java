public class UrlFixer {
    public static void main(String... args){
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        //method1
        String url1 = url.replace("bots", "odds");
        url1 = url1.replace("https//", "https://");
        System.out.println(url1);


        // method 2
        String wordOld = "bots";
        String wordNew = "odds";
        String wordFix = "https://";

        int index = url.indexOf(wordOld);
        String url2 = url.substring(index, index + wordOld.length());
        url2 = url.substring(7);
        url2 = wordFix + url2 + wordNew;

        System.out.println(url2);
    }
}