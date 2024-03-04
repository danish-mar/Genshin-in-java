package com.genshinimpact.view;

import com.genshinimpact.character.playable.Character;
import com.genshinimpact.weapon.Weapon;

public class Stats {


    // Main Stat
    public int totalATK;
    public int totalDEF;
    public int totalHP;

    // sub stats
    public float totalHealingBonus;
    public int totalElementalMastery;
    public float totalEnergyRecharge;


    public float totalCritRate;
    public float totalCritDamage;


    // elemental Damages
    public float totalDendroDamageBonus;
    public float totalElectroDamageBonus;
    public float totalPyroDamageBonus;
    public float totalHydroDamageBonus;
    public float totalGeoDamageBonus;
    public float totalCryoDamageBonus;

    public float totalAnemoDamageBonus;


    // other stats
    public float totalPhysicalDamageBonus;



    public Stats(Character character){
        //gets character's stats and add it
        this.totalATK = this.totalATK + character.getAtk();
        this.totalHP = this.totalHP + character.getHp();
        this.totalDEF = this.totalDEF + character.getDef();
        this.totalHealingBonus = this.totalHealingBonus + character.getHealingBonus();
        this.totalElementalMastery = this.totalElementalMastery + character.getElementalMastery();
        this.totalEnergyRecharge = this.totalEnergyRecharge + character.getEnergyRecharge();

        //elemental damages
        this.totalGeoDamageBonus = this.totalGeoDamageBonus + character.getGeoDamageBonus();
        this.totalCryoDamageBonus = this.totalCryoDamageBonus + character.getGeoDamageBonus();
        this.totalElectroDamageBonus = this.totalElectroDamageBonus + character.getGeoDamageBonus();
        this.totalHydroDamageBonus = this.totalHydroDamageBonus + character.getHydroDamageBonus();
        this.totalPyroDamageBonus = this.totalPyroDamageBonus + character.getPyroDamageBonus();
        this.totalAnemoDamageBonus = this.totalAnemoDamageBonus + character.getAnemoDamageBonus();
        this.totalDendroDamageBonus = this.totalDendroDamageBonus + character.getDendroDamageBonus();


        //other Bonuses
        this.totalPhysicalDamageBonus = this.totalPhysicalDamageBonus + character.getPhysicalDamageBonus();


        //now if weapon is there...
        try {
            Weapon weapon = character.getWeapon();

            //adds weapon stats :
            this.totalATK = this.totalATK + weapon.getAtk();
            this.totalHP = this.totalHP + weapon.getHp();
            this.totalDEF = this.totalDEF + weapon.getDef();

            //em/er
            this.totalElementalMastery = this.totalElementalMastery + weapon.getElementalMastery();
            this.totalEnergyRecharge = this.totalEnergyRecharge + weapon.getEnergyRecharge();

            //crit rate/crit dmg;

            this.totalCritDamage = this.totalCritDamage + weapon.getCritDamage();
            this.totalCritRate = this.totalCritRate + weapon.getCritRate();


            // other
            this.totalPhysicalDamageBonus = this.totalPhysicalDamageBonus + weapon.getPhysicalDamageBonus();


        }catch (NullPointerException nullPtrException){
            System.out.println("Weapon Does't available");
        }


    }

    public void printStats() {
        System.out.println("Character Stats:");
        System.out.println("================");
        System.out.println("Total ATK: " + totalATK);
        System.out.println("Total HP: " + totalHP);
        System.out.println("Total DEF: " + totalDEF);
        System.out.println("Total Healing Bonus: " + totalHealingBonus);
        System.out.println("Total Elemental Mastery: " + totalElementalMastery);
        System.out.println("Total Energy Recharge: " + totalEnergyRecharge);
        System.out.println("Total Crit Rate: " + totalCritRate + "%");
        System.out.println("Total Crit Damage: " + totalCritDamage + "%");
        System.out.println("Total Physical Damage Bonus: " + totalPhysicalDamageBonus + "%");
        System.out.println("Total Dendro Damage Bonus: " + totalDendroDamageBonus + "%");
        System.out.println("Total Electro Damage Bonus: " + totalElectroDamageBonus + "%");
        System.out.println("Total Pyro Damage Bonus: " + totalPyroDamageBonus + "%");
        System.out.println("Total Hydro Damage Bonus: " + totalHydroDamageBonus + "%");
        System.out.println("Total Geo Damage Bonus: " + totalGeoDamageBonus + "%");
        System.out.println("Total Cryo Damage Bonus: " + totalCryoDamageBonus + "%");
        System.out.println("Total Anemo Damage Bonus: " + totalAnemoDamageBonus + "%");
        System.out.println("================");
    }
}
