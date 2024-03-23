package com.genshinimpact.character.playable;

// Imports
import com.genshinimpact.Rarity;
import com.genshinimpact.Element;
import com.genshinimpact.weapon.Type;
import com.genshinimpact.weapon.Weapon;

public class SangonomiyaKokokmi extends Character{

        public void ascension(){

        }

        @Override
        public void setWeapon(Weapon Weapon){
            if(weapon.getWeaponType() == Type.valueOf("CATALYST")){
                this.weapon = Weapon;
            }else{
                System.out.println("\n " + this.name + " is not trained to use weapons of type " + weapon.getWeaponType().name() + " - " + weapon.getName());
            }
        }

        public SangonomiyaKokokmi(){

            this.name = "Sangonomiya Kokomi";
            this.weaponType = Type.CATALYST;
            this.rarity = Rarity.fiveStar;
            this.element = Element.HYDRO;
            this.level = 1;
            setHp(1024);
            setAtk(25);
            setDef(64);
            setCritRate(-80f);
            setCritDamage(0);
        }

}
