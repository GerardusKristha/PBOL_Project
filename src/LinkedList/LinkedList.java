package LinkedList;

import java.util.NoSuchElementException;


/**
 *
 * @author G.Kristha Program by : Gerardus Kristha_215314004
 */
public class LinkedList {

    private ListNode head;
    private int size;

    public LinkedList() {
        head = new ListNode();
        head.setNext(head);
        head.setPrev(head);
        size = 0;
    }

    private void addBefore(Object element, ListNode assist) {
        ListNode newNode = new ListNode(element);
        newNode.setNext(assist);
        newNode.setPrev(assist.getPrev());
        (assist.getPrev()).setNext(newNode);
        assist.setPrev(newNode);
        size++;
    }

    private Object remove(ListNode assistRemove) {
        if (!isEmpty()) {
            (assistRemove.getNext()).setPrev(assistRemove.getPrev());
            (assistRemove.getPrev()).setNext(assistRemove.getNext());
            size--;
        } else {
            throw new NoSuchElementException("List is empty");
        }
        return assistRemove.getElement();
    }

    public void addFirst(Object element) {
        addBefore(element, head.getNext());
    }

    public void addLast(Object element) {
        addBefore(element, head);
    }

    public Object removeFirst() {
        return remove(head.getNext());
    }

    public Object removeLast() {
        return remove(head.getPrev());
    }

    public ListNode search(Object element) {
        ListNode temp = head.getNext();
        while (temp != head) {
            if ((temp).compareTo(element)==0){
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void print() {
        String output = new String();
        ListNode indeks = head.getNext();
        while (indeks != head) {
            output += indeks.getElement().toString() + "\n";
            indeks = indeks.getNext();

        }
        System.out.println(output);
    }
}
