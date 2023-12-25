
public class Node<T> {

    T data;
    Node next;

    public Node(T x) {
        data = x;
    }

    public void setData(T x) {
        data = x;
    }

    public T getData() {
        return data;
    }
}
