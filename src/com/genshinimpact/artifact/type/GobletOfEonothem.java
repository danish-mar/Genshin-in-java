package com.genshinimpact.artifact.type;
import com.genshinimpact.Rarity;
import com.genshinimpact.artifact.*;
import java.util.List;

public class GobletOfEonothem extends Artifact{
    public GobletOfEonothem(String name, ArtifactSet set, Rarity rarity, List<Stat> substats){
        super(name, ArtifactType.GOBLET_OF_EONOTHEM, rarity, set, substats);
    }
}
