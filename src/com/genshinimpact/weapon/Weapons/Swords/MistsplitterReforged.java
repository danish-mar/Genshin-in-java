package com.genshinimpact.weapon.Weapons.Swords;

import com.genshinimpact.Rarity;
import com.genshinimpact.weapon.Sword;
import com.genshinimpact.weapon.Type;

public class MistsplitterReforged extends Sword {

    @Override
    public void ascend() {
        if (this.getLevel() < MAX_LEVEL) {
            int newLevel = this.getLevel() + ASCENSION_INCREMENT;
            this.setLevel(newLevel);

            if (getAssensionMilestone() == 1) {
                // Calculate and set the new attack value based on the level
                this.setAtk(133);
//                int newCritDamage = (int) (this.getCritDamage() * 17.0);
                this.setCritDamage(17.0f);
            }
            if(getAssensionMilestone() == 2) {
                this.setAtk(261);
//                int newCritDamage = (int) (this.getCritDamage() * 24.7);
                this.setCritDamage(24.7f);
            }
            if(getAssensionMilestone() == 3){
                this.setAtk(341);
//                int newCritDamage = (int) (this.getCritDamage() * 28.6);
                this.setCritDamage(28.6f);
            }
            if(getAssensionMilestone() == 5){
                this.setAtk(425);
//                int newCritDamage = (int) (this.getCritDamage() * 32.5);
                this.setCritDamage(32.5f);
            }
            if(getAssensionMilestone() == 6){
                this.setAtk(506);
//                int newCritDamage = (int) (this.getCritDamage() * 36.3);
                this.setCritDamage(36.3f);
            }
            if (getAssensionMilestone() == 7){
                this.setAtk(590);
//                int newCritDamage = (int) (this.getCritDamage() * 40.2);
                this.setCritDamage(40.2f);
            }
            if (getAssensionMilestone() == 8){
                this.setAtk(674);
//                int newCritDamage = (int) (this.getCritDamage() * 44.1);
                this.setCritDamage(44.1f);
            }
        }
    }

    public MistsplitterReforged(){
        this.name = "Mistsplitter Reforged";
        this.weaponType = Type.SWORD;
        this.rarity = Rarity.fiveStar;
        this.setAtk(48);
        this.setCritDamage(1);
        int newCritDMG = (int) (this.getCritDamage() * 9.6);
        this.setCritDamage(newCritDMG);
     }

}
