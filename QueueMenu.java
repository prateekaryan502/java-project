import java.util.Scanner;

 class Queue
{
	Scanner ob=new Scanner(System.in);
	final int size=10;
	int front=0;
	int rear=0;
	int q[]=new int[size];
	void enqueue()
	{
	int e;
	System.out.print("Enter the element you want to enqueu : ");
	e=ob.nextInt();
	if(rear>=size-1)
		{
			System.out.println("Overflow");
		}
	else
		{
			q[rear]=e;
			rear++;
		}
	}
	void dequeue()
	{
	if(rear==0)
	{
		System.out.println("No elements in the queue");
	
	}
	else
	{
		System.out.println("Removed"+q[front]+"from the queue");
		front++;
	}
	}
	void display()
	{
	System.out.println("Displaying Queue Elements");
	for(int i=front;i<rear;i++)
		System.out.println(q[i]);
	
		
	}

}

public class QueueMenu
{
public static void main(String args[])
{
	Scanner ob=new Scanner(System.in);
	int op;
	
	
	Queue p=new Queue();
	do
	{
	System.out.println("Enter any one of the following options : ");
	System.out.println("1.Enqueue");
	System.out.println("2.Dequeue");
	System.out.println("3.Display");
	System.out.println("4.Exit");
	op=ob.nextInt();
	switch(op)
	{
	case 1 : p.enqueue(); break;
	case 2 : p.dequeue(); break;
	case 3 : p.display(); break;
	case 4 : return;
	}
	}while(true);

}
}