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
public class Calculadora {
    
    private float numero1 = 3;
    private float numero2 = 2;

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    
    
    public float Suma (){
        float resultadoSuma = numero1 + numero2;
        return resultadoSuma;
    }
    
    public float Resta (){
        float resultadoResta = numero1 - numero2;
        return resultadoResta;
    }
    
    public float Division (){
        float resultadoDivision = numero1 / numero2;
        return resultadoDivision;
    }
    
    public float Multiplicacion (){
        float resultadoMultiplicacion = numero1 * numero2;
        return resultadoMultiplicacion;
    }
  
    
}
