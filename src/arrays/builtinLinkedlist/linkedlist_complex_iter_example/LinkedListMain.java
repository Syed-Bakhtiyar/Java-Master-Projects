package arrays.builtinLinkedlist.linkedlist_complex_iter_example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * for reference checkout commented code below
 */
public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<String> countryNames = new LinkedList<>();
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add("hello");
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add("array");
//        ListIterator listIterator = arrayList.listIterator();
//
//        while (listIterator.hasNext()){
//            System.out.println(listIterator.next());
//        }
        System.out.println(linkedList.get(0) + " " + linkedList.get(1) + " " + linkedList.isEmpty() + "\n" +
                            arrayList.get(0) + " " + arrayList.get(1));
//        countryNames.add("Pakistan");
//        countryNames.add("America");
//        countryNames.add("Indi");
//        countryNames.add("Saudi Arabia");
//        countryNames.add("Afghanistan");
//        countryNames.add("Iran");
//        countryNames.add("Iraq");
//        printCountryNames(countryNames);
//
//        countryNames.add(1, "Africa");
//        printCountryNames(countryNames);
//
//        countryNames.remove(1);
//        printCountryNames(countryNames);
//
//        countryNames.set(2, "India");
//        printCountryNames(countryNames);

        addInOrder(countryNames, "Bangladesh");
        addInOrder(countryNames, "Pakistan");
        addInOrder(countryNames, "America");
        printCountryNames(countryNames);

        boolean isGoingForward = true;
        ListIterator listIterator = countryNames.listIterator();
        if(isGoingForward && listIterator.hasPrevious()){
            listIterator.previous();
            isGoingForward = false;
        }
        System.out.println(listIterator.next());
        if(isGoingForward && listIterator.hasPrevious()){
            listIterator.previous();
            isGoingForward = false;
        }
        System.out.println(listIterator.next());
        if(isGoingForward){
            listIterator.previous();
            isGoingForward = false;
        }
        System.out.println(listIterator.previous());
        if(!isGoingForward){
            listIterator.next();
            isGoingForward = true;
        }
        System.out.println(listIterator.previous());
        if(!isGoingForward){
            listIterator.next();
            isGoingForward = true;
        }
        System.out.println(listIterator.next());

    }

    private static void printCountryNames(LinkedList<String> countryNames){
        Iterator<String> iterateCountryNames = countryNames.iterator();
        while (iterateCountryNames.hasNext()){
            System.out.println("Country: " + iterateCountryNames.next());
        }
        System.out.println("------------------------");
    }

    private static void addInOrder(LinkedList<String> linkedList, String newCountry){
        System.out.println("List Iterator");
        ListIterator<String> listIterator = linkedList.listIterator();

        while (listIterator.hasNext()){
            int comparison = listIterator.next().compareTo(newCountry);
            // if compareTo returns 0 means both are equal
            // if comparision is > 0 then then list item contains greater then and new item should appear before this item
            // if comparision is < 0 then then list item contains less then and new item should appear after this item
            if(comparison == 0){
                System.out.println("Already in the list");
                return;
            } else if (comparison > 0){
                // new city should appear before this one
                // Bangladesh -> America  America should be previously inserted
                listIterator.previous();
                listIterator.add(newCountry);
                return;
            } else if (comparison < 0){
                // move On to next city
            }
//            System.out.println("Country: " + listIterator.next());
        }
        listIterator.add(newCountry);
        System.out.println("------------------------");
    }
}


/**
 *
 */







//
//
//
//
//package com.timbuchalka;
//
//        import java.util.Iterator;
//        import java.util.LinkedList;
//        import java.util.ListIterator;
//        import java.util.Scanner;
//
///**
// * Created by dev on 16/09/15.
// */
//public class Demo {
//    public static void main(String[] args) {
//        LinkedList<String> placesToVisit = new LinkedList<String>();
//        addInOrder(placesToVisit, "Sydney");
//        addInOrder(placesToVisit, "Melbourne");
//        addInOrder(placesToVisit, "Brisbane");
//        addInOrder(placesToVisit, "Perth");
//        addInOrder(placesToVisit, "Canberra");
//        addInOrder(placesToVisit, "Adelaide");
//        addInOrder(placesToVisit, "Darwin");
//        printList(placesToVisit);
//
//        addInOrder(placesToVisit, "Alice Springs");
//        addInOrder(placesToVisit, "Darwin");
//        printList(placesToVisit);
//        visit(placesToVisit);
//    }
//
//    private static void printList(LinkedList<String> linkedList) {
//        Iterator<String> i= linkedList.iterator();
//        while(i.hasNext()) {
//            System.out.println("Now visiting " + i.next());
//        }
//        System.out.println("=========================");
//    }
//
//    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
//        ListIterator<String> stringListIterator = linkedList.listIterator();
//
//        while(stringListIterator.hasNext()) {
//            int comparison = stringListIterator.next().compareTo(newCity);
//            if(comparison == 0) {
//                // equal, do not add
//                System.out.println(newCity + " is already included as a destination");
//                return false;
//            } else if(comparison > 0) {
//                // new City should appear before this one
//                // Brisbane  -> Adelaide
//                stringListIterator.previous();
//                stringListIterator.add(newCity);
//                return true;
//            } else if(comparison < 0) {
//                // move on next city
//            }
//        }
//
//        stringListIterator.add(newCity);
//        return true;
//    }
//
//    private static void visit(LinkedList cities) {
//        Scanner scanner = new Scanner(System.in);
//        boolean quit = false;
//        boolean goingForward = true;
//        ListIterator<String> listIterator = cities.listIterator();
//
//        if(cities.isEmpty()) {
//            System.out.println("No cities in the itenerary");
//            return;
//        } else {
//            System.out.println("Now visiting " + listIterator.next());
//            printMenu();
//        }
//
//        while (!quit) {
//            int action = scanner.nextInt();
//            scanner.nextLine();
//            switch(action) {
//                case 0:
//                    System.out.println("Holiday (Vacation) over");
//                    quit = true;
//                    break;
//
//                case 1:
//                    if(!goingForward) {
//                        if(listIterator.hasNext()) {
//                            listIterator.next();
//                        }
//                        goingForward = true;
//                    }
//                    if(listIterator.hasNext()) {
//                        System.out.println("Now visiting " + listIterator.next());
//                    } else {
//                        System.out.println("Reached the end of the list");
//                        goingForward = false;
//                    }
//                    break;
//
//                case 2:
//                    if(goingForward) {
//                        if(listIterator.hasPrevious()) {
//                            listIterator.previous();
//                        }
//                        goingForward = false;
//                    }
//                    if(listIterator.hasPrevious()) {
//                        System.out.println("Now visiting " + listIterator.previous());
//                    } else {
//                        System.out.println("We are at the start of the list");
//                        goingForward = true;
//                    }
//                    break;
//
//                case 3:
//                    printMenu();
//                    break;
//
//            }
//
//        }
//    }
//
//    private static void printMenu() {
//        System.out.println("Available actions:\npress ");
//        System.out.println("0 - to quit\n" +
//                "1 - go to next city\n" +
//                "2 - go to previous city\n" +
//                "3 - print menu options");
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//}





