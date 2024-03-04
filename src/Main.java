import com.genshinimpact.character.playable.*;
import com.genshinimpact.Rarity;
import com.genshinimpact.Element;
import com.genshinimpact.view.Stats;
import com.genshinimpact.weapon.Sword;
import com.genshinimpact.weapon.Weapon;
import com.genshinimpact.weapon.Weapons.Swords.MistsplitterReforged;

import java.util.Locale;

class Main{

    public static void main(String[] args) {

        Keqing keqing = new Keqing();
        keqing.getCharacterDetails();
        keqing.ascension();
        keqing.ascension();
        keqing.ascension();
        keqing.ascension();
        keqing.ascension();
        keqing.ascension();
        keqing.ascension();
        keqing.ascension();


        Weapon keqing_weapon = new MistsplitterReforged();


        System.out.println(keqing_weapon.getAtk());
        keqing_weapon.ascend();

        keqing_weapon.ascend();
        keqing_weapon.ascend();
        keqing_weapon.ascend();
        keqing_weapon.ascend();
        keqing_weapon.ascend();
        keqing_weapon.ascend();
        keqing_weapon.ascend();
        keqing_weapon.ascend();


        keqing.setWeapon(keqing_weapon);









        Stats s0 = new Stats(keqing);

        s0.printStats();

        //keqing.setWeapon();




    }
}