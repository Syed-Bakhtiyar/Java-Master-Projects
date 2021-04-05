package interfaces_abstract_and_inner_classes.abstract_classes.custom_linked_lists_big_picture;

public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);

}
