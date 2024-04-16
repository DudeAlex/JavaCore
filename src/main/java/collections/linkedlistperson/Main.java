package collections.linkedlistperson;

public class Main {
    public static void main(String[] args) {
        ListPerson list = new ListPerson();

        list.insert("Eee", 100);
        list.insert("Fff", 11);
        list.insert("Ggg", 23);
        list.insert("Kkk", 6);
        list.insert("Hhh", 5);
        list.insert("Aaa", 19);
        list.insert("Bbb", 29);
        list.insert("Ccc", 49);
        list.insert("Ddd", 9);

        list.display();
    }
}
