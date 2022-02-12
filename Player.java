import java.util.Scanner;

public class Player {
    private String plaName,chaName;
    private int damage,healthy,money,rHealthy;
    private Inventory  inventory= new Inventory(); 
    public Scanner input=new Scanner(System.in);
    
    public Player(String plaName) {
		this.plaName = plaName;
		
	}
    
    public boolean getInvFirewood()
    {
    	return inventory.isFirewood();
    	
    }
    
    public void setInvFirewood(boolean s)
    {
    	inventory.setFirewood(s);
    	
    }
    
    public boolean getInvWater()
    {
    	return inventory.isWater();
    	
    }
    
    public void setInvWater(boolean s)
    {
    	inventory.setWater(s);
    	
    }
    
    
    public boolean getInvFood()
    {
    	return inventory.isFood();
    	
    }
    
    public void setInvFood(boolean s)
    {
    	inventory.setFood(s);
    	
    }
    
	
     public int getInvHealth()
     {
    	return inventory.getaHealth();
     }
     
     public void getwName()
     {
    	 inventory.getWeaponName();
     }
     
     public void getaName()
     {
    	 inventory.getArmorName();
     }
     
     public int getInvDamage()
     {
    	 return inventory.getwDamage();
     }
    public int totalDamage()
    {    setDamage((int)getDamage()+(int)this.inventory.getwDamage());
    	return getDamage();
    }
    
    public int totalHealth()
    {     setHealthy(getHealthy()+this.inventory.getaHealth());
    	return getHealthy();
    }
    
    
	public void setCharacter()
	{
		int selection=characterMenu();
		switch (selection)
		{
		case 1: 
			    initializeCha("Samurai",21,5,15);
		        break;
		case 2: 
			     initializeCha("Archer",18,7,50);
		         break;
		case 3: 
			    initializeCha("Knight",24,8,5);
			    
         		break;
         default: 
        	    initializeCha("Samurai",21,5,15);
		        break;
		}
		System.out.print("Your Choose-> "+getChaName()+"\tHealth: "+getHealthy()+"\tDamage: "+getDamage()+"\tMoney: "+getMoney());
	}
	
	public void initializeCha(String name,int healthy,int damage,int money)
	{
		setChaName(name);
        setHealthy(healthy);
        setDamage(damage);
        setMoney(money);
        setrHealthy(healthy);
	}
	public int characterMenu()
	{  
		System.out.println("Please Choose a Character Shown in the Character Menu");
		System.out.println("1-Samuray \t Damage:5 \t Health:21 \t Money:15 ");
		System.out.println("2-Archer \t Damage:7 \t Health:18 \t Money:20 ");
		System.out.println("3-Knight \t Damage:8 \t Health:24 \t Money:5 ");
		System.out.print("Please Choose a Character: ");
		 int selection=input.nextInt();
		 if(selection!=1 && selection!=2 && selection!=3)
		 {
		   System.out.println();
		   System.out.println("You chose an invalid selection, please choose a valid character from the Character menu again!\n"); 
		   characterMenu();
		 }
		 
		 return selection;
		
	}
	public String getPlaName() {
		return plaName;
	}
	public void setPlaName(String plaName) {
		this.plaName = plaName;
	}
	public String getChaName() {
		return chaName;
	}
	public void setChaName(String chaName) {
		this.chaName = chaName;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getHealthy() {
		return healthy;
	}
	public void setHealthy(int healthy) {
		this.healthy = healthy;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}

	public int getrHealthy() {
		return rHealthy;
	}

	public void setrHealthy(int rHealthy) {
		this.rHealthy = rHealthy;
	}
    
    
}
