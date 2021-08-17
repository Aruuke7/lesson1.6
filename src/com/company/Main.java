package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boss boss1 = new Boss(800,50,new Weapon("Firearms","Pistol"));

        System.out.println("Boss1 health: "+boss1.getHealth()+
                ", Boss1 damage: "+boss1.getDamage()+", Boss1 weapon: "
                + boss1.getWeapon().getTypeWeapon() + " " + boss1.getWeapon().getNameWeapon());

        System.out.println(boss1.info());

        Skeleton skeleton1 = new Skeleton(900,40,new Weapon
                ("Projectile", "Crossbow"),500);
        System.out.println("Skeleton Boss2: health:" + skeleton1.getHealth()
                + ", damage: " + skeleton1.getDamage() + ", weapon: " + skeleton1.getWeapon().getTypeWeapon() + " "
                + skeleton1.getWeapon().getNameWeapon() + ", number of arrows: " + skeleton1.getNumberOfArrows());


        Skeleton skeleton2 = new Skeleton(700,30,new Weapon
                ("Stabbing", "Spear"),300);
        System.out.println("Skeleton Boss3: health:" + skeleton2.getHealth()
                + ", damage: " + skeleton2.getDamage() + ", weapon: " + skeleton2.getWeapon().getTypeWeapon() + " "
                + skeleton2.getWeapon().getNameWeapon() + ", number of arrows: " + skeleton2.getNumberOfArrows());


    }
}
