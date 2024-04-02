package com.genshinimpact.artifact.artifacts.thunderingFury;

import com.genshinimpact.Rarity;
import com.genshinimpact.artifact.Artifact;
import com.genshinimpact.artifact.ArtifactGroups;

import java.util.Random;

public class FlowerOfLife extends Artifact {

    private String name = "Thunderbird's Mercy";
    private Rarity rarity = Rarity.fiveStar;
    private Random random = new Random();
    private String pc2Bonus = "Electro DMG Bonus +15%";
    private String pc4Bonus = "Increases DMG caused by Overloaded, Electro-Charged, Superconduct, and Hyperbloom by 40%, and the DMG Bonus conferred by Aggravate is increased by 20%. When Quicken or the aforementioned Elemental Reactions are triggered, Elemental Skill CD is decreased by 1s. Can only occur once every 0.8s.";
    private String details = "A lightning-infused flower, somehow spared the fate of being trodden underfoot or reduced to ash by the furious purple fire, making it the sole survivor on the day of disaster";
    private int artifactId;
    private final int MAX_LEVEL = 20;

    // Constructor
    public FlowerOfLife() {
        this.artifactId = generateArtifactId();
    }

    // Method to generate a random artifact ID
    private int generateArtifactId() {
        return random.nextInt(1000000); // Change range as needed
    }

    // Ascend method
    public void ascend() {
        if (getLevel() >= MAX_LEVEL) {
            System.out.println("Cannot Ascend MAX_LEVEL : 20, Current Level " + getLevel());
        } else {
            // Randomly select an attribute and assign a random value to it
            int attributeIndex = random.nextInt(6); // Assuming you have 6 different attributes
            switch (attributeIndex) {
                case 0:
                    // Assign a random value to ATK
                    int randomATK = random.nextInt(101); // Example: Random value between 0 and 100
                    setATK(randomATK);
                    break;
                case 1:
                    // Assign a random value to DEF
                    int randomDEF = random.nextInt(101); // Example: Random value between 0 and 100
                    this.DEF = randomDEF;
                    break;
                // Add cases for other attributes as needed
                default:
                    // Handle the default case
                    break;
            }
            System.out.println("Artifact has ascended! Random attribute has been added.");
        }
    }
}
