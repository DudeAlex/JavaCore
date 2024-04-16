package collections.linkedlistperson;
/*Doubly Linked List
        Implement a doubly linked list of person nodes. Create a class PersonNode and a class List for this purpose. The
         List class should know the start node of the list. Each person node should have attributes for age and last name,
         and it should know its predecessor and successor.
        a) The List class should have a method for sorted insertion of a PersonNode object. The sorting should be based
        on the person's age.
        b) It should be possible to search for person nodes based on the last name. Implement a method that returns the
        first person node found with the matching last name.
        c) Create five PersonNode objects and insert them into the list using your implemented method for sorted insertion.
         Print the contents of the list twice: once by traversing the list forward, and once by traversing backward from
         the end to the front.
*/
public class ListPerson {
    PersonNode start;
    private static class PersonNode{
        String name;
        int age;
        PersonNode previous;
        PersonNode next;
        private PersonNode(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
    public void insert(String name, int age){
        PersonNode newPersonNode = new PersonNode(name,age);
        if(start==null){
            start = newPersonNode;
            return;
        }

        PersonNode current = start;

        while (current.next != null){
            current = current.next;
        }

        current.next = newPersonNode;
        newPersonNode.previous = current;

        sort();
    }

    private void sort() {
        if(start == null || start.next == null) return;

        PersonNode lazy = start;
        PersonNode quick;

        while (lazy != null) {
            quick = lazy;
            while (quick != null) {
                if (compareTo(lazy, quick) > 0) {
                    swap(lazy, quick);
                }
                quick = quick.next;
            }
            lazy = lazy.next;
        }
    }

    private void swap(PersonNode pn1, PersonNode pn2){

        String tempName = pn1.name;
        int tempAge = pn1.age;

        pn1.name = pn2.name;
        pn1.age = pn2.age;

        pn2.name = tempName;
        pn2.age = tempAge;
    }
    private int compareTo(PersonNode pn1, PersonNode pn2){

        return Integer.compare(pn1.age, pn2.age);
    }
    public void display(){
        PersonNode current = start;

        while (current.next != null){
            current = current.next;

            System.out.print(current.previous.name + current.previous.age + " ");
            System.out.print(current.name + current.age + " ");

            if(current.next == null) break;

            System.out.print(current.next.name + current.next.age + " ");
            System.out.println();
            System.out.println("---------");
        }
    }

    public int search(String name){

        return 0;
    }
}
