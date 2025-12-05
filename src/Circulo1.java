/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pablo
 * @version 1.0
 * 
 */
public class Circulo1 {
       private double centroX;
    private double centroY;
    private double radio;

 /**
 * Constructor.
 * @param x centro: coordenada X.
 * @param y centro: coordenada Y.
 * @param r radio.
 */

    
    public Circulo1(double x, double y, double r) {
        centroX = x;
        centroY = y;
        radio = r;
    }
/**
* Getter.
* @return centro: coordenada X.
*/
    public double getCentroX() {
        return centroX;
    }
/**
* Calcula la longitud de la circunferencia (perímetro del círculo).
* @return perímetro.
*/


    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }
/**
* Desplaza el círculo a otro lugar.
* @param despX movimiento en el eje X.
* @param despY movimiento en el eje Y.
*/
    public void mueve(double despX, double despY) {
        centroX = centroX + despX;
        centroY = centroY + despY;
    }
}
