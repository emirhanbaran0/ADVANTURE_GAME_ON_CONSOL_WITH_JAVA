
public class Inventory {
   private boolean water,food,firewood;
   private String weaponName,armorName;
   private int wDamage,aHealth;
   
   Inventory()
   {
	   this.water=false;
	   this.food=false;
	   this.firewood=false;
	   this.wDamage=0;
	   this.aHealth=0;
	   this.weaponName=null;
	   this.armorName=null;
   }
   
   
   
   public boolean isWater() {
	return water;
}
   
public void setWater(boolean water) {
	this.water = water;
}

public boolean isFood() {
	return food;
}

public void setFood(boolean food) {
	this.food = food;
}

public boolean isFirewood() {
	return firewood;
}

public void setFirewood(boolean firewood) {
	this.firewood = firewood;
}

public String getWeaponName() {
	return weaponName;
}

public void setWeaponName(String weaponName) {
	this.weaponName = weaponName;
}

public String getArmorName() {
	return armorName;
}

public void setArmorName(String armorName) {
	this.armorName = armorName;
}

public int getwDamage() {
	return wDamage;
}

public void setwDamage(int wDamage) {
	this.wDamage = wDamage;
}

public int getaHealth() {
	return aHealth;
}

public void setaHealth(int aHealth) {
	this.aHealth = aHealth;
}


}
