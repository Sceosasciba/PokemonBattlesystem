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

    private String BattleText;

    public void setBattleText(String BattleText) {
        this.BattleText = BattleText;
    }

    public String getBattleText() {
        return BattleText;
    }

    public static void PokemonBattle(Pokemon poke1, Pokemon poke2, Moves move1, Moves move2, BattleModifier base, Battle battle, Text text) {
        while (poke1.getHpPoke() > 0 && poke2.getHpPoke() > 0) {
            if (poke1.getSpeedPoke() > poke2.getSpeedPoke()) {
                int damage = DamageOutput(poke1, poke2, move1, base);
                int remainingHp = poke2.getHpPoke() - damage;
                poke2.setHpPoke(remainingHp);
                int PpLeft = move1.getPpMove();
                PpLeft = PpLeft - 1;
                move1.setPpMove(PpLeft);
                text.setPp(move1 + " still has " + move1.getPpMove() + " PP left. ");
                text.setHpLeft(poke2 + " got " + poke2.getHpPoke() + " HP left. ");
                if (base.getTypeAccuracy() == 1) {
                    battle.setBattleText(poke1 + " misses, while using " + move1 + ". ");

                } else if (base.getTypeMultiplier() >= 2) {
                    battle.setBattleText(poke1 + " hits " + poke2 + " with " + move1 + ", it does " + damage + " damage. " + "It is super effective. ");

                } else if (base.getTypeMultiplier() == 0.5 || base.getTypeMultiplier() == 0.25) {
                    battle.setBattleText(poke1 + " hits " + poke2 + " with " + move1 + ", it does " + damage + " damage. " + "It is not very effective. ");

                } else if (base.getTypeMultiplier() == 0) {
                    battle.setBattleText(poke1 + " tries to attack " + poke2 + " with " + move1 + ", but " + poke2 + " is immune to " + move1 + ". ");
                    base.setTypeCritical(0);

                } else {
                    battle.setBattleText(poke1 + " hits " + poke2 + " with " + move1 + ", it does " + damage + " damage. ");

                }
                if (poke2.getHpPoke() <= 0) {
                    text.setHpLeft(poke2 + " died. ");
                    if (base.getTypeCritical() == 1) {
                        battle.setBattleText(battle.getBattleText() + text.getHpLeft() + text.getPp() + base.getTypeCriticalHitText());
                        System.out.println(battle.getBattleText());
                    } else {
                        battle.setBattleText(battle.getBattleText() + text.getHpLeft() + text.getPp());
                        System.out.println(battle.getBattleText());
                    }
                } else if (base.getTypeCritical() == 1) {
                    battle.setBattleText(battle.getBattleText() + text.getHpLeft() + text.getPp() + base.getTypeCriticalHitText());
                    System.out.println(battle.getBattleText());
                } else {
                    battle.setBattleText(battle.getBattleText() + text.getHpLeft() + text.getPp());
                    System.out.println(battle.getBattleText());
                }
                if (poke2.getHpPoke() > 0) {
                    damage = DamageOutput(poke2, poke1, move2, base);
                    remainingHp = poke1.getHpPoke() - damage;
                    poke1.setHpPoke(remainingHp);
                    PpLeft = move2.getPpMove();
                    PpLeft = PpLeft - 1;
                    move2.setPpMove(PpLeft);
                    text.setPp(move2 + " still has " + move2.getPpMove() + " PP left.");
                    text.setHpLeft(poke1 + " got " + poke1.getHpPoke() + " HP left. ");
                    if (base.getTypeAccuracy() == 1) {
                        battle.setBattleText(poke2 + " misses, while using " + move2 + ". ");
                    } else if (base.getTypeMultiplier() >= 2) {
                        battle.setBattleText(poke2 + " hits " + poke1 + " with " + move2 + ", it does " + damage + " damage. " + "It is very effective. ");
                    } else if (base.getTypeMultiplier() == 0.5 || base.getTypeMultiplier() == 0.25) {
                        battle.setBattleText(poke2 + " hits " + poke1 + " with " + move2 + ", it does " + damage + " damage. " + "It is not very effective. ");
                    } else if (base.getTypeMultiplier() == 0) {
                        battle.setBattleText(poke2 + " tries to attack " + poke1 + " with " + move2 + ", but " + poke1 + " is immune to " + move2 + ". ");
                        base.setTypeCritical(0);
                    } else {
                        battle.setBattleText(poke2 + " hits " + poke1 + " with " + move2 + ", it does " + damage + " damage. ");
                    }
                }
                if (poke1.getHpPoke() <= 0) {
                    text.setHpLeft(poke1 + " died. ");
                    if (base.getTypeCritical() == 1) {
                        battle.setBattleText(battle.getBattleText() + text.getHpLeft() + text.getPp() + base.getTypeCriticalHitText());
                        System.out.println(battle.getBattleText());
                    } else {
                        battle.setBattleText(battle.getBattleText() + text.getHpLeft() + text.getPp());
                        System.out.println(battle.getBattleText());
                    }
                } else if (base.getTypeCritical() == 1) {
                    battle.setBattleText(battle.getBattleText() + text.getHpLeft() + text.getPp() + base.getTypeCriticalHitText());
                    System.out.println(battle.getBattleText());
                } else {
                    battle.setBattleText(battle.getBattleText() + text.getHpLeft() + text.getPp());
                    System.out.println(battle.getBattleText());
                }
            } else {
                if (poke2.getSpeedPoke() > poke1.getSpeedPoke()) {
                    int damage = DamageOutput(poke2, poke1, move2, base);
                    int remainingHp = poke1.getHpPoke() - damage;
                    poke1.setHpPoke(remainingHp);
                    int PpLeft = move2.getPpMove();
                    PpLeft = PpLeft - 1;
                    move2.setPpMove(PpLeft);
                    text.setPp(move2 + " still has " + move2.getPpMove() + " PP left.");
                    text.setHpLeft(poke1 + " got " + poke1.getHpPoke() + " HP left. ");
                    if (base.getTypeAccuracy() == 1) {
                        battle.setBattleText(poke2 + " misses, while using " + move2 + ". ");
                    } else if (base.getTypeStat() >= 2) {
                        battle.setBattleText(poke2 + " hits " + poke1 + " with " + move2 + ", it does " + damage + " damage. " + "It is super effective. ");
                    } else if (base.getTypeMultiplier() == 0.5 || base.getTypeMultiplier() == 0.25) {
                        battle.setBattleText(poke2 + " hits " + poke1 + " with " + move2 + ", it does " + damage + " damage. " + "It is not very effective. ");
                    } else if (base.getTypeMultiplier() == 0) {
                        battle.setBattleText(poke2 + " tries to attack " + poke1 + " with " + move2 + ", but " + poke1 + " is immune to " + move2 + ". ");
                        base.setTypeCritical(0);
                    } else {
                        battle.setBattleText(poke2 + " hits " + poke1 + " with " + move2 + ", it does " + damage + " damage. ");
                    }
                    if (poke1.getHpPoke() <= 0) {
                        text.setHpLeft(poke1 + " died. ");
                        if (base.getTypeCritical() == 1) {
                            battle.setBattleText(battle.getBattleText() + text.getHpLeft() + text.getPp() + base.getTypeCriticalHitText());
                            System.out.println(battle.getBattleText());
                        } else {
                            battle.setBattleText(battle.getBattleText() + text.getHpLeft() + text.getPp());
                            System.out.println(battle.getBattleText());
                        }
                    } else if (base.getTypeCritical() == 1) {
                        battle.setBattleText(battle.getBattleText() + text.getHpLeft() + text.getPp() + base.getTypeCriticalHitText());
                        System.out.println(battle.getBattleText());
                    } else {
                        battle.setBattleText(battle.getBattleText() + text.getHpLeft() + text.getPp());
                        System.out.println(battle.getBattleText());
                    }
                    if (poke1.getHpPoke() > 0) {
                        damage = DamageOutput(poke1, poke2, move1, base);
                        remainingHp = poke2.getHpPoke() - damage;
                        poke2.setHpPoke(remainingHp);
                        PpLeft = move1.getPpMove();
                        PpLeft = PpLeft - 1;
                        move1.setPpMove(PpLeft);
                        text.setPp(move1 + " still has " + move1.getPpMove() + " PP left.");
                        text.setHpLeft(poke2 + " got " + poke2.getHpPoke() + " HP left. ");
                        if (base.getTypeAccuracy() == 1) {
                            battle.setBattleText(poke1 + " misses, while using " + move1 + ". ");
                        } else if (base.getTypeStat() >= 2) {
                            battle.setBattleText(poke1 + " hits " + poke2 + " with " + move1 + ", it does " + damage + " damage. " + "It is super effective. ");
                        } else if (base.getTypeMultiplier() == 0.5 || base.getTypeMultiplier() == 0.25) {
                            battle.setBattleText(poke1 + " hits " + poke2 + " with " + move1 + ", it does " + damage + " damage. " + "It is not very effective. ");
                        } else if (base.getTypeMultiplier() == 0) {
                            battle.setBattleText(poke1 + " tries to attack " + poke2 + " with " + move1 + ", but " + poke2 + " is immune to " + move1 + ". ");
                            base.setTypeCritical(0);
                        } else {
                            battle.setBattleText(poke1 + " hits " + poke2 + " with " + move1 + ", it does " + damage + " damage. ");
                        }
                        if (poke2.getHpPoke() <= 0) {
                            text.setHpLeft(poke2 + " died. ");
                            if (base.getTypeCritical() == 1) {
                                battle.setBattleText(battle.getBattleText() + text.getHpLeft() + text.getPp() + base.getTypeCriticalHitText());
                                System.out.println(battle.getBattleText());
                            } else {
                                battle.setBattleText(battle.getBattleText() + text.getHpLeft() + text.getPp());
                                System.out.println(battle.getBattleText());
                            }
                        } else if (base.getTypeCritical() == 1) {
                            battle.setBattleText(battle.getBattleText() + text.getHpLeft() + text.getPp() + base.getTypeCriticalHitText());
                            System.out.println(battle.getBattleText());
                        } else {
                            battle.setBattleText(battle.getBattleText() + text.getHpLeft() + text.getPp());
                            System.out.println(battle.getBattleText());
                        }
                    }
                }
            }

        }

    }
}
