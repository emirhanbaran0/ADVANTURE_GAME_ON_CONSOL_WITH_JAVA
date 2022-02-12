import java.util.Random;

public class Obstacle {
      private String name;
      private int damage,health,award,maxNumber;
      
      
	public Obstacle(String name, int damage, int health, int award, int maxNumber) {
		this.setName(name);
		this.setDamage(damage);
		this.setHealth(health);
		this.setAward(award);
		this.setMaxNumber(maxNumber);
	}

	
	public int obstacleCount()
	{
		Random rand= new Random();
		return rand.nextInt(this.maxNumber)+1;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMaxNumber() {
		return maxNumber;
	}


	public void setMaxNumber(int maxNumber) {
		this.maxNumber = maxNumber;
	}


	public int getAward() {
		return award;
	}


	public void setAward(int award) {
		this.award = award;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public int getDamage() {
		return damage;
	}


	public void setDamage(int damage) {
		this.damage = damage;
	}
      
}
