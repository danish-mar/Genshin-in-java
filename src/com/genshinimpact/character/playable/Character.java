package com.genshinimpact.character.playable;

import com.genshinimpact.Rarity;
import com.genshinimpact.Element;
import com.genshinimpact.artifact.Artifact;
import com.genshinimpact.artifact.ArtifactType;
import com.genshinimpact.exceptions.artifact.InvalidArtifactTypeException;
import com.genshinimpact.weapon.Type;
import com.genshinimpact.weapon.Weapon;
import org.jetbrains.annotations.NotNull;

class Talent {
    private String name;
    private String description;

    private int level;


    // Constructor, getters, and setters
    public Talent(String name, String description) {
        this.name = name;
        this.description = description;
    }



    // Getter and setter methods
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getLevel(){
        return this.level;
    }

    public void increment(int constell){
        if(constell >= 6){
            if(level < 15){
                level++;
            }else{
                System.err.println("Max Level reached C" + constell);
                return;
            }
        }else{
            if(level < 10){
                level++;
            }else{
                System.err.println("Max Level reached for more please increase the contellation");
            }
        }
    }
}

public class Character {
    // Character metadata
    Talent[] talents = new Talent[6]; // Initialize the talent array



    protected String name;
    protected Element element;

    protected Weapon weapon;

    protected Type weaponType;

    protected int constellation;
    protected Rarity rarity;
    protected int level;
    protected int hp;
    protected int atk;
    protected int def;

    protected float healingBonus;

    protected int elementalMastery;
    float energyRecharge;
    protected float critRate;
    protected int critDamage;

    // Different damage bonuses
    protected float electroDamageBonus;
    protected float dendroDamageBonus;
    protected float hydroDamageBonus;
    protected float pyroDamageBonus;
    protected float geoDamageBonus;
    protected float anemoDamageBonus;
    protected float cryoDamageBonus;
    protected float physicalDamageBonus;



    Artifact flowerOfLife;
    Artifact plumeOfDeath;
    Artifact sandsOfEon;
    Artifact gobletOfEnothem;

    Artifact circletOfLogos;

    // Constants
    protected static final int MAX_LEVEL = 90;
    protected static final int ASCENSION_INCREMENT = 20;
    protected static final int MAX_CONSTELLATION_LEVEL = 6;

//    protected Character(String name, Rarity rarity, Element element, int baseATK, int baseDEF, int baseHP) {
//        this.name = name;
//        this.rarity = rarity;
//        this.element = element;
//        this.level = 1;
//        this.hp = baseHP;
//        this.def = baseDEF;
//        this.atk = baseATK;
//        this.constellation = 0;
//        // Initialize other attributes with default values
//    }

    public void ascension() {
        if (this.level < MAX_LEVEL) {
            this.level += ASCENSION_INCREMENT;
            incrementStatByPercentage(20.0f,"atk");
            incrementStatByPercentage(20.0f,"def");
            incrementStatByPercentage(20.0f,"hp");
            incrementStatByPercentage(20.0f,"em");
            incrementStatByPercentage(20.0f,"er");

            System.out.println("Character '" + this.name + "' has reached Level " + this.level);
        } else {
            System.out.println("Cannot ascend: MAX_LEVEL reached");
        }
    }

    public int getAssensionMilestone(){
        if(level <= 20){
            return 1; // Ascension milestone reached at level 20
        } else if (level <= 40) {
            return 2; // Ascension milestone reached at level 50
        } else if (level <= 60) {
            return 3; // Ascension milestone reached at level 60
        } else if (level <= 80) {
            return 4; // Ascension milestone reached at level 70
        } else if (level <= 90) {
            return 5; // Ascension milestone reached at level 80
        } else {
            return 0; // Character hasn't reached any ascension milestone yet
        }
    }

    public int ascendConstellation(){
        if(this.constellation >= MAX_CONSTELLATION_LEVEL){
            System.out.println("Character is at C6");
            return 9;
        }else{
            System.out.println("Character is now C" + this.constellation);
            this.constellation+=1;
            return this.constellation;
        }
    }

