package com.genshinimpact.artifact.type;
import com.genshinimpact.Rarity;
import com.genshinimpact.artifact.*;
import java.util.List;

public class CircletOfLogos extends Artifact {
    public CircletOfLogos(String name, ArtifactSet set, Rarity rarity, List<Stat> substats){
        super(name, ArtifactType.CIRCLET_OF_LOGOS, rarity, set, substats);
    }
}
