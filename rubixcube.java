
import java.util.*;
class rubixcube
{
private class Node
{
int data;
Node next;
Node(int d)
{
data = d;
next=null;
}
}
private Node head1=null;
//function to insert a node at the tail of the list
public void Append(Node head,int new_data)
{
Node new_node = new Node(new_data);
if (head == null)
{
head = new Node(new_data);
return;
}
new_node.next = null;
Node last = head;
while (last.next != null)
last = last.next;
last.next = new_node;
return;
}
//function to find the length of the list
private static int Length(Node head)
{
    int c=0;
    for(Node i=head;i!=null;i=i.next)
    c++;
    return c;
}
//function to print the list
public void Print(Node head)
{
    if(head!=null)
    {
        System.out.print(head.data+"->");
        Print(head.next);
    }
}
}
