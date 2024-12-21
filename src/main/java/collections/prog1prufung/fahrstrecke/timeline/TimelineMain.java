package collections.prog1prufung.fahrstrecke.timeline;

public class TimelineMain {
    public static void main(String[] args) {

        Post post = new Post("Hello");
        Post post2 = new Post("How are you?");
        Post post3 = new Post("I'm fine");
        Post post4 = new Post("Good");


        Timeline timeline = new Timeline();
        timeline.addPost(post);
        timeline.addPost(post2);
        timeline.addPost(post3);
        timeline.addPost(post4);
        timeline.gibAus();

        System.out.println();

        timeline.gibAusNorm();
    }
}
