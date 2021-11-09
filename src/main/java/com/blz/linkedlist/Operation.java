package com.blz.linkedlist;

public class Operation {
    LinkedList linkedList = new LinkedList();
    public void addDataAtStart(){
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.print();
    }
    public void addDataAtEnd(){
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.print();
    }
    public void addDataAtMiddle(){
        Node secondNode = linkedList.push(70);
        Node firstNode = linkedList.push(56);
        Node newNode = new Node(30);
        linkedList.print();
        System.out.println("");
        linkedList.insertInBetween(firstNode, newNode);
        linkedList.print();
    }
    public void deleteFirstNode() {
        addDataAtStart();
        System.out.println("");
        Node deleteNode = linkedList.pop();
        linkedList.print();

    }
    public void deleteLastNode() {
        addDataAtStart();
        System.out.println("");
        linkedList.popLast();
        linkedList.print();

    }
}
