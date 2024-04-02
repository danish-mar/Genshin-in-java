package com.genshinimpact.artifact.type;
import com.genshinimpact.Rarity;
import com.genshinimpact.artifact.*;
import java.util.List;

public class SandsOfEon extends Artifact{

    public SandsOfEon(String name, ArtifactSet set, Rarity rarity, List<Stat> substats){
        super(name, ArtifactType.SANDS_OF_EON, rarity, set, substats);
    }
}
