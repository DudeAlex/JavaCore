package collections.prog1prufung.fahrstrecke.timeline;

public class Timeline {

    Post first;
    Post last;


    public void addPost(Post post){
        if(first == null) {
            first = post;
            last = post;
            return;
        }
        Post current = first;
        Post temp = first;
        while(current.receiver != null){
            current = current.receiver;
            current.sender = temp;
            temp = current;
        }
        current.receiver = post;
        post.sender = temp;
        last = post;
    }


    public void gibAus(){
        Post current = last;

        while (current.sender != null){
            System.out.println(current.text);
            current = current.sender;
        }
        System.out.println(current.text);
    }

    public void gibAusNorm(){
        Post current = first;

        while (current.receiver != null){
            System.out.println(current.text);
            current = current.receiver;
        }
        System.out.println(current.text);
    }
}