    // Method to increment a character's stat by a percentage
    protected void incrementStatByPercentage(float percentage, String statName) {
        switch (statName) {
            case "hp":
                this.hp += this.hp * (percentage / 100.0f); // Increment HP by the given percentage
                break;
            case "atk":
                this.atk += this.atk * (percentage / 100.0f); // Increment ATK by the given percentage
                break;
            case "def":
                this.def += this.def * (percentage / 100.0f); // Increment DEF by the given percentage
                break;
            case "em":
                this.elementalMastery += this.elementalMastery * (percentage / 100.0f);
                break;
            case "er":
                this.energyRecharge += this.energyRecharge * (percentage / 100.0f);
                break;
            case "critd":
                this.critDamage += this.critDamage * (percentage / 100.0f);
                break;
            case "critr":
                this.critRate += this.critRate * (percentage / 100.0f);
                break;

            // Add cases for other stats as needed
            default:
                System.out.println("Invalid stat name: " + statName);
        }
    }

    protected void setAscensionStats(int hp, int atk, int def){
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }

    protected void setAscensionStats(int hp, int atk, int def,float critRate, int critDamage){
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.critRate = critRate;
        this.critDamage = critDamage;
    }




    // Add getter and setter methods for protected fields

        // Getter and setter methods for the protected fields
        public int getHp() {
            return hp;
        }

        public void setHp(int hp) {
            this.hp = hp;
        }

        public int getAtk() {
            return atk;
        }

        public void setAtk(int atk) {
            this.atk = atk;
        }

        public int getDef() {
            return def;
        }

        public void setDef(int def) {
            this.def = def;
        }

        public int getElementalMastery() {
            return elementalMastery;
        }

        public void setElementalMastery(int elementalMastery) {
            this.elementalMastery = elementalMastery;
        }

        public float getEnergyRecharge() {
            return energyRecharge;
        }

        public void setEnergyRecharge(float energyRecharge) {
            this.energyRecharge = energyRecharge;
        }

    public void setHealingBonus(float healingBonus) {
        this.healingBonus = healingBonus;
    }

    public float getHealingBonus() {
        return healingBonus;
    }


    public float getCritRate() {
            return critRate;
        }

        public void setCritRate(float critRate) {
            this.critRate = critRate;
        }

        public int getCritDamage() {
            return critDamage;
        }

        public void setCritDamage(int critDamage) {
            this.critDamage = critDamage;
        }

        public float getElectroDamageBonus() {
            return electroDamageBonus;
        }

        public void setElectroDamageBonus(float electroDamageBonus) {
            this.electroDamageBonus = electroDamageBonus;
        }

        public float getDendroDamageBonus() {
            return dendroDamageBonus;
        }

        public void setDendroDamageBonus(float dendroDamageBonus) {
            this.dendroDamageBonus = dendroDamageBonus;
        }

        public float getHydroDamageBonus() {
            return hydroDamageBonus;
        }

        public void setHydroDamageBonus(float hydroDamageBonus) {
            this.hydroDamageBonus = hydroDamageBonus;
        }

        public float getPyroDamageBonus() {
            return pyroDamageBonus;
        }

        public void setPyroDamageBonus(float pyroDamageBonus) {
            this.pyroDamageBonus = pyroDamageBonus;
        }

        public float getGeoDamageBonus() {
            return geoDamageBonus;
        }

        public void setGeoDamageBonus(float geoDamageBonus) {
            this.geoDamageBonus = geoDamageBonus;
        }

        public float getAnemoDamageBonus() {
            return anemoDamageBonus;
        }

        public void setAnemoDamageBonus(float anemoDamageBonus) {
            this.anemoDamageBonus = anemoDamageBonus;
        }

        public float getCryoDamageBonus() {
            return cryoDamageBonus;
        }

        public void setCryoDamageBonus(float cryoDamageBonus) {
            this.cryoDamageBonus = cryoDamageBonus;
        }

        public float getPhysicalDamageBonus() {
            return physicalDamageBonus;
        }

        public void setPhysicalDamageBonus(float physicalDamageBonus) {
            this.physicalDamageBonus = physicalDamageBonus;
        }

        public Artifact getFlowerOfLife() {
            return flowerOfLife;
        }

        public void setFlowerOfLife(@NotNull Artifact flowerOfLife) throws InvalidArtifactTypeException {
            if(flowerOfLife.getType() != ArtifactType.FLOWER_OF_LIFE){
                throw new InvalidArtifactTypeException(ArtifactType.FLOWER_OF_LIFE, flowerOfLife.getType());
            }else{
                this.flowerOfLife = flowerOfLife;
            }
        }

        public Artifact getPlumeOfDeath() {
            return plumeOfDeath;
        }

        public void setPlumeOfDeath(Artifact plumeOfDeath) throws InvalidArtifactTypeException {
            if(plumeOfDeath.getType() != ArtifactType.PLUME_OF_DEATH){
                throw new InvalidArtifactTypeException(ArtifactType.PLUME_OF_DEATH, plumeOfDeath.getType());
            }else{
                this.plumeOfDeath = plumeOfDeath;
            }
        }


