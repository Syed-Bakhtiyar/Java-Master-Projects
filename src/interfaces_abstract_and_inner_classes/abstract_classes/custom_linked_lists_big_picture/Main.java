package interfaces_abstract_and_inner_classes.abstract_classes.custom_linked_lists_big_picture;

public class Main {
    public static void main(String[] args) {

        CustomLinkedList list = new CustomLinkedList(null);
        list.traverse(list.getRoot());

        String stringData = "5 7 3 9 8 2 1 0 4 6";
        String[] data = stringData.split(" ");
        for (String s: data){
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());
        list.removeItem(new Node("3"));
        list.traverse(list.getRoot());
    }
}
