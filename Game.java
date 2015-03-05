import java.util.Scanner;


public class Game 
{
	private Tower[] theTowers = {new Tower(), new Tower(), new Tower()};
	
	public Game()
	{
		theTowers[0].addDisc(new Disc(3));
		theTowers[0].addDisc(new Disc(2));
		theTowers[0].addDisc(new Disc(1));
	}
	
	public void play()
	{
		Scanner input = new Scanner(System.in);
		while(true)
		{
			this.show(theTowers);
			System.out.print("Enter Source Tower Index: ");
			int source = input.nextInt();
			System.out.print("Enter Destination Tower Index: ");
			int dest = input.nextInt();
			Disc d2Move = theTowers[source].removeDisc();
			if(!theTowers[dest].addDisc(d2Move))
			{
				theTowers[source].addDisc(d2Move);
				System.out.println("Illegal Move");
			}
			if(this.theTowers[this.theTowers.length-1].getNumDiscs() == 3)
			{
				break;
			}
		}
		this.show(theTowers);
		System.out.println("WINNER!!!");
	}
	
	private void show(Tower[] theTowers)
	{
		for(int i = 0; i < theTowers.length; i++)
		{
			System.out.println("Tower Index: " + i);
			theTowers[i].display();
			System.out.println("");
		}

	}

}
