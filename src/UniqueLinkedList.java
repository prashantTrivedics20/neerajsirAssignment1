import java.util.Scanner;
// In a sorted linked list (elements are sorted in ascending order),
// eliminate duplicates from the given linked list, such that output linked list contains only unique elements.
public class UniqueLinkedList {
    // Node
    class Node
    {
        int data;
        Node next;
    }
    class LinkedList {
        Node head;
        Node tail;
        int size;
        void input(int val) {
            if (size == 0) {
                Node newNode = new Node();
                newNode.data = val;
                if (newNode.data == -1) {
                    return;
                }
                newNode.next = null;
                head = tail = newNode;
                size++;
            } else {
                Node newNode = new Node();
                newNode.data = val;
                if (newNode.data == -1) {
                    return;
                }
                newNode.next = null;
                tail.next = newNode;
                tail = newNode;
                size++;
            }
        }

        public int size() {
            return size;
        }
        // printing
//        public void printing()
//        {
//            Node temp=head;
//            while(temp!=null&&temp.next!=null)
//            {
//                if(temp.data==temp.next.data)
//                {
//                    temp.next=temp.next.next;
//                }
//                else
//                {
//                    temp=temp.next;
//                }
//            }
//        }
void removeDuplicateElement() {
            Node temp = head;
            while (temp != null && temp.next != null) {
                Node temp1 = temp;
                while (temp1.next != null) {
                    if (temp.data == temp1.next.data) {
                        //prev=temp1.next;
                        temp1.next = temp1.next.next;
                        //System.gc();
                    } else {
                        //prev=temp;
                        temp1 = temp1.next;
                    }
                }
                temp = temp.next;
            }
        }
        public void display()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("Null");
        }
    }
}
class TestDemo
{
    public static void main(String[] args) {
        UniqueLinkedList obj=new UniqueLinkedList();
        UniqueLinkedList.Node node=obj.new Node();
        UniqueLinkedList.LinkedList ll=obj.new LinkedList();
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        for (int i = 0; i <n ; i++) {
            ll.input(readme.nextInt());
        }
        //ll.printing();
        ll.removeDuplicateElement();
        ll.display();



    }
}
