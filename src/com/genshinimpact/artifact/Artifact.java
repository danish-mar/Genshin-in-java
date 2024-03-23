package com.genshinimpact.artifact;

import com.genshinimpact.Rarity;

import java.util.List;

public class Artifact {
    private String name;
    private ArtifactType type;
    private Rarity rarity;
    private ArtifactSet set;
    private Stat mainStat;
    private List<Stat> substats;

    // ... Constructor, getters, setters ...


    public Artifact(String name, ArtifactType type, Rarity rarity, ArtifactSet set, Stat mainStat, List<Stat> substats) {
        this.name = name;
        this.type = type;
        this.rarity = rarity;
        this.set = set;
        this.mainStat = mainStat;
        this.substats = substats;
    }

    public String getName() {
        return name;
    }

    public ArtifactType getType() {
        return type;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public ArtifactSet getSet() {
        return set;
    }

    public Stat getMainStat() {
        return mainStat;
    }

    public List<Stat> getSubstats() {
        return substats;
    }


}
