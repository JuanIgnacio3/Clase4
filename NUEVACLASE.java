/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nuevaclase;

/**
 *
 * @author LABORATORIO 04
 */
public class NUEVACLASE {
    
    public String atributo = "valor atributo";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Persona juan = new Persona();
        juan.caminar();
        juan.ver();
        juan.saltar();
        System.out.println(juan.getClass());
        System.out.println(juan.toString());
        System.out.println("La edad es: "+juan.calcularEdad(2004));
        juan.nombre = "JUAN EVARISTO CORONADO";
        System.out.println("nombre"+juan.nombre);
        Carro automovil = new Carro();
        automovil.desplazar();
        System.out.println("El kilometraje es: " + automovil.calcularKilometraje(100000));
        */
        
        Calculator calculadora = new Calculator();
        System.out.println("La suma de 8 + 8 es: " + calculadora.sumDosNum(8, 8));
        System.out.println("La resta de 8 - 8 es: " + calculadora.resDosNum(8, 8));
        System.out.println("La división de 8 / 8 es: " + calculadora.divDosNum(8, 8));
        System.out.println("La multiplicación de 8 * 8 es: " + calculadora.mulDosNum(8, 8));
    }
    
}
