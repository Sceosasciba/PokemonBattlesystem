/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.battlesystem;

import static pokemon.battlesystem.DamageOutput.DamageOutput;

/**
 *
 * @author Stan
 */
public class Battle {
    public static void Battle(Pokemon poke1, Pokemon poke2, Moves move1, Moves move2, BattleModifier base) {
        while (poke1.getHpPoke() > 0 && poke2.getHpPoke() > 0) {
            if (poke1.getSpeedPoke() > poke2.getSpeedPoke()) {
                int damage = DamageOutput(poke1, poke2, move1, base);
                int remainingHp = poke2.getHpPoke() - damage;
                poke2.setHpPoke(remainingHp);
                int PpLeft = move1.getPpMove();
                PpLeft = PpLeft - 1;
                move1.setPpMove(PpLeft);
                if (base.getTypeAccuracy() == 1) {
                    System.out.println(poke1 + " misses, while using " + move1 + ". " + move1 + " still has " + move1.getPpMove() + " PP left.");
                } else if (base.getTypeMultiplier() >= 2) {
                    System.out.println(poke1 + " hits " + poke2 + " with " + move1 + ", it did " + damage + " damage. " + poke2 + " got " + poke2.getHpPoke() + " HP left. "
                            + "It was super effective. "  + move1 + " still has " + move1.getPpMove() + " PP left.");
                } else if (base.getTypeMultiplier() == 0.5 || base.getTypeMultiplier() == 0.25) {
                    System.out.println(poke1 + " hits " + poke2 + " with " + move1 + ", it did " + damage + " damage. " + poke2 + " got " + poke2.getHpPoke() + " HP left. "
                            + "It was not very effective. "  + move1 + " still has " + move1.getPpMove() + " PP left.");
                } else if (base.getTypeMultiplier() == 0) {
                    System.out.println(poke1 + " tries to attack " + poke2 + " with " + move1 + ", but " + poke2 + " is immune to " + move1 + ". "  
                            + move1 + " still has " + move1.getPpMove() + " PP left.");
                } else {
                    System.out.println(poke1 + " hits " + poke2 + " with " + move1 + ", it did " + damage + " damage. " + poke2 + " got " + poke2.getHpPoke() + " HP left. "
                     + move1 + " still has " + move1.getPpMove() + " PP left.");
                }
                if (poke2.getHpPoke() > 0) {
                    damage = DamageOutput(poke2, poke1, move2, base);
                    remainingHp = poke1.getHpPoke() - damage;
                    poke1.setHpPoke(remainingHp);
                    PpLeft = move2.getPpMove();
                    PpLeft = PpLeft - 1;
                    move2.setPpMove(PpLeft);
                    if (base.getTypeAccuracy() == 1) {
                        System.out.println(poke2 + " misses, while using " + move2 + ". " + move2 + " still has " + move2.getPpMove() + " PP left.");
                    } else if (base.getTypeMultiplier() >= 2) {
                        System.out.println(poke2 + " hits " + poke1 + " with " + move2 + ", it did " + damage + " damage. " + poke1 + " got " + poke1.getHpPoke() + " HP left. "
                                + "It was very effective. " + move2 + " still has " + move2.getPpMove() + " PP left.");
                    } else if (base.getTypeMultiplier() == 0.5 || base.getTypeMultiplier() == 0.25) {
                        System.out.println(poke2 + " hits " + poke1 + " with " + move2 + ", it did " + damage + " damage. " + poke1 + " got " + poke1.getHpPoke() + " HP left. "
                                + "It was not very effective. " + move2 + " still has " + move2.getPpMove() + " PP left.");
                    } else if (base.getTypeMultiplier() == 0) {
                        System.out.println(poke2 + " tries to attack " + poke1 + " with " + move2 + ", but " + poke1 + " is immune to " + move2 + ". "
                         + move2 + " still has " + move2.getPpMove() + " PP left.");
                    } else {
                        System.out.println(poke2 + " hits " + poke1 + " with " + move2 + ", it did " + damage + " damage. " + poke1 + " got " + poke1.getHpPoke() + " HP left. "
                         + move2 + " still has " + move2.getPpMove() + " PP left.");
                    }
                }
            } else {
                if (poke2.getSpeedPoke() > poke1.getSpeedPoke()) {
                    int damage = DamageOutput(poke2, poke1, move2, base);
                    int remainingHp = poke1.getHpPoke() - damage;
                    poke1.setHpPoke(remainingHp);
                    int PpLeft = move2.getPpMove();
                    PpLeft = PpLeft - 1;
                    move2.setPpMove(PpLeft);
                    if (base.getTypeAccuracy() == 1) {
                        System.out.println(poke2 + " misses, while using " + move2 + ". " + move2 + " still has " + move2.getPpMove() + " PP left.");
                    } else if (base.getTypeStat() >= 2) {
                        System.out.println(poke2 + " hits " + poke1 + " with " + move2 + ", it did " + damage + " damage. " + poke1 + " got " + poke1.getHpPoke() + " HP left. "
                                + "It was super effective. " + move2 + " still has " + move2.getPpMove() + " PP left.");
                    } else if (base.getTypeMultiplier() == 0.5 || base.getTypeMultiplier() == 0.25) {
                        System.out.println(poke2 + " hits " + poke1 + " with " + move2 + ", it did " + damage + " damage. " + poke1 + " got " + poke1.getHpPoke() + " HP left. "
                                + "It was not very effective. " + move2 + " still has " + move2.getPpMove() + " PP left.");
                    } else if (base.getTypeMultiplier() == 0) {
                        System.out.println(poke2 + " tries to attack " + poke1 + " with " + move2 + ", but " + poke1 + " is immune to " + move2 + ". "
                         + move2 + " still has " + move2.getPpMove() + " PP left.");
                    } else {
                        System.out.println(poke2 + " hits " + poke1 + " with " + move2 + ", it did " + damage + " damage. " + poke1 + " got " + poke1.getHpPoke() + " HP left. "
                         + move2 + " still has " + move2.getPpMove() + " PP left.");
                    }
                    if (poke1.getHpPoke() > 0) {
                        damage = DamageOutput(poke1, poke2, move1, base);
                        remainingHp = poke2.getHpPoke() - damage;
                        poke2.setHpPoke(remainingHp);
                        PpLeft = move1.getPpMove();
                        PpLeft = PpLeft - 1;
                        move1.setPpMove(PpLeft);
                        if (base.getTypeAccuracy() == 1) {
                            System.out.println(poke1 + " misses, while using " + move1 + ". " + move1 + " still has " + move1.getPpMove() + " PP left.");
                        } else if (base.getTypeStat() >= 2) {
                            System.out.println(poke1 + " hits " + poke2 + " with " + move1 + ", it did " + damage + " damage. " + poke2 + " got " + poke2.getHpPoke() + " HP left. "
                                    + "It was super effective. " + move1 + " still has " + move1.getPpMove() + " PP left.");
                        } else if (base.getTypeMultiplier() == 0.5 || base.getTypeMultiplier() == 0.25) {
                            System.out.println(poke1 + " hits " + poke2 + " with " + move1 + ", it did " + damage + " damage. " + poke2 + " got " + poke2.getHpPoke() + " HP left. "
                                    + "It was not very effective. " + move1 + " still has " + move1.getPpMove() + " PP left.");
                        } else if (base.getTypeMultiplier() == 0) {
                            System.out.println(poke1 + " tries to attack " + poke2 + " with " + move1 + ", but " + poke2 + " is immune to " + move1 + ". "
                             + move1 + " still has " + move1.getPpMove() + " PP left.");
                        } else {
                            System.out.println(poke1 + " hits " + poke2 + " with " + move1 + ", it did " + damage + " damage. " + poke2 + " got " + poke2.getHpPoke() + " HP left. "
                             + move1 + " still has " + move1.getPpMove() + " PP left.");
                        }
                    }
                }
            }

        }

    }
}
