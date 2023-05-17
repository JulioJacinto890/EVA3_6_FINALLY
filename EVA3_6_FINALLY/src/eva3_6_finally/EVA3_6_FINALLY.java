/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_6_finally;

/**
 *
 * @author hp
 */
public class EVA3_6_FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 9, y= 0;
        try{
        int resu = x / y;
        System.out.println("resultado:"+ resu);
        }catch(ArithmeticException e){
            System.out.println("no se puede dividir entre cero");
        }finally{// Obliga a la ejecucion de esta  seccion de codio
            //es opcional
            System.out.println("Siempre me voy a ejecutar");
            
        }
        System.out.println("");
        
    }
    
}
