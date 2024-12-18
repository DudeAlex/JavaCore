package collections.prog1prufung.fahrstrecke.fussball;

public class Baum {

    Knoten root;

    public Baum(Knoten knoten){
        this.root = knoten;
    }

    public void einfugen(Mannschaft mannschaft){
        root = einfugen(root, mannschaft);
    }

    private Knoten einfugen(Knoten current, Mannschaft mannschaft){
        if(current == null) {
            return new Knoten(mannschaft);
        }

        if(mannschaft.name.compareTo(current.getMannschaft().name) < 0){
            current.setLeft(einfugen(current.left, mannschaft));
        } else if(mannschaft.name.compareTo(current.getMannschaft().name) > 0){
            current.setRight(einfugen(current.right, mannschaft));
        }
        return current;
    }


    public Mannschaft maxTore() {
        return maxTore(root, root.getMannschaft());
    }

    private Mannschaft maxTore(Knoten current, Mannschaft maxMannschaft){
        if (current == null){
            return maxMannschaft;
        }

        if(current.getMannschaft().getToren() > maxMannschaft.getToren()){
            maxMannschaft = current.getMannschaft();
        }

        maxMannschaft = maxTore(current.getLeft(), maxMannschaft);
        maxMannschaft = maxTore(current.getRight(), maxMannschaft);

        return maxMannschaft;




        /*if(root == null) return null;
        else{
            int maxGoal = root.getMannschaft().getToren();
            Knoten current = root;


            while(current.left != null) {
                current = current.left;
                search(current);
            }
            while (current.right != null){
                current = current.right;
                search(current);
            } */
    }

}

    /*private void search(Knoten current){

        int maxGoal = current.getMannschaft().getToren();

        while(current.left != null) {
            current = current.left;
            if(maxGoal < current.getMannschaft().getToren()) maxGoal = current.getMannschaft().getToren();
        }
        while (current.right != null){
            current = current.right;
            if(maxGoal < current.getMannschaft().getToren()) maxGoal = current.getMannschaft().getToren();
        }*/


