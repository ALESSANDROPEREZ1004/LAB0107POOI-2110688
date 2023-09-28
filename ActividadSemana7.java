/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividadsemana7;

/**
 *
 * @author Alessandro
 */
public class ActividadSemana7 {

    public static void main(String[] args) {
    package figurasgeometricas;

public class ActividadSemana7 {
    protected String nombre;

    protected Figura(String nombre) {
        this.nombre = nombre;
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double calcularArea() {
        return 0.0; // Método a ser implementado por las subclases
    }

    public boolean esRegular() {
        return false; // Método a ser implementado por las subclases
    }
}

// Clase Cuadrilatero
package Figuras;

public class Cuadrilatero extends Figura {
    private Punto vertice1;
    private Punto vertice2;
    private Punto vertice3;
    private Punto vertice4;

    public Cuadrilatero(String nombre, Punto vertice1, Punto vertice2, Punto vertice3, Punto vertice4) {
        super(nombre);
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
        this.vertice4 = vertice4;
    }

    public Punto getVertice1() {
        return vertice1;
    }

    public void setVertice1(Punto vertice1) {
        this.vertice1 = vertice1;
    }

    public Punto getVertice2() {
        return vertice2;
    }

    public void setVertice2(Punto vertice2) {
        this.vertice2 = vertice2;
    }

    public Punto getVertice3() {
        return vertice3;
    }

    public void setVertice3(Punto vertice3) {
        this.vertice3 = vertice3;
    }

    public Punto getVertice4() {
        return vertice4;
    }

    public void setVertice4(Punto vertice4) {
        this.vertice4 = vertice4;
    }

    private boolean comprobarRectangulo() {
        // Implementa lógica para determinar si el cuadrilátero es un rectángulo
    }

    @Override
    public boolean esRegular() {
        return comprobarRectangulo();
    }

    @Override
    public String toString() {
        return "Cuadrilátero: " + getNombre() + ", Vértices: " + vertice1 + ", " + vertice2 + ", " + vertice3 + ", " + vertice4;
    }
}

// Clase Rectangulo
package Figuras;

public class Rectangulo extends Cuadrilatero {
    public Rectangulo(String nombre, Punto vertice1, Punto vertice2, Punto vertice3, Punto vertice4) {
        super(nombre, vertice1, vertice2, vertice3, vertice4);

        if (!esRegular()) {
            throw new IllegalArgumentException("Los vértices son incompatibles con el rectángulo");
        }
    }

    @Override
    public double calcularArea() {
        // Implementa el cálculo del área de un rectángulo
    }

}
    @Override
    public String toString() {
        return "Rectángulo: " + getNombre() + ", Vértices: " + getVertice1() + ", " + getVertice2() + ", " + getVertice3() + ", " + getVertice4();
    }
}


