package hausaufgabe.lektion21.binarbaum;

public class Binarbaum {

    Element root;


    private class Element {

        String name;
        Element right;
        Element left;

        private Element(String name){
            this.name = name;
        }

        public void insert(String name){
            root = addRecursive(root, name);
        }


        private Element addRecursive(Element current, String name){
            if(current == null) {
                return new Element(name);
            }
            if(current.name.compareTo(name) < 0){
                current.right = addRecursive(current.right, name);
            } else if(current.name.compareTo(name) > 0){
                current.left = addRecursive(current.left, name);
            }
            return current;
        }

    }
}
