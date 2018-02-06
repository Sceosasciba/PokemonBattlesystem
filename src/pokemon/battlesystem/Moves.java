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
public class Moves {
    private String NameMove;
    private int PowerMove;
    private int AccuracyMove;
    private String TypeMove;
    private String CategoryMove;
    private int PpMove;
    
    
    public Moves() {
    this.NameMove = null;
    this.PowerMove = 0;
    this.AccuracyMove = 0;
    this.TypeMove = null;
    this.CategoryMove = null;
    this.PpMove = 0;
    
    
    
    
}

    @Override
    public String toString() {
return this.NameMove;
    }
    
    
    
    public void setPowerMove(int PowerMove) {
        this.PowerMove = PowerMove;
    }

    public void setAccuracyMove(int AccuracyMove) {
        this.AccuracyMove = AccuracyMove;
    }

    public void setNameMove(String NameMove) {
        this.NameMove = NameMove;
    }

    public String getNameMove() {
        return NameMove;
    }

    public void setTypeMove(String TypeMove) {
        this.TypeMove = TypeMove;
    }

    public void setCategoryMove(String CategoryMove) {
        this.CategoryMove = CategoryMove;
    }

    public void setPpMove(int PpMove) {
        this.PpMove = PpMove;
    }

    public int getPowerMove() {
        return PowerMove;
    }

    public int getAccuracyMove() {
        return AccuracyMove;
    }

    public String getTypeMove() {
        return TypeMove;
    }

    public String getCategoryMove() {
        return CategoryMove;
    }

    public int getPpMove() {
        return PpMove;
    }

    
    
}

