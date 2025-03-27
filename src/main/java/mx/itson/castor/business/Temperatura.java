/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.castor.business;

/**
 *
 * @author icesp
 */
public class Temperatura {
    
    /**
     * Convierte grados centigrados a fahrenheit.
     * @param centigrados La cantidad de grados centigrados que se desea convertir
     * @return El valor convertido a grados fahrenheit.
     */
    public static double convertirGrados(double centigrados){
        return centigrados * 1.8 + 32;
    }
    
    public static double calcularAreaTriangulo(double base, double altura){
        return (base*altura) / 2;
    }
    
    public static int horasAMinutos(int horas){
        return horas*60;
    }
}
