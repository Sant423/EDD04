/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Deposito;

/**
 *Clase principal del programa donde aparecen todas las acciones a realizar. En este caso solo llama al m�todo operativa_cuenta
 * @author Santiago Palmiei
 */
public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        float i = 0;

        operativa_cuenta(i);
    }

    /**
     * M�todo donde se intancia y se declara la cuenta. Adem�s se consulta, se inserta y se retira el saldo. 
     * @param cantidade es un par�metro que no se usa pero que es necesario para llamar al m�todo
     */
    private static void operativa_cuenta(float cantidade) {
        CCuenta cuenta1;
        double saldoActual;
        cuenta1 = new CCuenta("Antonio Lopez","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}

