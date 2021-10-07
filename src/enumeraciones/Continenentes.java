/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeraciones;

/**
 *
 * @author javip
 */
public enum Continenentes {
    EUROPA(53),
    ASIA(46),
    AMERICA(44),
    AFRICA(34),
    OCEANIA(14);
    
    private final int numPaises;
    
    Continenentes(int numPaises){
    
        this.numPaises=numPaises;
    }      

    public int getNumPaises() {
        return numPaises;
    }

    @Override
    public String toString() {
        return "Continenentes{" + "numPaises=" + numPaises + '}';
    }
    
    
}
