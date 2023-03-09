package owl.edu.vn;

public class MyLinkedList {

    private int numNodes;
    private Node head;

    public MyLinkedList() {
        numNodes = 0;
        head = null;
    }

    public void add(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        numNodes++;
    }

    public void addFirst(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        numNodes++;
    }

    public void addLast(Object data) {
        add(data);
    }

    // other methods
    // Phương thức xóa 1 phần tử tại vị trí index
    public void remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }

        if (index == 0) {
            head = head.next;
        } else {
            Node previous = head;
            for (int i = 0; i < index - 1; i++) {
                previous = previous.next;
            }
            previous.next = previous.next.next;
        }

        numNodes--;
    }

    // Phương thức xóa 1 phần tử cho trước
    public boolean remove(Object o) {
        Node previous = null;
        Node current = head;

        while (current != null) {
            if (current.data.equals(o)) {
                if (previous == null) {
                    head = current.next;
                } else {
                    previous.next = current.next;
                }

                numNodes--;
                return true;
            }

            previous = current;
            current = current.next;
        }

        return false;
    }

    // Phương thức truy cập một phần tử trong danh sách
    public Object get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    // Phương thức size trả về số lượng các phần tử có trong danh sách
    public int size() {
        return numNodes;
    }

    // Phương thức printList() in các phần tử trong danh sách
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Phương thức clone thực hiện sao chép danh sách ra 1 danh sách khác
    public MyLinkedList clone() {
        MyLinkedList cloneList = new MyLinkedList();
        Node current = head;
        while (current != null) {
            cloneList.add(current.data);
            current = current.next;
        }
        return cloneList;
    }

    // Phương thức contains kiểm tra phần tử o có trong danh sách không
    public boolean contains(Object o) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(o)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Phương thức indexOf trả về vị trí của phần tử o trong danh sách
    public int indexOf(Object o) {
        int index = 0;
        Node current = head;
        while (current != null) {
            if (current.data.equals(o)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }
}
