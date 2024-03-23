package com.genshinimpact.character.playable;



public class KamisatoAyaka extends Character {

    public void ascension(){
        if(this.level < MAX_LEVEL){
            this.level += ASCENSION_INCREMENT;
            if(getAssensionMilestone() == 1){

            }
        }
    }

}
