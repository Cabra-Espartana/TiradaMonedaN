/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiradaMoneda;


import java.util.Scanner;
public class TiradaMoneda {
public static void main(String[] args) {
//las variables a y b servirán para guardar el resultado de la tirada de dos monedas
int a, b;
int contadorCaras = 0, contadorCruces = 0, numTiradas;
//las variables contador1 y contador2 servirán para guardar el número de caras y cruces dobles consecutivas
int cont1 = 0, cont2 = 0;
int maximoCarasDoblesConsecutivas = 0, maximoCrucesDoblesConsecutivas = 0;
boolean esCruzDoble = false, esCaraDoble = false;
String tirada1;
String tirada2;
Scanner teclado = new Scanner(System.in);
do {
System.out.print("Introduce el número de veces que se van a lanzar las monedas (max 50): ");
numTiradas = teclado.nextInt();
} while (numTiradas < 1 || numTiradas > 50);
for (int i = 0; i < numTiradas; i++) {
a = (int) (Math.random() * 2);
b = (int) (Math.random() * 2);

if (a == 0) {
contadorCaras++;
tirada1="cara";
} else {
contadorCruces++;
tirada1="cruz";
}
if (b == 0) {
contadorCaras++;
tirada2 ="cara";
} else {
contadorCruces++;
tirada2="cruz";
}
System.out.println("Moneda 1: " + tirada1 + ", Moneda 2: " + tirada2);
if (a == b) {
if (a == 0) {
esCaraDoble = true;
esCruzDoble = false;
} else {
esCaraDoble = false;
esCruzDoble = true;
}
} else {
esCaraDoble = false;
esCruzDoble = false;
}
if (esCaraDoble) {
cont1++;
if (cont1 > maximoCarasDoblesConsecutivas) {
maximoCarasDoblesConsecutivas = cont1;
}
} else {
cont1 = 0;
}
if (esCruzDoble) {
cont2++;
if (cont2 > maximoCrucesDoblesConsecutivas) {
maximoCrucesDoblesConsecutivas = cont2;
}
} else {
cont2 = 0;
}
}
System.out.println("Caras: " + contadorCaras + ", Cruces: " + contadorCruces);
System.out.println("Maximo de caras dobles consecutivas: " + maximoCarasDoblesConsecutivas);
System.out.println("Maximo de cruces dobles consecutivas: " + maximoCrucesDoblesConsecutivas);
}
}

    
