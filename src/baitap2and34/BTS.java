package baitap2and34;

import javax.xml.soap.Node;

public class BTS<E extends Comparable> extends AbstractTree1<E> {
    public static void main(String[] args) {
        BTS<Integer> bts = new BTS<>();
        bts.insert(78);
        bts.insert(88);
        bts.insert(66);
        bts.insert(44);
        bts.insert(100);
        bts.insert(68);
        bts.insert(80);
        bts.insert(85);
        bts.insert(83);
        bts.inorder();
        System.out.println("********");
        bts.delete(88);
        bts.inorder();

    }
    protected TreeNode<E> root;
    protected int size =0;

    protected TreeNode<E> NewNode(E e){
        return new TreeNode<>(e);
    }
    public boolean insert(E e){
        if (root == null){
            root = NewNode(e);
        }else {
            TreeNode<E> parent= null;
            TreeNode<E> currunt= root;
            while (currunt != null){
                if (e.compareTo(currunt.element)<0){
                    parent=currunt;
                    currunt=currunt.left;
                }else if (e.compareTo(currunt.element)>0){
                    parent = currunt;
                    currunt=currunt.right;
                }else
                return false;
            }
            if (e.compareTo(parent.element)<0){
                parent.left = NewNode(e);
            }else parent.right=NewNode(e);
        }
        size++;
        return true;
    }
    public void delete(E e){
        TreeNode<E> parent = NewNode(e);
        TreeNode<E> current = parent.right;
        System.out.println("crruent" + current);
        while (current!=null && current.left!=null){
            current = current.left;
        }
        parent = current;
        current=null;
    }
    @Override
    public void inorder(){
        inorder(root);
    }
    protected void inorder(TreeNode<E> node){
        if (node==null) return;
        inorder(node.left);
        System.out.println(node.element + " ");
        inorder(node.right);
    }
    public void printPostOrder(TreeNode<E> root){
        printPostOrder(this.root);
    }

}
