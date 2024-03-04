import com.genshinimpact.character.playable.*;
import com.genshinimpact.Rarity;
import com.genshinimpact.Element;
import com.genshinimpact.weapon.Sword;
import com.genshinimpact.weapon.Weapon;
import com.genshinimpact.weapon.Weapons.Swords.MistsplitterReforged;

import java.util.Locale;

class Main{

    public static void main(String[] args) {

//        Keqing keqing = new Keqing();
//        keqing.getCharacterDetails();
//        keqing.ascension();
//        keqing.ascension();
//        keqing.ascension();
//        keqing.ascension();
//        keqing.ascension();
//        keqing.ascension();
//        keqing.ascension();
//        keqing.ascension();
//        keqing.getCharacterDetails(true);

        MistsplitterReforged mistsplitterReforged = new MistsplitterReforged();

        System.out.println(mistsplitterReforged.name + " Initialized \n @ ATK " + mistsplitterReforged.getAtk() + "\nAnd CRIT DMG " + mistsplitterReforged.getCritDamage());

        System.out.println("[i] Accession " + mistsplitterReforged.getAssensionMilestone());


        mistsplitterReforged.ascend();

        System.out.println("+ Accented to " + mistsplitterReforged.getAssensionMilestone());


        System.out.println(mistsplitterReforged.name + " Acended \n @ ATK " + mistsplitterReforged.getAtk() + "\nAnd CRIT DMG " + mistsplitterReforged.getCritDamage());





    }
}