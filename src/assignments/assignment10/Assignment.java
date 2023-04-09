package assignments.assignment10;
import java.util.*;
class sList<T>{
    public ArrayList<T> iterator(){
        ArrayList<T> l=new ArrayList<>();
        SListIterator.Node<T> head=SListIterator.Node.head;
        SListIterator.Node<T> temp=head;
        while (temp != null) {
            l.add(temp.data);
            temp = temp.next;
        }
        return l;
    }
    public void toStringMethod(){
        ArrayList<T> l=iterator();
        StringBuilder b=new StringBuilder("Elements are : ");
        for(T i:l){
            b.append(i+" ");
        }
        System.out.println(b);
    }
}
class SListIterator<T> {
    public static class Node<T> {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }

        public static Node head = null;
    }

    public void insert(T data) {
        Node node = new Node(data);
        if (Node.head == null) {
            Node.head = node;
            return;
        }
        Node temp = Node.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void remove() {
        Node head = Node.head;
        if (head == null) {
            return;
        }
        if (head.next == null) {
            Node.head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
}

class Assignment {
    public static void main(String args[]) {
//        SListIterator<Integer> it = new SListIterator();
//        sList<Integer> l=new sList();
//        it.insert(10);
//        it.insert(20);
//        it.insert(30);
//        it.insert(40);
//        l.toStringMethod();
//        it.remove();
//        l.toStringMethod();
//        SListIterator<Character> c=new SListIterator<>();
//        c.insert('a');
//        c.insert('c');
//        c.insert('A');
//        sList<Character> s=new sList<>();
//        s.toStringMethod();
//        c.remove();
//        s.toStringMethod();
        SListIterator<String> a=new SListIterator<>();
        a.insert("haii");
        a.insert("hello");
        a.insert("Happy Learning");
        sList<String> A=new sList<>();
        A.toStringMethod();
        a.remove();
        A.toStringMethod();
    }
}



