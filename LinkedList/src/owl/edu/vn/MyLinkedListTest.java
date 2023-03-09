package owl.edu.vn;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();
        // MyLinkedList<String> myList = new MyLinkedList<>();


        // test add()
        myList.add("apple");
        myList.add("banana");
        myList.add("cherry");

        // test addFirst()
        myList.addFirst("orange");

        // test addLast()
        myList.addLast("grape");

        // test remove(int index)
        myList.remove(2); // remove "cherry"

        // test remove(Object o)
        myList.remove("banana");

        // test get()
        System.out.println("Element at index 1: " + myList.get(1));

        // test size()
        System.out.println("Size of list: " + myList.size());

        // test printList()
        myList.printList();

        // Sao chép danh sách gốc sang một danh sách mới
        MyLinkedList clonedList = myList.clone();

        // test printList()
        System.out.println("print new list");
        clonedList.printList();

    }
}
