/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.battlesystem;

import static pokemon.battlesystem.Battle.Battle;


/**
 *
 * @author Stan
 */
public class PokemonBattlesystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        Pokemon bulbasaur = new Pokemon("Bulbasaur", "Grass", "Poison", 45, 49, 49, 65, 65, 45, "tackle", 5);
        
        Pokemon bulbasaur = new Pokemon("Bulbasaur", "Grass", "Poison", 45, 49, 49, 65, 65, 45, "tackle", 5);
        Pokemon charmander = new Pokemon("Charmander", "Fire", 39, 52, 43, 60, 50, 65, "ember", 5);
        Pokemon squirtle = new Pokemon("Squirtle", "Water", 44, 48, 65, 50, 64, 43, "watergun", 5);
        
        Moves tackle = new Moves("Tackle", 40, 100, "Normal", "Physical", 35);
        Moves scratch = new Moves("Scratch", 40, 100, "Normal", "Physical", 35);
        Moves ember = new Moves("Ember", 60, 100, "Fire", "Special", 25);
        Moves watergun = new Moves("Watergun", 40, 100, "Water", "Special", 25);
        Moves vinewhip = new Moves("Vinewhip", 45, 100, "Grass", "Physical", 25);

        BattleModifier base = new BattleModifier();
        
        Battle(bulbasaur, charmander, vinewhip, ember, base);

        
//      System.out.println(bulbasaur.getHpPoke());
//      System.out.println(ember.getTypeMove());
        

    }

    
}
