package com.company;

public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.leerNombre();
        persona1.leerApellido();
        persona1.leerEdad();

        if (persona1.devEdad()>=18){
            System.out.println(persona1.devNombre()+" es mayor de edad porque tiene "+persona1.devEdad()+" años");
        }

        else {
            System.out.println(persona1.devNombre()+ " es menor de edad porque tiene "+persona1.devEdad()+ " años");
        }

    }

}
