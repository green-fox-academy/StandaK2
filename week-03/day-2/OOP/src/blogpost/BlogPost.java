/*Create a BlogPost class that has
        an authorName
        a title
        a text
        a publicationDate*/

package blogpost;

import java.util.Date;

public class BlogPost {

    String authorName;
    String title;
    String text;
    String publicationDate;

    public BlogPost(String authorName, String title, String text, String publicationDate){
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }
}
