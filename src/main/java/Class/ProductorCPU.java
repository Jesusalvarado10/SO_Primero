/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Indatech
 */
public class ProductorCPU extends EmpleadoProductor {
    private static final int CAPACIDAD_ALMACEN = 20;

    public ProductorCPU(int ultimoNumeroCarnet) {
        super(26, ultimoNumeroCarnet);
    }

    public int produccionDiaria() {
        if (ultimoNumeroCarnet >= 0 && ultimoNumeroCarnet < 3) {
            return 1 / 2;  // 1 CPU cada 2 días
        } else if (ultimoNumeroCarnet >= 3 && ultimoNumeroCarnet < 6) {
            return 1 / 3;  // 1 CPU cada 3 días
        } else {
            return 1 / 4;  // 1 CPU cada 4 días
        }
    }


    public boolean puedeProducir(int almacenActual, int capacidadAlmacen) {
        return almacenActual < CAPACIDAD_ALMACEN;
    }
}