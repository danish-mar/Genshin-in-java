package com.genshinimpact.character.playable;

import com.genshinimpact.Rarity;
import com.genshinimpact.Element;
import com.genshinimpact.weapon.Type;
import com.genshinimpact.weapon.Weapon;

public class Keqing extends Character {




    public void ascension() {
        if (this.level < MAX_LEVEL) {
            this.level += ASCENSION_INCREMENT;
            if(getAssensionMilestone() == 1){
                setAscensionStats(5267,129,321);
            }if(getAssensionMilestone() == 2){
                setAscensionStats(6775,166,413);
                incrementStatByPercentage(9.6f,"critd");
            }if(getAssensionMilestone() == 3){
                setAscensionStats(8500,209,518);
                incrementStatByPercentage(19.2f,"critd");
            }if(getAssensionMilestone() == 4){
                setAscensionStats(10025,247,611);
                incrementStatByPercentage(28.6f,"critd");
            }if(getAssensionMilestone() == 5){
                setAscensionStats(11560, 284,705);
                incrementStatByPercentage(28.8f,"critd");
            }

            System.out.println("Character '" + this.name + "' has reached Level " + this.level);
        } else {
            System.out.println("Cannot ascend: MAX_LEVEL reached");
        }
    }


    @Override
    public void setWeapon(Weapon weapon) {
        if (weapon.getWeaponType() == Type.valueOf("SWORD")) {
            this.weapon = weapon;
        } else {
            System.out.println("\n " + this.name + " is not trained to use weapons of type " + weapon.getWeaponType().name() + " - " + weapon.getName());
        }
    }


    public Keqing() {
        // Initialize the fields of the superclass (Character)
        this.name = "Keqing";
        this.weaponType = Type.SWORD;
        this.rarity = Rarity.fiveStar; // Assuming Keqing is a 5-star character
        this.element = Element.ELECTRO; // Assuming Keqing's element is Electro
        this.level = 1; // Initialize level to 1
        setHp(1020);
        setAtk(25);
        setDef(62);
        setCritDamage(5);
        setCritRate(5);


        talents[0] = new Talent("Yunlai SwordsManShip", "Normal Attack\n" +
                "Performs up to 5 rapid strikes.\n" +
                "\n" +
                "Charged Attack\n" +
                "Consumes a certain amount of Stamina to unleash 2 rapid sword strikes.\n" +
                "\n" +
                "Plunging Attack\n" +
                "Plunges from mid-air to strike the ground below, damaging opponents along the path and dealing AoE DMG upon impact.");

        talents[1] = new Talent("Steller Restoration","Hurls a Lightning Stiletto that annihilates her opponents like the swift thunder.\n" +
                "When the Stiletto hits its target, it deals Electro DMG to opponents in a small AoE, and places a Stiletto Mark on the spot hit.\n" +
                "\n" +
                "Hold\n" +
                "Hold to adjust the direction in which the Stiletto shall be thrown.\n" +
                "Stilettos thrown by the Hold attack mode can be suspended in mid-air, allowing Keqing to jump to them when using Stellar Restoration a second time.\n" +
                "\n" +
                "Lightning Stiletto\n" +
                "If Keqing uses Stellar Restoration again or uses a Charged Attack while its duration lasts, it will clear the Stiletto Mark and produce different effects:\n" +
                "If she uses Stellar Restoration again, she will blink to the location of the Mark and unleash one slashing attack that deals AoE Electro DMG. When blinking to a Stiletto that was thrown from a Holding attack, Keqing can leap across obstructing terrain.\n" +
                "If Keqing uses a Charged Attack, she will ignite a series of thundering cuts at the Mark's location, dealing AoE Electro DMG.");

        talents[2] = new Talent("Starward Sword","Keqing unleashes the power of lightning, dealing Electro DMG in an AOE.\n" +
                "She then blends into the shadow of her blade, striking a series of thunderclap-blows to nearby opponents simultaneously that deal multiple instances of Electro DMG.\n" +
                "The final attack deals massive AoE Electro DMG.\n");

        talents[3] = new Talent("Thundering Penance","After recasting Stellar Restoration while a Lightning Stiletto is present, Keqing's weapon gains an Electro Infusion for 5s.\n");

        talents[4] = new Talent("Aristocratic Dignity", "When casting Starward Sword, Keqing's CRIT Rate is increased by 15%, and her Energy Recharge is increased by 15%. This effect lasts for 8s.\n");

        talents[5] = new Talent("Land's Overseer","When dispatched on an expedition in Liyue, time consumed is reduced by 25%.\n");
        // Initialize other fields as needed

    }
}
