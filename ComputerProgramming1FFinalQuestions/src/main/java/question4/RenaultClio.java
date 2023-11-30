/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question4;

/**
 *
 * @author sozcu
 */
public class RenaultClio extends Car{
    private int whichyearmade;
    private boolean isusegaseline;

    public RenaultClio(int whichyearmade, boolean isusegaseline, Wheel whells) {
        super(whells);
        this.whichyearmade = whichyearmade;
        this.isusegaseline = isusegaseline;
    }

    public RenaultClio(int whichyearmade, boolean isusegaseline, String color, Wheel whells) {
        super(color, whells);
        this.whichyearmade = whichyearmade;
        this.isusegaseline = isusegaseline;
    }
    

    public RenaultClio(int whichyearmade, String color, Wheel whells) {
        super(color, whells);
        this.whichyearmade = whichyearmade;
    }
    
    public RenaultClio(Wheel whells) {
        super(whells);
    }

    @Override
    public void setWhells(Wheel whells) {
        super.setWhells(whells); }

    @Override
    public void setColor(String color) {
        super.setColor(color); }

    /**
     * @return the whichyearmade
     */
    public int getWhichyearmade() {
        return whichyearmade;
    }

    /**
     * @param whichyearmade the whichyearmade to set
     */
    public void setWhichyearmade(int whichyearmade) {
        this.whichyearmade = whichyearmade;
    }

    /**
     * @return the isusegaseline
     */
    public boolean isIsusegaseline() {
        return isusegaseline;
    }

    /**
     * @param isusegaseline the isusegaseline to set
     */
    public void setIsusegaseline(boolean isusegaseline) {
        this.isusegaseline = isusegaseline;
    }

    
    
}
