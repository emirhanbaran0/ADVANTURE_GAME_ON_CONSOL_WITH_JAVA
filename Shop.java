
public class Shop extends NormalLoc{
	 Inventory inventory=new Inventory();
	protected Shop(Player player, String locationName) {
		super(player, "Shop");
	 
		
	}
	
	public boolean getLocation()
	{   int mselection;
		System.out.println("\t\t\t\tAmount of Remain Money: "+player.getMoney());
		System.out.println("1-Guns");
		System.out.println("2-Armors");
		System.out.println("3-Exit from the Shop\n");
		System.out.println("Choose what you want to buy from the shop or exit from the shop. :D");
		System.out.print("Selection: ");
		mselection=scan.nextInt();
		if(mselection>3 || mselection<1)
		{
			System.out.println();
			System.out.println("You chose an invalid selection, please choose a valid location from the Shop menu again!\n");
			 getLocation();
		}
		System.out.print("\n");
		int sellItemId;
		switch (mselection)
		{
		case 1: 
			sellItemId=gunsMenu();  
			 buyGun(sellItemId);
			break;
		case 2: 
			sellItemId=armorMenu();  
			 buyArmor(sellItemId);
			break;
		default:
			System.out.println("...exit completed");
			break;
		    
		}
		
	  return true;
	}
	
	
	 public int armorMenu()
	    {   int selection;
	    	System.out.println("1-Bronze Armor         Money: 15   -     Obstructiveness: 1>");
	    	System.out.println("2-Silver Armor         Money: 25   -     Obstructiveness: 3>");
	    	System.out.println("3-Gold Armor           Money: 40   -     Obstructiveness: 5>");
	    	System.out.println("4-Exit\n");
	    	System.out.println("Choose what you want to buy from the GunShop?\n");
	    	System.out.print("Selection: ");
			selection=scan.nextInt();
			if(selection>4 || selection<1)
			{
				System.out.println("You chose an invalid selection, please choose a valid location from the ArmorShop menu again!\n");
				System.out.print("Selection: ");
				selection=scan.nextInt();
			}
			return selection;
	    	
	    }
	
	
	 public void buyArmor(int selId)
     {  
    	 switch (selId)
    	 {
    	 case 1:
    		  if(player.getMoney()>=15)
    		  {
    			  inventory.setaHealth(1);
    			  inventory.setArmorName("Bronze Armor");
    			  player.setMoney(player.getMoney()-15);
    			  System.out.print(inventory.getArmorName()+" purchasing was successful.\n Your New Health Power: ");
    			  System.out.println(player.getHealthy()+(int)1);
    			  System.out.println("Amount of Remain Money: "+player.getMoney());
    		  }
    		  else 
    			  System.out.println("You don't have enough money to buy a Bronze Armor.You Should make more money!\n");
    		  break;
    	 case 2:
    		  if(player.getMoney()>=25)
    		  {
    			  inventory.setaHealth(3);
    			  inventory.setArmorName("Silver Armor");
    			  player.setMoney(player.getMoney()-25);
    			  System.out.print(inventory.getArmorName()+" purchasing was successful.\n Your New Health Power: ");
    			  System.out.println(player.getHealthy()+(int)3);
    			  System.out.println("Amount of Remain Money: "+player.getMoney());
    		  }
    		  else 
    			  System.out.println("You don't have enough money to buy a Silver Armor.You Should make more money!\n");
    		  break;
    	 case 3: 
    		  if(player.getMoney()>=40)
    		  {
    			  inventory.setaHealth(5);
    			  inventory.setArmorName("Gold Armor");
    			  player.setMoney(player.getMoney()-40);
    			  System.out.print(inventory.getArmorName()+" purchasing was successful.\n Your New Health Power: ");
    			  System.out.println(player.getHealthy()+(int)5);
    			  System.out.println("Amount of Remain Money: "+player.getMoney());
    		  }
    		  else 
    			  System.out.println("You don't have enough money to buy a Gold Armor.You Should make more money!\n");
    		   break;
    	 default:   
    		 break;
    	 }
    	  
    		  
     }
	 
	 
    public int gunsMenu()
    {   int selection;
    	System.out.println("1-Sword        Money: 25   -     Damage: 2>");
    	System.out.println("2-Pistol       Money: 35   -     Damage: 3>");
    	System.out.println("3-Rifle        Money: 45   -     Damage: 7>");
    	System.out.println("4-Exit\n");
    	System.out.println("Choose what you want to buy from the GunShop?\n");
    	System.out.print("Selection: ");
		selection=scan.nextInt();
		if(selection>4 || selection<1)
		{
			System.out.println("You chose an invalid selection, please choose a valid location from the GunShop menu again!\n");
			System.out.print("Selection: ");
			selection=scan.nextInt();
		}
		return selection;
    	
    }
    
     public void buyGun(int selId)
     {  
    	 switch (selId)
    	 {
    	 case 1:
    		  if(player.getMoney()>=25)
    		  {
    			  inventory.setwDamage(2);
    			  inventory.setWeaponName("Sword");
    			  player.setMoney(player.getMoney()-25);
    			  System.out.print(inventory.getWeaponName()+" purchasing was successful.\n Your New Damage Power: ");
    			  System.out.println(player.getDamage()+(int)2);
    			  System.out.println("Amount of Remain Money: "+player.getMoney());
    		  }
    		  else 
    			  System.out.println("You don't have enough money to buy a Sword.You Should make more money!\n");
    		  break;
    	 case 2:
    		  if(player.getMoney()>=35)
    		  {
    			  inventory.setwDamage(3);
    			  inventory.setWeaponName("Pistol");
    			  player.setMoney(player.getMoney()-35);
    			  System.out.print(inventory.getWeaponName()+" purchasing was successful.\n Your New Damage Power: ");
    			  System.out.println(player.getDamage()+(int)3);
    			  System.out.println("Amount of Remain Money: "+player.getMoney());
    		  }
    		  else 
    			  System.out.println("You don't have enough money to buy a Pistol.You Should make more money!\n");
    		  break;
    	 case 3: 
    		  if(player.getMoney()>=45)
    		  {
    			  inventory.setwDamage(7);
    			  inventory.setWeaponName("Rifle");
    			  player.setMoney(player.getMoney()-45);
    			  System.out.print(inventory.getWeaponName()+" purchasing was successful.\n Your New Damage Power: ");
    			  System.out.println(player.getDamage()+(int)7);
    			  System.out.println("Amount of Remain Money: "+player.getMoney());
    		  }
    		  else 
    			  System.out.println("You don't have enough money to buy a Rifle.You Should make more money!\n");
    		   break;
    	 default:   
    		 break;
    	 }   		  
     }	
}
