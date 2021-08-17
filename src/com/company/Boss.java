package com.company;

public class Boss extends GameEntity{
    private Weapon weapon;

    public Boss(int health, int damage, Weapon weapon){
        super(health,damage);
        this.weapon=weapon;

    }
    public String info(){
        return "Health: " + getHealth() + " Damage: " + getDamage() +
                " Weapon: " + getWeapon().getTypeWeapon() + " " + getWeapon().getNameWeapon();
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}



