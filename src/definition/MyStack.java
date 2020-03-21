package definition;

import adt.AdtStack;

import java.util.NoSuchElementException;

public class MyStack<E> implements AdtStack<E> {

    private Node<E> top = null;

    private int size = 0;


    @Override
    public E peek() {
        E reponse=null;

        if(this.isEmpty ()){
            throw new NoSuchElementException ("Stack underFlow!!!");
        }
        else{
            Node<E> topNode=top;
            reponse=topNode.getData ();
        }

        return reponse;
    }

    @Override
    public E pop() {
        E reponse=null;

        Node<E> temp=top;

        if(temp!=null){
            reponse=temp.getData ();

            top=top.getNext ();

            size--;
        }

        return reponse;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public void push(E item) {
        top= new Node<> ( item ,top );
        size++;

    }

    private static class Node<E>{
        private E data;
        private Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }
    }
}
