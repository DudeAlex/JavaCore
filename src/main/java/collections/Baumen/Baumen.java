package collections.Baumen;

public class Baumen {

    BaumenNode root;
    public void einfuegen(BaumenNode neu){
        if (root == null) root = neu;
        else einfuegen(root, neu);
    }
    private void einfuegen(BaumenNode temp, BaumenNode neu) {
        if (neu.getWort().compareTo(temp.getWort()) < 0) {
            if (temp.left == null) temp.left = neu;
            else einfuegen(temp.left, neu);
        }
        else {
            if (temp.right == null) temp.right = neu;
            else einfuegen(temp.right, neu);
        }
    }

}

class BaumenNode {
    String wort;
    String bedeutung;
    BaumenNode left;
    BaumenNode right;

    BaumenNode(String wort, String bedeutung) {
        this.wort = wort;
        this.bedeutung = bedeutung;
    }


    public String getWort() {
        return wort;
    }

    public void setWort(String wort) {
        this.wort = wort;
    }

    public String getBedeutung() {
        return bedeutung;
    }

    public void setBedeutung(String bedeutung) {
        this.bedeutung = bedeutung;
    }

    public BaumenNode getLeft() {
        return left;
    }

    public void setLeft(BaumenNode left) {
        this.left = left;
    }

    public BaumenNode getRight() {
        return right;
    }

    public void setRight(BaumenNode right) {
        this.right = right;
    }
}