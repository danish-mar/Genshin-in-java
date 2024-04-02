package com.genshinimpact.weapon.Weapons.Polearms;

import com.genshinimpact.Rarity;
import com.genshinimpact.weapon.Spear;
import com.genshinimpact.weapon.Type;

public class PrimordialJadeWingedSpear extends Spear {
    @Override
    public void ascend(){
        if (this.getLevel() < MAX_LEVEL){
            int newLevel = this.getLevel() + ASCENSION_INCREMENT;
            this.setLevel(newLevel);

            if (getAssensionMilestone() == 1){
                this.setAtk(261);
                this.setCritRate(12.4f);
            }if (getAssensionMilestone() == 2){
                this.setAtk(341);
                this.setCritRate(14.3f);
            }if (getAssensionMilestone() == 3){
                this.setAtk(423);
                this.setCritRate(16.2f);
            }if (getAssensionMilestone() == 4){
                this.setAtk(506);
                this.setCritRate(18.2f);
            }if (getAssensionMilestone() == 5){
                this.setAtk(590);
                this.setCritRate(20.1f);
            }if (getAssensionMilestone() == 6){
                this.setAtk(674);
                this.setCritRate(22.1f);
            }

        }
    }

    public PrimordialJadeWingedSpear(){
        this.name = "Promordial Jade Spear";
        this.weaponType = Type.POLEARM;
        this.rarity = Rarity.fiveStar;
        this.setAtk(48);
        this.setCritRate(4.8f);
    }
}
