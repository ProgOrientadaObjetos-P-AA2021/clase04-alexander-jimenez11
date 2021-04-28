/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
         */
        System.out.print("Ingrese el nombre del hospital: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese en que ciudad se encuentra: ");
        String ciudad = sc.nextLine();
        System.out.print("Ingrese el numero de doctores: ");
        int numeroDoctores = sc.nextInt();
        System.out.print("Ingrese el numero de enfermeros: ");
        int numeroEnfermeros = sc.nextInt();

        Hospital h = new Hospital(nombre, ciudad, numeroDoctores, numeroEnfermeros);
        h.establecerNombre(nombre);
        h.establecerCiudad(ciudad);
        h.establecerNumeroDoctores(numeroDoctores);
        h.establecerNumeroEnfermeros(numeroEnfermeros);

        System.out.printf("%s\n", h);
    }
}
