
public class LinkedList {

    Node first;
    Node last;

    public <T> void add(T x) {
        Node newNode = new Node(x);
        if (first == null) {
            first = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
    }

    public void remove() {
        if (first.equals(last)) {
            first = null;
            last = null;
        }

        if (first == null) {
            System.out.println("-- empty --");
            return;
        } else {
            Node tmp = first;
            Node tmp2 = first;
            while (tmp.next != null) {
                tmp2 = tmp;
                tmp = tmp.next;
            }
            tmp2.next = null;
            last = tmp2;
        }
    }

    public void print() {
        if (first == null) {
            System.out.println("-- empty --");
        }
        Node tmp = first;
        while (tmp != null) {
            System.out.print(tmp.data + ", ");
            tmp = tmp.next;
        }
        System.out.println("");
    }
}
