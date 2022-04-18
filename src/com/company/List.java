package com.company;

public class List {
    private Node head;

    public List() {
        this.head = null;
    }

    public List(int value) {

    }

    public List(Node head) {
        this.head = head;
    }


    public void printList() {
        Node tmpNose = this.head;
        while (tmpNose != null) {
            System.out.println(tmpNose.getValue());
            tmpNose = tmpNose.getNextNode();
        }
    }


    public void push(int value) {
        Node tmpNode = this.head;
        while (tmpNode.getNextNode() != null) {
            tmpNode = tmpNode.getNextNode();
        }
        tmpNode.setNextNode(new Node(value));
    }

    public void push(int value, int index) {
        if (index == 0) {
            this.pushHead(value);
        } else {
            Node tmpNode = this.head;
            for (int i = 0; i < index - 1 && tmpNode.getNextNode() != null; i++) {
                tmpNode = tmpNode.getNextNode();
            }
            Node nextNode = new Node(value, tmpNode.getNextNode());
            tmpNode.setNextNode(nextNode);
        }
    }

    private void pushHead(int value) {
        Node tmpNode = new Node(value, this.head);
        this.head = tmpNode;
    }

    public void pop() {
        Node tmpNode =  this.head;
        while (tmpNode.getNextNode().getNextNode() != null) {
            tmpNode = tmpNode.getNextNode();
        }
        tmpNode.setNextNode(null);
    }

    public void popIndex(int index) {
        if (index == 0) {
            this.popHead();
        } else {
            Node tmpNode = this.head;
            for (int i = 0; i < index - 1 && tmpNode.getNextNode().getNextNode() != null; i++) {
                tmpNode = tmpNode.getNextNode();
            }
            tmpNode.setNextNode(tmpNode.getNextNode().getNextNode());
        }
    }

    private void popHead() {
     this.head = this.head.getNextNode();
    }
}
