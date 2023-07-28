package com.coding.challange.tree;

import java.util.ArrayList;
import java.util.List;

public class Tree {

    public static void main(String[] args) {

        var leftChild = new Node();
        leftChild.setName("leftChild");

        var rightChild = new Node();
        rightChild.setName("rightChild");

        var parent = new Node("ParentNode", leftChild, rightChild);
        inOrder(parent);
    }

    public static void inOrder(Node parent) {
            if(parent==null){
                return;
            }
            inOrder(parent.getLeftChild());
            System.out.print(printData(parent)+"->");
            inOrder(parent.getRightChild());
    }

        public static String printData(Node node){
            return node.getName();
        }
    }

    class Node {
        private String name;
        private Node leftChild;
        private Node rightChild;

        public Node(String name, Node leftChild, Node rightChild) {
            this.name = name;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }

        public Node() {

        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setLeftChild(Node child) {
            this.leftChild = child;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public void setRightChild(Node child) {
            this.rightChild = child;
        }

        public Node getRightChild() {
            return rightChild;
        }
    }