        public Artifact getSandsOfEon() {
            return sandsOfEon;
        }

        public void setSandsOfEon(Artifact sandsOfEon) throws InvalidArtifactTypeException{
            if(plumeOfDeath.getType() != ArtifactType.SANDS_OF_EON){
                throw new InvalidArtifactTypeException(ArtifactType.SANDS_OF_EON, sandsOfEon.getType());
            }else{
                this.sandsOfEon = sandsOfEon;
            }
        }

        public Artifact getGobletOfEnothem() {
            return gobletOfEnothem;
        }

        public void setGobletOfEnothem(Artifact gobletOfEnothem) throws InvalidArtifactTypeException{
            if(gobletOfEnothem.getType() != ArtifactType.GOBLET_OF_EONOTHEM){
                throw new InvalidArtifactTypeException(ArtifactType.GOBLET_OF_EONOTHEM, gobletOfEnothem.getType());
            }else{
                this.gobletOfEnothem = gobletOfEnothem;
            }
        }

        public Artifact getCircletOfLogos() {
            return circletOfLogos;
        }

        public void setCircletOfLogos(Artifact circletOfLogos) throws InvalidArtifactTypeException{
            if(circletOfLogos.getType() != ArtifactType.CIRCLET_OF_LOGOS){
                throw new InvalidArtifactTypeException(ArtifactType.CIRCLET_OF_LOGOS, circletOfLogos.getType());
            }else{
                this.circletOfLogos = circletOfLogos;
            }
        }


//    public void getCharacterDetails() {
//        System.out.println("Character Details:");
//        System.out.println("==================================");
//        System.out.println("Name: " + name);
//        System.out.println("Element: " + element);
//        System.out.println("Rarity: " + rarity);
//        System.out.println("Level: " + level);
//        System.out.println("HP: " + hp);
//        System.out.println("ATK: " + atk);
//        System.out.println("DEF: " + def);
//        System.out.println("Elemental Mastery: " + elementalMastery);
//        System.out.println("Energy Recharge: " + energyRecharge);
//        System.out.println("Crit Rate: " + critRate);
//        System.out.println("Crit Damage: " + critDamage);
//        System.out.println("====================================");
//            System.out.println("Electro Damage Bonus: " + electroDamageBonus);
//            System.out.println("Dendro Damage Bonus: " + dendroDamageBonus);
//            System.out.println("Hydro Damage Bonus: " + hydroDamageBonus);
//            System.out.println("Pyro Damage Bonus: " + pyroDamageBonus);
//            System.out.println("Geo Damage Bonus: " + geoDamageBonus);
//            System.out.println("Anemo Damage Bonus: " + anemoDamageBonus);
//            System.out.println("Cryo Damage Bonus: " + cryoDamageBonus);
//            System.out.println("Physical Damage Bonus: " + physicalDamageBonus);
//
//    }

    public void getCharacterDetails() {
        getCharacterDetails(false); // Call the method without showing talents by default
    }

    public void getCharacterDetails(boolean showTalents) {
        System.out.println("Character Details:");
        System.out.println("==================================");
        System.out.print("Name: ");
        // Apply color to the character's name based on the element
        switch (this.element) {
            case Element.ELECTRO:
                System.out.print("\u001B[35m" + name + "\u001B[0m"); // Purple color for Electro
                break;
            // Add cases for other elements if needed
            default:
                System.out.print(name); // Default color for other elements
        }
        System.out.println();
        System.out.println("Element: " + element);
        System.out.println("Rarity: " + rarity);
        System.out.println("Level: " + level);
        System.out.println("HP: " + hp);
        System.out.println("ATK: " + atk);
        System.out.println("DEF: " + def);
        System.out.println("Elemental Mastery: " + elementalMastery);
        System.out.println("Energy Recharge: " + energyRecharge);
        System.out.println("Crit Rate: " + critRate);
        System.out.println("Crit Damage: " + critDamage);
        System.out.println("====================================");

        if (showTalents) {
            System.out.println("Talents:");
            for (int i = 0; i < 5; i++) {
                System.out.println("Talent " + (i + 1) + ": " + talents[i].getName() + " (Level " + talents[i].getLevel() + ")");
                System.out.println("Description: " + talents[i].getDescription());
            }
        }
    }

    void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    //    Character(){};
}
