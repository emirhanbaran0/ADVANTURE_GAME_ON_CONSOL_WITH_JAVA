import java.util.Scanner;

public class Game {
   Player player;
   Location location;
   Scanner scan=new Scanner(System.in);
   
    
   
    
    public void Login()
    {   String plaName;
    	System.out.println("****Welcome to the AdVenture Game****");
    	System.out.println("Please Enter Your Name Before the Start Game!");
    	System.out.print("Player Name: ");
        plaName=scan.nextLine();
        player=new Player(plaName);
    	player.setCharacter();
    	locationInfos();
    }
	public void locationInfos()
	 {
	while(true)
	{
		
				int locationId;
				System.out.println("\n\n#################################################################################\n\n\t\t\t\tLOCATIONS");
				System.out.println("1-Safety House->There are no enemies for you and you can fill your health in here.");
				System.out.println("2-Forest->There are some vampire(s) for you and you can fight with vampire(s).");
				System.out.println("3-Cave->There are some zombie(s) for you and you can fight  with zombie(s).");
				System.out.println("4-River->There are some bear(s) for you and you can fight with bear(s).");
				System.out.println("5-Shop->You can buy armor and some kind of guns from this place.");
				System.out.println("Choose a place where do you want to go?");
				locationId=scan.nextInt();
				if(locationId>5 || locationId<1)
				{
					 System.out.println();
					 System.out.println("You chose an invalid selection, please choose a valid location from the Location menu again!");
					 locationInfos();
				}
				switch (locationId)
				{
				case 1: 
					location= new SafetyHouse(player,"Safety House");
					
					break;
				case 2: 
					location= new Forest(player);
					
					break;
				case 3: 
					location= new Cave(player);
					
					break;
				case 4: 
					location= new River(player);
					
					break;
				case 5: 
					location= new Shop(player,"Shop");
					
					break;
				}
				if(location.getLocationName().equals("Safety House"))
				{
					if(player.getInvFirewood()==true && player.getInvFood()==true && player.getInvWater()==true)
					{
						System.out.println("\n ***********************************");
						System.out.print("PERFECT JOB YOU FINISHED THE ADVENTURE GAME!!! CONGRATULATIONS!!");
					    break; 	
					}		
				}
				if(!location.getLocation())
				{
					break;
				}
			  }
	}
	
}
