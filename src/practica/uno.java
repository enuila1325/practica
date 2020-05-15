/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author enuil
 */
public class uno {
    private String nombre, direccion, ID;
    private int cuenta, edad;

    public uno() {
    }

    public uno(String nombre, String direccion, String ID, int cuenta, int edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ID = ID;
        this.cuenta = cuenta;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "uno{" + "nombre=" + nombre + ", direccion=" + direccion + ", ID=" + ID + ", cuenta=" + cuenta + ", edad=" + edad + '}';
    }
    
     
}
