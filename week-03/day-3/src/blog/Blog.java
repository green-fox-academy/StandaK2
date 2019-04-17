//Reuse your BlogPost class
//Create a Blog class which can
//        store a list of BlogPosts
//        add BlogPosts to the list
//        delete(int) one item at given index
//        update(int, BlogPost) one item at the given index and update it with another BlogPost

package blog;

import java.util.List;

public class Blog {

    List<BlogPost> blogPostList;

    public Blog(List<BlogPost> blogPostList) {
        this.blogPostList = blogPostList;
    }

    public void addPost(BlogPost newPost) {
        this.blogPostList.add(newPost);
    }

    public void deletePost(int index) {
        this.blogPostList.remove(index);
    }

    public void updatePost(int index, BlogPost newPost) {
        this.blogPostList.add(index, newPost);
        this.blogPostList.remove(index + 1);
    }

    @Override
    public String toString() {
        String result = "";
        for (BlogPost blogPost : this.blogPostList) {
            result += (blogPost.authorName + ", " + blogPost.publicationDate + ", " + blogPost.title + ", " + blogPost.text) + "\n";
        }
        return result;
    }
}
