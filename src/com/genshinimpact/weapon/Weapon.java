package com.genshinimpact.weapon;
import com.genshinimpact.Rarity;

public class Weapon {

    // Members
    public String name;
    public Rarity rarity;
    int atk;
    int level;
    Type weaponType;
    int refinementLevel;

    float critRate;
    float critDamage;
    int energyRecharge;
    int elementalMastery;

    int physicalDamageBonus;




    // consts
    public final int MAX_LEVEL = 90;
    public final int MAX_REFINEMENT = 5;

    public final int ASCENSION_INCREMENT = 10;

    //getters


    public int getAtk() {
        return atk;
    }

    public float getCritDamage() {
        return critDamage;
    }

    public float getCritRate() {
        return critRate;
    }

    public int getElementalMastery() {
        return elementalMastery;
    }

    public int getLevel() {
        return level;
    }

    public int getRefinementLevel() {
        return refinementLevel;
    }

    public String getName() {
        return name;
    }

    public Type getWeaponType() {
        return weaponType;
    }

    public int getEnergyRecharge() {
        return energyRecharge;
    }


    public int getPhysicalDamageBonus() {
        return physicalDamageBonus;
    }

    public Rarity getRarity() {
        return rarity;
    }


    //setters


    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setCritDamage(float critDamage) {
        this.critDamage = critDamage;
    }

    public void setCritRate(int critRate) {
        this.critRate = critRate;
    }

    public void setElementalMastery(int elementalMastery) {
        this.elementalMastery = elementalMastery;
    }

    public void setEnergyRecharge(int energyRecharge) {
        this.energyRecharge = energyRecharge;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhysicalDamageBonus(int physicalDamageBonus) {
        this.physicalDamageBonus = physicalDamageBonus;
    }


    public void setRefinementLevel(int refinementLevel) {
        this.refinementLevel = refinementLevel;
    }

    void setWeaponType(Type type){
        this.weaponType = type;
    }

    void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }


    public void ascend(){
    //implement ascend method in the extended class
    }

    public void refine(){

    }

    public int getAssensionMilestone(){
        if(level <= 20){
            return 1; // Ascension milestone reached at level 20
        } else if (level <= 40) {
            return 2; // Ascension milestone reached at level 40
        } else if (level <= 50) {
            return 3; // Ascension milestone reached at level 50
        } else if (level <= 60) {
            return 4; // Ascension milestone reached at level 60
        } else if (level <= 70) {
            return 5;
        } else if (level <= 80) {
            return 6;
        } else if (level <= 90) {
            return 7;
        } else if(level == 90){
            return 8;
        } else {
            return 0; // Character hasn't reached any ascension milestone yet
        }
    }

}