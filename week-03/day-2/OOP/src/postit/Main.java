/*Create a few example post-it objects:
        an orange with blue text: "Idea 1"
        a pink with black text: "Awesome"
        a yellow with green text: "Superb!"*/

package postit;

public class Main {

    public static void main(String[] args) {

    PostIt postIt1 = new PostIt("orange", "Idea 1", "blue");
    PostIt postIt2 = new PostIt("pink", "Awesome", "black");
    PostIt postIt3 = new PostIt("yellow", "Superb!", "green");

        System.out.println(postIt1.backgroundColor + ", " + postIt1.text + ", " + postIt1.textColor);
        System.out.println(postIt2.backgroundColor + ", " + postIt2.text + ", " + postIt2.textColor);
        System.out.println(postIt3.backgroundColor + ", " + postIt3.text + ", " + postIt3.textColor);
    }
}
