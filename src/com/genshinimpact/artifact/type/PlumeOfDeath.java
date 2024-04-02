package com.genshinimpact.artifact.type;
import com.genshinimpact.Rarity;
import com.genshinimpact.artifact.*;
import java.util.List;
public class PlumeOfDeath extends Artifact {
    public PlumeOfDeath(String name, ArtifactSet set, Rarity rarity, List<Stat> substats) {
        super(name, ArtifactType.PLUME_OF_DEATH, rarity, set, substats);
    }
}