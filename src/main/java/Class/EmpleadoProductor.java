/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Indatech
 */
public abstract class EmpleadoProductor {
    protected int salarioPorHora;
    protected int ultimoNumeroCarnet;

    public EmpleadoProductor(int salarioPorHora, int ultimoNumeroCarnet) {
        this.salarioPorHora = salarioPorHora;
        this.ultimoNumeroCarnet = ultimoNumeroCarnet;
    }

    public abstract int produccionDiaria();
    public abstract boolean puedeProducir(int almacenActual, int capacidadAlmacen);
}
