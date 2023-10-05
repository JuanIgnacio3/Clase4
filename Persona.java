/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nuevaclase;

/**
 *
 * @author LABORATORIO 04
 */
public class Persona {
    public String nombre;
    public double id;
    public String sexo;
    public String genero;
    public int edad;
    public String fechaNacimineto;
    public double estatura;
    public double peso;
    
    
    public void ver(){
        System.out.println("estoy observando");
    }
    
    public void caminar(){
        System.out.println("estoy camuinando");
    }
    
    public void saltar(){
        System.out.println("estoy saltando");
    }
    
    public String canta(){
        return "LARA LARA LARA yo tengo esta edad" + edad + "laralalala";
    }
    
    public int calcularEdad(int anio){
        int resultado = 0;
        resultado = 2023 - anio;
        return resultado;
        
        
    }
    
    
}
