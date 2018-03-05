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
public class BattleModifier {
    
    private double TypeStat;
    private double TypeMultiplier;
    private int TypeAccuracy;
    private int TypeCriticalHit;
    
    public BattleModifier(){
        this.TypeStat = 1;
        this.TypeMultiplier = 0;
        this.TypeAccuracy = 0;
    }

    public void setTypeCriticalHit(int TypeCriticalHit) {
        this.TypeCriticalHit = TypeCriticalHit;
    }

    public int getTypeCriticalHit() {
        return TypeCriticalHit;
    }

    public void setTypeAccuracy(int TypeAccuracy) {
        this.TypeAccuracy = TypeAccuracy;
    }

    public int getTypeAccuracy() {
        return TypeAccuracy;
    }

    public double getTypeMultiplier() {
        return TypeMultiplier;
    }

    public void setTypeMultiplier(double TypeMultiplier) {
        this.TypeMultiplier = TypeMultiplier;
    }
    
    public void setTypeStat(double TypeStat) {
        this.TypeStat = TypeStat;
    }

    public double getTypeStat() {
        return TypeStat;
    }
    
}
