/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

/**
 *
 * @author Oscar Alvarez
 */
public class Padre {
    
    protected String value;
    protected double a,b;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    

    
    public boolean validarNumero(){
        
        if(this.value.equals("")){
            return false;
        }
      
       
        if (this.value.matches("[0.0-9.9]*")) {
            return true;
        }
        
       
        return false;
    }
    
    
    
    
}
