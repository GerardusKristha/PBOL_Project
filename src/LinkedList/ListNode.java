package LinkedList;


/**
 *
 * @author G.Kristha Program by : Gerardus Kristha_215314004
 */
public class ListNode implements Comparable{

    private Object element;
    private ListNode next;
    private ListNode prev;

    public ListNode() {
    }
    
    public ListNode(Object element) {
        this(element, null, null);
    }

    public ListNode(Object element, ListNode next, ListNode prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }

    @Override
    public int compareTo(Object o) {
        return ((Comparable)element).compareTo(o);
    }

}
