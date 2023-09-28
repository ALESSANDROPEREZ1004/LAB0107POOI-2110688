/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadsemana7;

/**
 *
 * @author Alessandro
 */
public class PaquetePersona {
    package persona;

public class Empleado {
    private String nombre;
    private double salario;
    private int desempeno;

    public Empleado(String nombre, double salario, int desempeno) {
        this.nombre = nombre;
        this.salario = salario;
        this.desempeno = desempeno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getDesempeno() {
        return desempeno;
    }

    public void setDesempeno(int desempeno) {
        this.desempeno = desempeno;
    }

    public double getSalarioAnual() {
        double salarioAnual = salario * 12;
        if (desempeno >= 7 && desempeno <= 10) {
            salarioAnual *= 1.05; // Incremento del 5%
        } else if (desempeno >= 5 && desempeno < 7) {
            salarioAnual *= 1.02; // Incremento del 2%
        } else if (desempeno >= 3 && desempeno < 5) {
            salarioAnual *= 1.01; // Incremento del 1%
        }
        return salarioAnual;
    }
}

// Clase Estudiante 
package persona;

public class Estudiante {
    // Atributos y métodos de la clase Estudiante
}

}
