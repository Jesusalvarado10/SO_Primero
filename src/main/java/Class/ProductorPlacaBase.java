/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Indatech
 */
public class ProductorPlacaBase extends EmpleadoProductor {
    private static final int CAPACIDAD_ALMACEN = 25;

    public ProductorPlacaBase(int ultimoNumeroCarnet) {
        super(20, ultimoNumeroCarnet);
    }

    @Override
    public int produccionDiaria() {
        if (ultimoNumeroCarnet >= 0 && ultimoNumeroCarnet < 3) {
            return 1 / 2;  // 1 placa base cada 2 días
        } else if (ultimoNumeroCarnet >= 3 && ultimoNumeroCarnet < 6) {
            return 1 / 3;  // 1 placa base cada 3 días
        } else {
            return 1 / 4;  // 1 placa base cada 4 días
        }
    }

    @Override
    public boolean puedeProducir(int almacenActual, int capacidadAlmacen) {
        return almacenActual < CAPACIDAD_ALMACEN;
    }
}
 
    

