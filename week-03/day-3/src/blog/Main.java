//Create a few blog post objects:
//        "Lorem Ipsum" titled by John Doe posted at "2000.05.04."
//        Lorem ipsum dolor sit amet.
//        "Wait but why" titled by Tim Urban posted at "2010.10.10."
//        A popular long-form, stick-figure-illustrated blog about almost everything.
//        "One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
//        Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked
//        to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into
//        the whole organizer profile thing.

package blog;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Blog myBlog = new Blog(initializeBlogPosts());

        System.out.println(myBlog);
        myBlog.addPost(new BlogPost("Standa Koumar", "Presentation", "Bla, bla, bla, blue bla", "2019.04.17"));
        System.out.println(myBlog);
        myBlog.deletePost(0);
        System.out.println(myBlog);
        myBlog.updatePost(1, new BlogPost("Standa Koumar", "Code", "ohhh yeahh", "2019.04.17"));
        System.out.println(myBlog);
    }

    public static List<BlogPost> initializeBlogPosts() {
        List<BlogPost> blogPostList = new ArrayList<>();
        blogPostList.add(new BlogPost("John Doe", "Loren Ipsum", "Lorem" +
                " ipsum dolor sit amet.", "2000.05.04."));
        blogPostList.add(new BlogPost("Tim Urban", "Wait but why", "A popular long-form," +
                " stick-figure-illustrated blog about almost everything.", "2010.10.10."));
        blogPostList.add(new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon" +
                " With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center" +
                " of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told" +
                " me that he wasn’t really into the whole organizer profile thing.", "2017.03.28."));
        blogPostList.add(new BlogPost("John Snow", "Cold", "Now, it's" +
                " really cold.", "2000.05.04."));
        return blogPostList;
    }
}
