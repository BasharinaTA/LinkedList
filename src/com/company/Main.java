package com.company;

public class Main {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        List list1 = new List(node1);

        node1.setNextNode(node2);
        node2.setNextNode(node3);
        node3.setNextNode(node4);
//        System.out.println(node1.getValue());
//        System.out.println(node1.getNextNode().getNextNode());
//        System.out.println(node1.getNextNode().getNextNode().getNextNode());
      //  list1.printList();
      //  list1.push(15);
      //  list1.printList();
     //   list1.push(44, 500);
     //   list1.printList();
       // list1.push(45, 0);
     //   list1.printList();
        list1.printList();
     //   list1.pop();
       // list1.printList();
        list1.popIndex(0);
        list1.printList();
    }

}
