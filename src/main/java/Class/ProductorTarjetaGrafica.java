/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Indatech
 */
public class ProductorTarjetaGrafica extends EmpleadoProductor {
    private static final int CAPACIDAD_ALMACEN = 10;

    public ProductorTarjetaGrafica(int ultimoNumeroCarnet) {
        super(34, ultimoNumeroCarnet);
    }

    @Override
    public int produccionDiaria() {
        if (ultimoNumeroCarnet >= 0 && ultimoNumeroCarnet < 5) {
            return 1 / 3;  // 1 tarjeta gráfica cada 3 días
        } else {
            return 1 / 2;  // 1 tarjeta gráfica cada 2 días
        }
    }

    @Override
    public boolean puedeProducir(int almacenActual, int capacidadAlmacen) {
        return almacenActual < CAPACIDAD_ALMACEN;
    }
}