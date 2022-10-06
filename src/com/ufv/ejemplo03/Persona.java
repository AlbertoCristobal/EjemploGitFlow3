package com.ufv.ejemplo03;


public class Persona {
    private String nombre;
    private String apellidos;
    private int dniSinLetra;
    private int edad;


    /**********************    Getter     **********************/


    public String getNombre(){ //para poder acceder al valor de la variable en el main
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public int getDniSinLetra(){
        return dniSinLetra;
    }
    public int getEdad(){
        return edad;
    }
    public void setNombre(String nom){
        this.nombre = nom;
    }

    /**********************    Setter     **********************/

    public void setApellidos(String apell){
        this.apellidos = apell;
    }
    public void setDniSinLetra(int dni){
        this.dniSinLetra = dni;
    }
    public void setEdad(int ed){
        if (ed >= 18){
            System.out.println("Estás hecho un chaval");
        } else {
            System.out.println("Ya eres talludito");
        }
        this.edad = ed;
    }



}

