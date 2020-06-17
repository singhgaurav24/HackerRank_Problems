/*
       You’re given the pointer to the head node
       of a linked list and a specific position.
       Counting backwards from the tail node of the linked list, 
       get the value of the node at the given position.
       A position of 0 corresponds to the tail,
       1 corresponds to the node before the tail and so on.
 */
public class Get_Node_Value {
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			this.data = d;
		}
	}
	
	static class LL
	{
		
		Node head;
		void insert(int x)
		{
			Node temp = new Node(x);
			temp.next = head;
			head = temp;
		}
		
		void print()
		{
			Node n = head;
			System.out.print("  Elements of Linked List is:  ");
			while(n!=null)
			{
				
				System.out.print(n.data+ " ");
				n = n.next;
			}
			    System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL l1 = new LL();
		l1.insert(15);
		l1.insert(25);
		l1.insert(35);
		l1.insert(45);
		l1.insert(55);
	    	
		getNode(l1.head , 2);
		//l1.print();
		
		
	}
	public static void getNode(Node head , int positionFromTail) {
		Node p1 = head;
        Node p2 = head;

        for (int i = 0; i < positionFromTail; i++) {
            p1 = p1.next;
        }

        while (p1.next != null) {
            p2 = p2.next;
            p1 = p1.next;
        }
        
        
        System.out.println(p2.data);
    }
	
	

}
