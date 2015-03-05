import java.util.Scanner;

public class Tower 
{
	private Disc top;
	private Disc top1;
	private Disc top2;
	private Disc top3;
	
	public Tower()
	{
		top = null;
		top1 = null;
		top2 = null;
		top3 = null;
	}
	public int pop() throws Exception
	{
		if(this.top == null)
		{
			throw new Exception("Empty Tower");
		}
		else
		{
			int valToReturn = this.top.getSize();
			this.top = this.top.getNextDisc();
			return valToReturn;
		}
	}
	public void on() throws Exception
	{
		Scanner input = new Scanner(System.in);
		addDisc(new Disc(3));
		addDisc(new Disc(2));
		addDisc(new Disc(1));;
		
		while(true)
		{
			//asking us to type something
			System.out.print("=> ");
			
			//goes to next line, gets rid of any spaces
			String val = input.nextLine().trim();
			
			//TYPED IN QUIT 
			//how to stop
			if(val.equalsIgnoreCase("quit"))
			{
				break;
			}
			
			//TYPED IN SHOW
			//should show the current state of the towers, you could show these one on top of another for simplicity
			else if(val.equalsIgnoreCase("show"))
			{
				if(this.top == null)
				{
					System.out.println("Empty Tower");
				}
				else
				{
					Disc curr = this.top;
					do
					{
						System.out.println(curr.getSize());
						curr = curr.getNextDisc();
					}
					while(curr != null);
				}
			}
			//TYPED IN MOVE
			//should prompt the user for the source tower index and the destination tower index and ATTEMPT to make that move  
			//If the move was legal, output "SUCCESS", otherwise output "FAILURE" and place the disc back on the source tower
			else if(val.equalsIgnoreCase("move"))
			{
				System.out.println("Move from tower #?");
				//asking us to type something
				System.out.print("=> ");
				
				//goes to next line, gets rid of any spaces
				String fromIndex = input.nextLine().trim();
				
				
				System.out.println("Move to tower #?");
				//asking us to type something
				System.out.print("=> ");
				
				//goes to next line, gets rid of any spaces
				String toIndex = input.nextLine().trim();
				
				if(toIndex == "0")
				{
					 if(toIndex == null)
					 {
						 
					 }
				}
				if(toIndex == "1")
				{
					 if(toIndex == null)
					 {
						 
					 }
				}
				if(toIndex == "2")
				{
					 if(toIndex == null)
					 {
						 
					 }
				}
			}
		}
	}
	
	public Disc peek()
	{
		return top;
	}
	
	public Disc removeDisc()
	{
		Disc nodeToReturn = top;
		if(this.top != null)
		{
			top = top.getNextDisc();
		}
		return nodeToReturn;
	}
	
	public boolean addDisc(Disc d)
	{
		//If the stack is empty, then it is automatically a legal move
		if(this.top == null)
		{
			top = d;
			return true;
		}
		else if(d.getSize() < this.peek().getSize())
		{
			d.setNextDisc(top);
			top = d;
			return true;
		}
		else 
		{
			return false;
		}
	}
}
