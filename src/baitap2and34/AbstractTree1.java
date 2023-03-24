package baitap2and34;

public class AbstractTree1<E> implements Tree<E>{
    @Override
    public boolean insert(E e) {
        return false;
    }

    @Override
    public void inorder() {

    }

    @Override
    public int size() {
        return 0;
    }
}
