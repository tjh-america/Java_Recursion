/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_3_thomas_harrigan;

/**
 *
 * @author user
 */
class LinkList {

     Node head = null;

    public void append(int val) {
        Node lastNode = getLastNode();
        if (lastNode == null) {
            head = new Node(val);
        } else {
            lastNode.next = new Node(val);
        }
    }

    public void delete(int val) {
        if(head == null){
            return;
        }

        Node prevNode = null;
        Node currNode = head;
        while (currNode != null && currNode.num != val) {
            prevNode = currNode;
            currNode = currNode.next;
        }
        if(prevNode == null){
            head = head.next;
            return;
        }
        if (currNode == null) {
            System.out.println("A node with that value does not exist.");
            return;
        }
        prevNode.next = currNode.next;
    }
    
    public Node head(){
        return head;
    }
    public void print() {
        System.out.println("");
        if(head == null){
            System.out.print("EMPTY");
            return;
        }
        Node tmpNode = head;
        while (tmpNode != null) {
            System.out.print(tmpNode.num + " -> ");
            tmpNode = tmpNode.next;
        }
    }

    private Node getLastNode() {
        if (head == null) {
            return null;
        }
        Node tmpNode = head;
        while (tmpNode.next != null) {
            tmpNode = tmpNode.next;
        }
        return tmpNode;
    }
}