/**
 * Created by Gabor on 03/04/2017.
 */
public class Main {

  public static void main(String[] args) {
    PostIt first = new PostIt("BLUE", "ORANGE", "IDEA 1");
    PostIt second = new PostIt("BLACK", "PINK", "AWESOME");
    PostIt third = new PostIt("GREEN", "YELLOW", "Superb");

    BlogPost one = new BlogPost();
    one.authorName = "John Doe";
    one.title = "Lorem Ipsum";
    one.text = "Lorem ipsum dolor sit amet.";
    one.publicationDate = "2000.05.04";

    BlogPost two = new BlogPost();
    two.authorName = "Tim Urban";
    two.title = "Wait but why";
    two.text = "One Engineer Is Trying to Get IBM to Reckon With Trump";
    two.publicationDate = "2010.10.10";

    BlogPost three = new BlogPost();
    three.authorName = "William Turton";
    three.title = "A popular long-form, stick-figure-illustrated blog about almost everything.";
    three.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
    three.publicationDate = "2017.03.28";
  }



}
