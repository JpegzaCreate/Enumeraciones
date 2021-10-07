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
public class testEnumeraciones {
    public static void main(String[] args) {
        
//        System.out.println("Primer día d ela semana: "+Dias.LUNES);
//     
//        diasSemanas(Dias.MARTES);

        System.out.println("Pais numero 1: " +Continenentes.AFRICA.name());
        System.out.println("Tiene: " + Continenentes.AFRICA.getNumPaises() + " países");
        
        
    }
    
    public static void diasSemanas(Dias dias){
        switch (dias) {
            case LUNES:
                System.out.println("Es el primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Es el segundo dia de la semana");
                break;
            default:
                throw new AssertionError();
        }
    }
}
