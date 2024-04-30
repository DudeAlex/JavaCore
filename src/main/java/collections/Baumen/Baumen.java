package collections.Baumen;

public class Baumen {

    BaumenNode root;

    public void einfugen(BaumenNode neu){
        if(root == null) root = neu;
        else einfugen(root, neu);
    }

    private void einfugen(BaumenNode temp, BaumenNode neu){
        if(neu.getWort().compareTo(temp.getWort()) > 0){
            if(temp.right == null) temp.right = neu;
            else einfugen(temp.right, neu);
        } else{
            if(temp.left == null) temp.left = neu;
            else einfugen(temp.left, neu);
        }
    }

    public void display(){
        display(root);
    }

    private void display(BaumenNode root){
        if(root != null){
            display(root.left);
            System.out.println(root.getWort() + " " + root.getBedeutung());
            display(root.right);
        }
    }

//    public String search(String wort){
//        BaumenNode baumenNode = new BaumenNode(wort, null);
//        return search(root, baumenNode);
//    }
//
//    private String search(BaumenNode root, BaumenNode temp){
//        if(root != null && root.getWort().equals(temp.getWort())){
//            return temp.getBedeutung();
//        }
//        if(root.getWort().compareTo(temp.getWort()) < 0){
//            return search(temp.right, temp);
//        } else{
//            return search(temp.left, temp);
//        }
//    }
public String search(String wort){
        if(root==null) return null;

        BaumenNode baumenNode = new BaumenNode(wort, null);
        return search(root, baumenNode);
}

    private String search(BaumenNode root, BaumenNode temp){
        if(root != null && root.getWort().equals(temp.getWort())){
            return root.getBedeutung();
        }
        if(root.getWort().compareTo(temp.getWort()) < 0){
            return search(root.right, temp);
        } else{
            return search(root.left, temp);
        }
    }

    public void delete(){

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