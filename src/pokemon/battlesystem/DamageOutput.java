/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.battlesystem;

/**
 *
 * @author Stan
 */
public class DamageOutput {
    public static int DamageOutput(Pokemon attacker, Pokemon defender, Moves move, BattleModifier base) {

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
        if (random <= move.getAccuracyMove()) {
            //Do absolutely nothing
        } else {
            double getValue = base.getTypeStat();
            double multiplierType = getValue * 0;
            base.setTypeStat(multiplierType);
            base.setTypeAccuracy(1);
        }

        //CriticalHit
        base.setTypeCriticalHit(0);
        double random2 = Math.random() * 100;
        
        
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
    
    
}

