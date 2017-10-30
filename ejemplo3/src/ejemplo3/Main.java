/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo3;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Calculadora suma = new Calculadora();
        Calculadora resta = new Calculadora();
        Calculadora division = new Calculadora();
        Calculadora multiplicacion = new Calculadora();
        System.out.println("la suma es: " + suma.Suma() );
        System.out.println("la resta es: " + resta.Resta());
        System.out.println("la suma es: " + division.Division());
        System.out.println("la suma es: " + multiplicacion.Multiplicacion());
  
    }
    
}
