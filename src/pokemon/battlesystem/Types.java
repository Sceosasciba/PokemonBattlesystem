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
public class Types {
    
    private double TypeStat;
    private double TypeMultiplier;
    private int TypeAccuracy;

    public void setTypeAccuracy(int TypeAccuracy) {
        this.TypeAccuracy = TypeAccuracy;
    }

    public int getTypeAccuracy() {
        return TypeAccuracy;
    }
    
    public Types(){
        this.TypeStat = 0;
        this.TypeMultiplier = 0;
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
