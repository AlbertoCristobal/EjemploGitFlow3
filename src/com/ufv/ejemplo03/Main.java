package com.ufv.ejemplo03;


import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //escanea la sailda del teclado
        Persona p = new Persona();
        Perritos perro = new Perritos();

        System.out.println("Escribe la raza del perro: ");
        perro.setRaza(sc.nextLine());



        System.out.println("Escribe tu nombre: ");
        p.setNombre(sc.nextLine());
        System.out.println(p.getNombre());

        System.out.println("Escribe tu apellido: ");
        p.setApellidos(sc.nextLine());
        System.out.println(p.getApellidos());

        System.out.println("Escribe tu dni sin letra: ");
        p.setDniSinLetra(sc.nextInt());
        System.out.println(p.getDniSinLetra());

        System.out.println("Escribe tu edad: ");
        p.setEdad(sc.nextInt());
        System.out.println("tu edad es :" + p.getEdad());

        //Mostramos los cambios
        System.out.print("Buenos días: " + p.getNombre());
        System.out.print(" " + p.getApellidos() + " con dni: " + p.getDniSinLetra());
        System.out.println(" y edad: " + p.getEdad() );
        System.out.println(" Y tu perro es de raza: "+ perro.getRaza());





    }
}

