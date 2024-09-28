/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Indatech
 */
public class ProductorMemoriaRAM extends EmpleadoProductor {
    private static final int CAPACIDAD_ALMACEN = 55;

    public ProductorMemoriaRAM(int ultimoNumeroCarnet) {
        super(40, ultimoNumeroCarnet);
    }

    public int produccionDiaria() {
        if (ultimoNumeroCarnet >= 0 && ultimoNumeroCarnet < 3) {
            return 3;  // 3 RAM cada día
        } else if (ultimoNumeroCarnet >= 3 && ultimoNumeroCarnet < 6) {
            return 2;  // 2 RAM cada día
        } else {
            return 1;  // 1 RAM cada día
        }
    }

    public boolean puedeProducir(int almacenActual, int capacidadAlmacen) {
        return almacenActual < CAPACIDAD_ALMACEN;
    }
}