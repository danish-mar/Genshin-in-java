package com.genshinimpact.artifact;

import com.genshinimpact.Rarity;

import java.util.Random;


public abstract class Artifact {

    String name;
    int artifactId;

    Rarity rarity;

    int level;

    ArtifactGroups group;

    stats mainStat;
    int mainStatInt;

    // Main Stat
    int ATK;
    int DEF;
     int HP;

    // sub stats
     float HealingBonus;
     int ElementalMastery;
     float EnergyRecharge;


     float critRate;
     float critDamage;


    // elemental Damages
     float DendroDamageBonus;
     float ElectroDamageBonus;
     float PyroDamageBonus;
     float HydroDamageBonus;
     float GeoDamageBonus;
     float CryoDamageBonus;

     float AnemoDamageBonus;


    // other stats
     float PhysicalDamageBonus;


    public String getName() {
        return name;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public stats getMainStat() {
        return mainStat;
    }

    public int getMainStatInt() {
        return mainStatInt;
    }

    public ArtifactGroups getGroup() {
        return group;
    }

    public int getArtifactId() {
        return artifactId;
    }


    //getters


    public float getCritDamage() {
        return critDamage;
    }

    public float getCritRate() {
        return critRate;
    }

    public float getDendroDamageBonus() {
        return DendroDamageBonus;
    }

    public float getElectroDamageBonus() {
        return ElectroDamageBonus;
    }

    public float getEnergyRecharge() {
        return EnergyRecharge;
    }

    public float getHealingBonus() {
        return HealingBonus;
    }

    public int getATK() {
        return ATK;
    }

    public float getPyroDamageBonus() {
        return PyroDamageBonus;
    }

    public int getDEF() {
        return DEF;
    }

    public int getElementalMastery() {
        return ElementalMastery;
    }

    public int getHP() {
        return HP;
    }

    public int getLevel() {
        return level;
    }

    public float getAnemoDamageBonus() {
        return AnemoDamageBonus;
    }

    public float getCryoDamageBonus() {
        return CryoDamageBonus;
    }

    public float getGeoDamageBonus() {
        return GeoDamageBonus;
    }

    public float getHydroDamageBonus() {
        return HydroDamageBonus;
    }

    public float getPhysicalDamageBonus() {
        return PhysicalDamageBonus;
    }

    //setters

    public void setArtifactId(int artifactId) {
        this.artifactId = artifactId;
    }

    public void setATK(int ATK) {
        this.ATK = ATK;
    }

    public void setDEF(int DEF) {
        this.DEF = DEF;
    }

    public void setCritDamage(float critDamage) {
        this.critDamage = critDamage;
    }

    public void setCritRate(float critRate) {
        this.critRate = critRate;
    }

    public void setGroup(ArtifactGroups group) {
        this.group = group;
    }

    public void setElementalMastery(int elementalMastery) {
        ElementalMastery = elementalMastery;
    }

    public void setAnemoDamageBonus(float anemoDamageBonus) {
        AnemoDamageBonus = anemoDamageBonus;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setEnergyRecharge(float energyRecharge) {
        EnergyRecharge = energyRecharge;
    }

    public void setCryoDamageBonus(float cryoDamageBonus) {
        CryoDamageBonus = cryoDamageBonus;
    }

    public void setDendroDamageBonus(float dendroDamageBonus) {
        DendroDamageBonus = dendroDamageBonus;
    }

    public void setElectroDamageBonus(float electroDamageBonus) {
        ElectroDamageBonus = electroDamageBonus;
    }

    public void setGeoDamageBonus(float geoDamageBonus) {
        GeoDamageBonus = geoDamageBonus;
    }

    public void setHealingBonus(float healingBonus) {
        HealingBonus = healingBonus;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setHydroDamageBonus(float hydroDamageBonus) {
        HydroDamageBonus = hydroDamageBonus;
    }

    public void setMainStat(stats mainStat) {
        this.mainStat = mainStat;
    }

    public void setMainStatInt(int mainStatInt) {
        this.mainStatInt = mainStatInt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPyroDamageBonus(float pyroDamageBonus) {
        PyroDamageBonus = pyroDamageBonus;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    public void setPhysicalDamageBonus(float physicalDamageBonus) {
        PhysicalDamageBonus = physicalDamageBonus;
    }
}

