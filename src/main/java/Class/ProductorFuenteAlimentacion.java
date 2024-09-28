/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Indatech
 */
public class ProductorFuenteAlimentacion extends EmpleadoProductor {
    private static final int CAPACIDAD_ALMACEN = 35;

    public ProductorFuenteAlimentacion(int ultimoNumeroCarnet) {
        super(16, ultimoNumeroCarnet);
    }

    @Override
    public int produccionDiaria() {
        if (ultimoNumeroCarnet >= 0 && ultimoNumeroCarnet < 5) {
            return 3;  // 3 fuentes de alimentación cada día
        } else {
            return 5;  // 5 fuentes de alimentación cada día
        }
    }

    @Override
    public boolean puedeProducir(int almacenActual, int capacidadAlmacen) {
        return almacenActual < CAPACIDAD_ALMACEN;
    }
}