package com.genshinimpact.artifact.type;
import com.genshinimpact.Rarity;
import com.genshinimpact.artifact.*;
import java.util.List;

public class FlowerOfLife extends Artifact {
    Stat Stat = new Stat(StatType.HP_FLAT, 0);


    public FlowerOfLife(String name, ArtifactSet set, Rarity rarity, List<Stat> substats) {
        super(name, ArtifactType.FLOWER_OF_LIFE, rarity, set, substats);
    }
}