
import java.util.Scanner;
import java.util.concurrent.Callable;
public class ChangeStringCharacterIntoLinkedList {
    //node
    class Node
    {
        char data;
        Node next;
    }
    // LinkedListClass
    class linkedList
    {
        Node head;
        Node tail;
        int size;
        void add(char ch)
        {
            Node newNode=new Node();
            newNode.data=ch;
            newNode.next=null;
            if(size==0)
            {

                head=tail=newNode;
                size++;
            }
            else
            {
                tail.next=newNode;
                tail=newNode;
                size++;
            }
        }
        void display()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("NULL");
        }
    }

}
class TestString
{
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        ChangeStringCharacterIntoLinkedList obj=new ChangeStringCharacterIntoLinkedList();
        ChangeStringCharacterIntoLinkedList.Node node=obj.new Node();
        ChangeStringCharacterIntoLinkedList.linkedList ll=obj.new linkedList();
        String str=readme.nextLine();
        for (int i = 0; i < str.length(); i++) {
            ll.add(str.charAt(i));
        }
        ll.display();
    }
}
