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

        Pokemon bulbasaur = new Pokemon();
        bulbasaur.setNaamPoke("Bulbasaur");
        bulbasaur.setType1Poke("Grass");
        bulbasaur.setType2Poke("Poison");
        bulbasaur.setHpPoke(45);
        bulbasaur.setAtkPoke(49);
        bulbasaur.setDefPoke(49);
        bulbasaur.setSpAtkPoke(65);
        bulbasaur.setSpDefPoke(65);
        bulbasaur.setSpeedPoke(45);
        bulbasaur.setMove1Poke("tackle");
        bulbasaur.setLevelPoke(5);

        Pokemon charmander = new Pokemon();
        charmander.setNaamPoke("Charmander");
        charmander.setType1Poke("Fire");
        charmander.setHpPoke(39);
        charmander.setAtkPoke(52);
        charmander.setDefPoke(43);
        charmander.setSpAtkPoke(60);
        charmander.setSpDefPoke(50);
        charmander.setSpeedPoke(65);
        charmander.setMove1Poke("ember");
        charmander.setLevelPoke(5);

        Pokemon squirtle = new Pokemon();
        squirtle.setNaamPoke("Squirtle");
        squirtle.setType1Poke("Water");
        squirtle.setHpPoke(44);
        squirtle.setAtkPoke(48);
        squirtle.setDefPoke(65);
        squirtle.setSpAtkPoke(50);
        squirtle.setSpDefPoke(64);
        squirtle.setSpeedPoke(43);
        squirtle.setMove1Poke("watergun");
        squirtle.setLevelPoke(5);

        Moves tackle = new Moves();
        tackle.setNameMove("Tackle");
        tackle.setPowerMove(40);
        tackle.setAccuracyMove(100);
        tackle.setTypeMove("Normal");
        tackle.setCategoryMove("Physical");
        tackle.setPpMove(35);

        Moves scratch = new Moves();
        scratch.setNameMove("Scratch");
        scratch.setPowerMove(40);
        scratch.setAccuracyMove(100);
        scratch.setTypeMove("Normal");
        scratch.setCategoryMove("Physical");
        scratch.setPpMove(35);

        Moves ember = new Moves();
        ember.setNameMove("Ember");
        ember.setPowerMove(60);
        ember.setAccuracyMove(70);
        ember.setTypeMove("Fire");
        ember.setCategoryMove("Special");
        ember.setPpMove(25);

        Moves watergun = new Moves();
        watergun.setNameMove("Watergun");
        watergun.setPowerMove(40);
        watergun.setAccuracyMove(100);
        watergun.setTypeMove("Water");
        watergun.setCategoryMove("Special");
        watergun.setPpMove(25);

        Moves vinewhip = new Moves();
        vinewhip.setNameMove("Vinewhip");
        vinewhip.setPowerMove(45);
        vinewhip.setAccuracyMove(100);
        vinewhip.setTypeMove("Grass");
        vinewhip.setCategoryMove("Physical");
        vinewhip.setPpMove(25);

        Types base = new Types();
        base.setTypeStat(1);
        base.setTypeAccuracy(0);

//       System.out.println(ember.getTypeMove());
        Battle(bulbasaur, charmander, vinewhip, ember, base);

    }

    
}
