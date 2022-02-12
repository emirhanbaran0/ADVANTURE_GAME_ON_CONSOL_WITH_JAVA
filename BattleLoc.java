
public abstract class BattleLoc extends Location {
    protected Obstacle obstacle;
    protected String awardItem;
	protected BattleLoc(Player player,String locationName,Obstacle obstacle, String awardItem) {
		super(player);
	    this.locationName=locationName;
	    this.obstacle=obstacle;
	    this.awardItem=awardItem;
	}
	public boolean getLocation()
	{   int obsCount;
	     obsCount=obstacle.obstacleCount();
	     System.out.println("You arrived to the "+this.locationName);
	     System.out.println("Watch out there are "+obsCount+" "+obstacle.getName()+ " are living in the "+this.locationName+"!");
	     System.out.println("Will You Fight or Run away?  <F,f> or <R,r>");
	     String selection;
	     
	     selection=scan.next();
	    	 if(selection.equals("F") || selection.equals("f") )
		     {
		    	 if(combat(obsCount))
		    	 {
		    		 System.out.println("************************************");
		    		 System.out.println();
		    		 System.out.println("Congratulations! You won the quareel :-)");
		    		 
		    		 if(this.awardItem.equals("Food") && player.getInvFood()==false)
		    		 {
		    			 System.out.print("You won the Food from Zombies");
		    			 player.setInvFood(true);
		    		 }
		    		 if(this.awardItem.equals("Firewood") && player.getInvFirewood()==false)
		    		 {
		    			 System.out.print("You won the Firewood from Vampires");
		    			 player.setInvFirewood(true);
		    		 }
		    		 if (this.awardItem.equals("Water") && player.getInvWater()==false)
		    		 {
		    			 System.out.print("You won the Water from Bears");
		    			 player.setInvWater(true);
		    		 }
		    		 
		    		 return true;
		    	 }
		    	 if(!combat(obsCount))
		    	 {
		    		 if(player.getHealthy()<=0)
		    		 {
		    			 System.out.print("You Dead! Game Over :-( Try Again");
			    		 return false;
		    		 }
		    		 else 
		    		 {
		    			 System.out.println("...Going to the Menu");
		    			 return true;
		    		 }
		    		 
		    	 }
		    		 
		     }
		     else if(selection.equals("R") || selection.equals("r")  )
		     {
		    	 System.out.println("...Going to the Menu");
	    		 return true;
		     }
		     else 
		     {
		    	 System.out.print("You chose an invalid selection, please choose a valid selection <F,f> or <R,r>!\n");
		    	 getLocation();
		     }
	     
	    
		return true;
	}
	
	public boolean combat(int obsCount)
	{
		for(int i=0;i<obsCount;i++)
		{
			int defaultHealth=obstacle.getHealth();
			playerStatus();
			enemyStatus();
			while(player.totalHealth()>0 && obstacle.getHealth()>0 )
			{  String selection;
				System.out.println("Hit or Run Away? <H,h> <R,r>");
				selection=scan.next();
				selection=selection.toUpperCase();
				if(selection.equals("H"))
				{
					System.out.println("You Hit the "+obstacle.getName());
					obstacle.setHealth(obstacle.getHealth()-player.totalDamage());
					System.out.println(obstacle.getName()+ " healthy: "+obstacle.getHealth());
					if(obstacle.getHealth()<=0)
					{
						System.out.println(obstacle.getName()+ " is dead. Good Job!");
						System.out.println("You won the "+obstacle.getAward()+" from "+obstacle.getName());
						player.setMoney(player.getMoney()+obstacle.getAward());
						System.out.println("Your Current Money: " + player.getMoney()+"\n");
						obstacle.setHealth(defaultHealth);
						break;
					}
					System.out.println(obstacle.getName()+" hit you.");
					player.setHealthy(player.totalHealth()-obstacle.getDamage());		
					System.out.println("Player healthy: "+player.totalHealth());
					if(player.getHealthy()<=0)
					{
						System.out.println("\nYou are dead!");
						break;
					}
				}
				else 
				{				
					return false;
				}
			}
		}
		if(player.getHealthy()<=0)
		{
			return false;
		}
		return true;
	}
	
	
	public void playerStatus()
	{
		System.out.println("-----------PLAYER STATUS----------");
		System.out.print("Healthy: ");
		System.out.println(player.getHealthy()+player.getInvHealth());
		System.out.print("Damage: ");
		System.out.println(player.getDamage()+player.getInvDamage());
		if(player.getInvDamage()>0)
		{
			System.out.print("Gun: ");
			player.getwName();
		}
		if(player.getInvHealth()>0)
		{
			System.out.print("Armor: ");
			player.getaName();
		}
			
	}
	
	public void enemyStatus()
	{
		System.out.println("-----------ENEMY STATUS----------");
		System.out.print("Healthy: ");
		System.out.println(obstacle.getHealth());
		System.out.print("Damage: ");
		System.out.println(obstacle.getDamage());
		System.out.print("Award: ");
		System.out.println(obstacle.getAward());
			
	}
	
}
