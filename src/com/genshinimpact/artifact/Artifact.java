package com.genshinimpact.artifact;

import com.genshinimpact.Rarity;

import java.util.List;

public class Artifact {
        private String name;
        private ArtifactType type;
        private Rarity rarity;
        private ArtifactSet set;
        private List<Stat> substats;

        public Artifact(String name, ArtifactType type, Rarity rarity, ArtifactSet set, List<Stat> substats) {
            this.name = name;
            this.type = type;
            this.rarity = rarity;
            this.set = set;
            this.substats = substats;
        }

        // Getters for all fields



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

    public List<Stat> getSubstats() {
        return substats;
    }


}
