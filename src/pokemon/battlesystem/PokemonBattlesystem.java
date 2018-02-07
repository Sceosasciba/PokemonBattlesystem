/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.battlesystem;

import static java.lang.Math.toIntExact;

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
        ember.setAccuracyMove(50);
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

    //Damage calculation method
    public static int DamageOutput(Pokemon attacker, Pokemon defender, Moves move, Types base) {

        //Super effective or not
        if (move.getTypeMove() == "Fire" && defender.getType1Poke() == "Grass" || move.getTypeMove() == "Fire" && defender.getType2Poke() == "Grass"
                || move.getTypeMove() == "Fire" && defender.getType1Poke() == "Steel" || move.getTypeMove() == "Fire" && defender.getType2Poke() == "Steel"
                || move.getTypeMove() == "Fire" && defender.getType1Poke() == "Ice" || move.getTypeMove() == "Fire" && defender.getType2Poke() == "Ice"
                || move.getTypeMove() == "Fire" && defender.getType1Poke() == "Bug" || move.getTypeMove() == "Fire" && defender.getType2Poke() == "Bug"
                || move.getTypeMove() == "Fightning" && defender.getType1Poke() == "Normal" || move.getTypeMove() == "Fightning" && defender.getType2Poke() == "Normal"
                || move.getTypeMove() == "Fightning" && defender.getType1Poke() == "Rock" || move.getTypeMove() == "Fightning" && defender.getType2Poke() == "Rock"
                || move.getTypeMove() == "Fightning" && defender.getType1Poke() == "Steel" || move.getTypeMove() == "Fightning" && defender.getType2Poke() == "Steel"
                || move.getTypeMove() == "Fightning" && defender.getType1Poke() == "Dark" || move.getTypeMove() == "Fightning" && defender.getType2Poke() == "Dark"
                || move.getTypeMove() == "Fightning" && defender.getType1Poke() == "Ice" || move.getTypeMove() == "Fightning" && defender.getType2Poke() == "Ice"
                || move.getTypeMove() == "Flying" && defender.getType1Poke() == "Fightning" || move.getTypeMove() == "Flying" && defender.getType2Poke() == "Fightning"
                || move.getTypeMove() == "Flying" && defender.getType1Poke() == "Grass" || move.getTypeMove() == "Flying" && defender.getType2Poke() == "Grass"
                || move.getTypeMove() == "Flying" && defender.getType1Poke() == "Bug" || move.getTypeMove() == "Flying" && defender.getType2Poke() == "Bug"
                || move.getTypeMove() == "Poison" && defender.getType1Poke() == "Grass" || move.getTypeMove() == "Poison" && defender.getType2Poke() == "Grass"
                || move.getTypeMove() == "Water" && defender.getType1Poke() == "Fire" || move.getTypeMove() == "Water" && defender.getType2Poke() == "Fire"
                || move.getTypeMove() == "Water" && defender.getType1Poke() == "Ground" || move.getTypeMove() == "Water" && defender.getType2Poke() == "Ground"
                || move.getTypeMove() == "Water" && defender.getType1Poke() == "Rock" || move.getTypeMove() == "Water" && defender.getType2Poke() == "Rock"
                || move.getTypeMove() == "Grass" && defender.getType1Poke() == "Water" || move.getTypeMove() == "Grass" && defender.getType2Poke() == "Water"
                || move.getTypeMove() == "Grass" && defender.getType1Poke() == "Ground" || move.getTypeMove() == "Grass" && defender.getType2Poke() == "Ground"
                || move.getTypeMove() == "Grass" && defender.getType1Poke() == "Rock" || move.getTypeMove() == "Grass" && defender.getType2Poke() == "Rock"
                || move.getTypeMove() == "Electric" && defender.getType1Poke() == "Water" || move.getTypeMove() == "Electric" && defender.getType2Poke() == "Water"
                || move.getTypeMove() == "Electric" && defender.getType1Poke() == "Flying" || move.getTypeMove() == "Electric" && defender.getType2Poke() == "Flying") {

            double multiplierType = 2;
            base.setTypeMultiplier(multiplierType);
            base.setTypeStat(multiplierType);
            
            //Not very effective
            if (move.getTypeMove() == "Normal" && defender.getType1Poke() == "Rock" || move.getTypeMove() == "Normal" && defender.getType2Poke() == "Rock"
                    || move.getTypeMove() == "Normal" && defender.getType1Poke() == "Steel" || move.getTypeMove() == "Normal" && defender.getType2Poke() == "Steel"
                    || move.getTypeMove() == "Grass" && defender.getType1Poke() == "Fire" || move.getTypeMove() == "Grass" && defender.getType2Poke() == "Fire"
                    || move.getTypeMove() == "Grass" && defender.getType1Poke() == "Grass" || move.getTypeMove() == "Grass" && defender.getType2Poke() == "Grass"
                    || move.getTypeMove() == "Grass" && defender.getType1Poke() == "Poison" || move.getTypeMove() == "Grass" && defender.getType2Poke() == "Poison"
                    || move.getTypeMove() == "Grass" && defender.getType1Poke() == "Flying" || move.getTypeMove() == "Grass" && defender.getType2Poke() == "Flying"
                    || move.getTypeMove() == "Grass" && defender.getType1Poke() == "Bug" || move.getTypeMove() == "Grass" && defender.getType2Poke() == "Bug"
                    || move.getTypeMove() == "Grass" && defender.getType1Poke() == "Dragon" || move.getTypeMove() == "Grass" && defender.getType2Poke() == "Dragon"
                    || move.getTypeMove() == "Grass" && defender.getType1Poke() == "Steel" || move.getTypeMove() == "Grass" && defender.getType2Poke() == "Steel") {
                double getValue = base.getTypeStat();
                multiplierType = getValue * 0.5;
                base.setTypeMultiplier(multiplierType);
                base.setTypeStat(multiplierType);
            }
            
            //Immune
            if (move.getTypeMove() == "Normal" && defender.getType1Poke() == "Ghost" || move.getTypeMove() == "Normal" && defender.getType2Poke() == "Ghost") {
                multiplierType = 0;
                base.setTypeMultiplier(multiplierType);
                base.setTypeStat(multiplierType);
            }
            //Not very effective
        } else if (move.getTypeMove() == "Normal" && defender.getType1Poke() == "Rock" || move.getTypeMove() == "Normal" && defender.getType2Poke() == "Rock"
                || move.getTypeMove() == "Normal" && defender.getType1Poke() == "Steel" || move.getTypeMove() == "Normal" && defender.getType2Poke() == "Steel"
                || move.getTypeMove() == "Grass" && defender.getType1Poke() == "Fire" || move.getTypeMove() == "Grass" && defender.getType2Poke() == "Fire"
                || move.getTypeMove() == "Grass" && defender.getType1Poke() == "Grass" || move.getTypeMove() == "Grass" && defender.getType2Poke() == "Grass"
                || move.getTypeMove() == "Grass" && defender.getType1Poke() == "Poison" || move.getTypeMove() == "Grass" && defender.getType2Poke() == "Poison"
                || move.getTypeMove() == "Grass" && defender.getType1Poke() == "Flying" || move.getTypeMove() == "Grass" && defender.getType2Poke() == "Flying"
                || move.getTypeMove() == "Grass" && defender.getType1Poke() == "Bug" || move.getTypeMove() == "Grass" && defender.getType2Poke() == "Bug"
                || move.getTypeMove() == "Grass" && defender.getType1Poke() == "Dragon" || move.getTypeMove() == "Grass" && defender.getType2Poke() == "Dragon"
                || move.getTypeMove() == "Grass" && defender.getType1Poke() == "Steel" || move.getTypeMove() == "Grass" && defender.getType2Poke() == "Steel") {
            double multiplierType = 0.5;
            base.setTypeMultiplier(multiplierType);
            base.setTypeStat(multiplierType);
            
            //Immune
            if (move.getTypeMove() == "Normal" && defender.getType1Poke() == "Ghost" || move.getTypeMove() == "Normal" && defender.getType2Poke() == "Ghost") {
                multiplierType = 0;
                base.setTypeMultiplier(multiplierType);
                base.setTypeStat(multiplierType);
            }
            //Immune
        } else if (move.getTypeMove() == "Normal" && defender.getType1Poke() == "Ghost" || move.getTypeMove() == "Normal" && defender.getType2Poke() == "Ghost") {
            int multiplierType = 0;
            base.setTypeMultiplier(multiplierType);
            base.setTypeStat(multiplierType);

            //Base
        } else {
            int multiplierType = 1;
            base.setTypeStat(multiplierType);
        }

        //If STAB is a thing
        if (move.getTypeMove() == attacker.getType1Poke() || move.getTypeMove() == attacker.getType2Poke()) {
            double getValue = base.getTypeStat();
            double multiplierType = getValue * 1.5;
            base.setTypeStat(multiplierType);
        }

        //Accuracy
        base.setTypeAccuracy(0);
        double random = Math.random() * 100;
        if(random <= move.getAccuracyMove()){
            //Do absolutely nothing
        } else {
            double getValue = base.getTypeStat();
            double multiplierType = getValue * 0;
            base.setTypeStat(multiplierType);
            base.setTypeAccuracy(1);
        }
        
        //Damage calculations
        double modifier = base.getTypeStat() * 1;
        if (move.getCategoryMove() == "Physical") {
            double ratioAtkDef = attacker.getAtkPoke() / (double) defender.getDefPoke();

            double damage = ((2 * attacker.getLevelPoke() / 5 + 2) * move.getPowerMove() * ratioAtkDef / 50 + 2) * modifier;
            int amountDamage = (int) Math.round(damage);
            return amountDamage;
        } else {
            double ratioAtkDef = attacker.getSpAtkPoke() / (double) defender.getSpDefPoke();

            double damage = ((2 * attacker.getLevelPoke() / 5 + 2) * move.getPowerMove() * ratioAtkDef / 50 + 2) * modifier;
            int amountDamage = (int) Math.round(damage);
            return amountDamage;
        }

    }

    public static void Battle(Pokemon poke1, Pokemon poke2, Moves move1, Moves move2, Types base) {
        while (poke1.getHpPoke() > 0 && poke2.getHpPoke() > 0) {
            if (poke1.getSpeedPoke() > poke2.getSpeedPoke()) {
                int damage = DamageOutput(poke1, poke2, move1, base);
                int remainingHp = poke2.getHpPoke() - damage;
                poke2.setHpPoke(remainingHp);
                if(base.getTypeAccuracy() == 1){
                    System.out.println(poke1 + " misses, while using " + move1 + ".");
                } else if (base.getTypeMultiplier() >= 2) {
                    System.out.println(poke1 + " hits " + poke2 + " with " + move1 + ", it did " + damage + " damage. " + poke2 + " got " + poke2.getHpPoke() + " HP left. It was super effective.");
                } else if (base.getTypeMultiplier() == 0.5 || base.getTypeMultiplier() == 0.25) {
                    System.out.println(poke1 + " hits " + poke2 + " with " + move1 + ", it did " + damage + " damage. " + poke2 + " got " + poke2.getHpPoke() + " HP left. It was not very effective.");
                } else if (base.getTypeMultiplier() == 0) {
                        System.out.println(poke1 + " tries to attack " + poke2 + " with " + move1 + ", but " + poke2 + " is immune to " + move1 + ".");
                } else {
                    System.out.println(poke1 + " hits " + poke2 + " with " + move1 + ", it did " + damage + " damage. " + poke2 + " got " + poke2.getHpPoke() + " HP left.");
                }
                if (poke2.getHpPoke() > 0) {
                    damage = DamageOutput(poke2, poke1, move2, base);
                    remainingHp = poke1.getHpPoke() - damage;
                    poke1.setHpPoke(remainingHp);
                    if(base.getTypeAccuracy() == 1){
                    System.out.println(poke2 + " misses, while using " + move2 + ".");
                    } else if (base.getTypeMultiplier() >= 2) {
                        System.out.println(poke2 + " hits " + poke1 + " with " + move2 + ", it did " + damage + " damage. " + poke1 + " got " + poke1.getHpPoke() + " HP left. It was very effective.");
                    } else if (base.getTypeMultiplier() == 0.5 || base.getTypeMultiplier() == 0.25) {
                        System.out.println(poke2 + " hits " + poke1 + " with " + move2 + ", it did " + damage + " damage. " + poke1 + " got " + poke1.getHpPoke() + " HP left. It wasnot v ery effective.");
                    } else if (base.getTypeMultiplier() == 0) {
                        System.out.println(poke2 + " tries to attack " + poke1 + " with " + move2 + ", but " + poke1 + " is immune to " + move2 + ".");
                    } else {
                        System.out.println(poke2 + " hits " + poke1 + " with " + move2 + ", it did " + damage + " damage. " + poke1 + " got " + poke1.getHpPoke() + " HP left.");
                    }
                }
            } else {
                if (poke2.getSpeedPoke() > poke1.getSpeedPoke()) {
                    int damage = DamageOutput(poke2, poke1, move2, base);
                    int remainingHp = poke1.getHpPoke() - damage;
                    poke1.setHpPoke(remainingHp);
                    if(base.getTypeAccuracy() == 1){
                    System.out.println(poke2 + " misses, while using " + move2 + ".");
                    } else if (base.getTypeStat() >= 2) {
                        System.out.println(poke2 + " hits " + poke1 + " with " + move2 + ", it did " + damage + " damage. " + poke1 + " got " + poke1.getHpPoke() + " HP left. It was super effective.");
                    } else if (base.getTypeMultiplier() == 0.5 || base.getTypeMultiplier() == 0.25) {
                        System.out.println(poke2 + " hits " + poke1 + " with " + move2 + ", it did " + damage + " damage. " + poke1 + " got " + poke1.getHpPoke() + " HP left. It was not very effective.");
                    } else if (base.getTypeMultiplier() == 0) {
                        System.out.println(poke2 + " tries to attack " + poke1 + " with " + move2 + ", but " + poke1 + " is immune to " + move2 + ".");
                    } else {
                        System.out.println(poke2 + " hits " + poke1 + " with " + move2 + ", it did " + damage + " damage. " + poke1 + " got " + poke1.getHpPoke() + " HP left.");
                    }
                    if (poke1.getHpPoke() > 0) {
                        damage = DamageOutput(poke1, poke2, move1, base);
                        remainingHp = poke2.getHpPoke() - damage;
                        poke2.setHpPoke(remainingHp);
                        if(base.getTypeAccuracy() == 1){
                            System.out.println(poke1 + " misses, while using " + move1 + ".");
                        } else if (base.getTypeStat() >= 2) {
                            System.out.println(poke1 + " hits " + poke2 + " with " + move1 + ", it did " + damage + " damage. " + poke2 + " got " + poke2.getHpPoke() + " HP left. It was super effective.");
                        } else if (base.getTypeMultiplier() == 0.5 || base.getTypeMultiplier() == 0.25) {
                            System.out.println(poke1 + " hits " + poke2 + " with " + move1 + ", it did " + damage + " damage. " + poke2 + " got " + poke2.getHpPoke() + " HP left. It was not very effective.");
                        } else if (base.getTypeMultiplier() == 0) {
                            System.out.println(poke1 + " tries to attack " + poke2 + " with " + move1 + ", but " + poke2 + " is immune to " + move1 + ".");
                        } else {
                            System.out.println(poke1 + " hits " + poke2 + " with " + move1 + ", it did " + damage + " damage. " + poke2 + " got " + poke2.getHpPoke() + " HP left.");
                        }
                    }
                }
            }

        }

    }
}
