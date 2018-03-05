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
public class Pokemon {
    private String NaamPoke;
    private String Type1Poke;
    private String Type2Poke;
    private int HpPoke;
    private int AtkPoke;
    private int DefPoke;
    private int SpAtkPoke;
    private int SpDefPoke;
    private int SpeedPoke;
    private String Move1Poke;
    private String Move2Poke;
    private int LevelPoke;
    
    public Pokemon(){
        this.NaamPoke = null;
        this.Type1Poke = null;
        this.Type2Poke = null;
        this.HpPoke = 0;
        this.AtkPoke = 0;
        this.DefPoke = 0;
        this.SpAtkPoke = 0;
        this.SpDefPoke = 0;
        this.SpeedPoke = 0;
        this.Move1Poke = null;
        this.Move2Poke = null;
        this.LevelPoke = 0;
    }
    
    public Pokemon(String naam, String type1, String type2, int HP, int ATK, int DEF, int SPATK, int SPDEF, int SPEED, String move1, int level){
        NaamPoke = naam;
        Type1Poke = type1;
        Type2Poke = type2;
        HpPoke = HP;
        AtkPoke = ATK;
        DefPoke = DEF;
        SpAtkPoke = SPATK;
        SpDefPoke = SPDEF;
        SpeedPoke = SPEED;
        Move1Poke = move1;
        LevelPoke = level;
    }
    
    public Pokemon(String naam, String type1, int HP, int ATK, int DEF, int SPATK, int SPDEF, int SPEED, String move1, int level){
        NaamPoke = naam;
        Type1Poke = type1;
        HpPoke = HP;
        AtkPoke = ATK;
        DefPoke = DEF;
        SpAtkPoke = SPATK;
        SpDefPoke = SPDEF;
        SpeedPoke = SPEED;
        Move1Poke = move1;
        LevelPoke = level;
    }
    
    @Override
    public String toString() {
return this.NaamPoke;
    }
    
    public void setLevelPoke(int LevelPoke) {
        this.LevelPoke = LevelPoke;
    }

    public int getLevelPoke() {
        return LevelPoke;
    }

    public void setMove1Poke(String Move1Poke) {
        this.Move1Poke = Move1Poke;
    }

    public void setMove2Poke(String Move2Poke) {
        this.Move2Poke = Move2Poke;
    }

    public String getMove1Poke() {
        return Move1Poke;
    }

    public String getMove2Poke() {
        return Move2Poke;
    }

    public void setType1Poke(String Type1Poke) {
        this.Type1Poke = Type1Poke;
    }

    public void setType2Poke(String Type2Poke) {
        this.Type2Poke = Type2Poke;
    }

    public String getType1Poke() {
        return Type1Poke;
    }

    public String getType2Poke() {
        return Type2Poke;
    }

    public int getHpPoke() {
        return HpPoke;
    }

    public int getDefPoke() {
        return DefPoke;
    }

    public void setNaamPoke(String NaamPoke) {
        this.NaamPoke = NaamPoke;
    }

    public String getNaamPoke() {
        return NaamPoke;
    }

    public int getSpDefPoke() {
        return SpDefPoke;
    }

    public int getAtkPoke() {
        return AtkPoke;
    }

    public int getSpAtkPoke() {
        return SpAtkPoke;
    }

    public int getSpeedPoke() {
        return SpeedPoke;
    }

    public void setHpPoke(int HpPoke) {
        this.HpPoke = HpPoke;
    }

    public void setDefPoke(int DefPoke) {
        this.DefPoke = DefPoke;
    }

    public void setSpDefPoke(int SpDefPoke) {
        this.SpDefPoke = SpDefPoke;
    }

    public void setAtkPoke(int AtkPoke) {
        this.AtkPoke = AtkPoke;
    }

    public void setSpAtkPoke(int SpAtkPoke) {
        this.SpAtkPoke = SpAtkPoke;
    }

    public void setSpeedPoke(int SpeedPoke) {
        this.SpeedPoke = SpeedPoke;
    }
    
    
   
}

    
