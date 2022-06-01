package com.company;

import java.util.Scanner;

public class Persona {

   String nombre;
   String apellido;
   int edad;

  Scanner entrada = new Scanner(System.in);

  public void leerNombre(){
      System.out.print("Digite su nombre: ");
      nombre = entrada.nextLine();
  }

  public String devNombre(){
      return nombre;
  }

    public void leerApellido(){
        System.out.print("Digite su apellido: ");
        apellido = entrada.nextLine();
    }

    public String devApellido(){
        return apellido;
    }

    public void leerEdad(){
        System.out.print("Digite su edad: ");
        edad = entrada.nextInt();
    }

    public int devEdad(){
      return edad;
    }
}
