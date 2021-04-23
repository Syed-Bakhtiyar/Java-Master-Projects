package arrays.arraylists.mobile;

import java.util.ArrayList;

public class Mobile {
    private ArrayList<Contacts> arrayList;

    public Mobile(){
        arrayList = new ArrayList<>();
    }

    public void addContact(String name, String number){
        if(this.searchContact(name) == null){
            arrayList.add(new Contacts(name, number));
            System.out.println(name + " with contact " + number + " has been added to the list.");
        } else {
            System.out.println("Contact already exist");
        }
    }

    public void updateContact(String oldName, String newName, String number){
        int index = -1;
        for (int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i).getName().contains(oldName)){
                index = i;
            }
        }
        Contacts contacts = searchContact(newName);
        if(contacts != null){
            System.out.println(newName + " already exists.");
            return;
        }
        if(index >= 0){
            arrayList.get(index).setName(newName);
            arrayList.get(index).setNumber(number);
        }
    }

    public void removeContact(String name){
        for (int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i).getName().contains(name)){
                arrayList.remove(i);
                return;
            }
        }
    }

    public void printContacts(){
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i).getName());
            System.out.println(arrayList.get(i).getNumber());
            System.out.println("---------------------------");
        }
    }

    public Contacts searchContact(String name){
        for (int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i).getName().contains(name)){
                return arrayList.get(i);
            }
        }
        return null;
    }
}
