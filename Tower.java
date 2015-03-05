public class Tower 
{
	private Disc top;
	private int numDiscs;
	public Tower()
	{
		top = null;
		this.numDiscs = 0;
	}
	
	public int getNumDiscs() {
		return numDiscs;
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
			nodeToReturn.setNextDisc(null);
			this.numDiscs--;
			return nodeToReturn;
		}
		else //error catching
		{
			return null;
		}	
	}
	
	public boolean addDisc(Disc d)
	{
		if(this.top == null)
		{
			top = d;
			this.numDiscs++;
			return true;
		}
		else if(d.getSize() < this.peek().getSize())
		{
			d.setNextDisc(top);
			top = d;
			this.numDiscs++;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void display()
	{
		System.out.println("*******************");
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
		System.out.println("*******************");
	}
}