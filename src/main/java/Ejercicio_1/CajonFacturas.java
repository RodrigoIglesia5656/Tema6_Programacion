package Ejercicio_1;
import java.util.ArrayList;

public class CajonFacturas {
    // Atributo: lista de objetos Factura
    private ArrayList<Factura> facturas;

    // 1. Constructor vacío
    public CajonFacturas() {
        this.facturas = new ArrayList<Factura>();
    }

    // 2. Método añadir
    public void añadir(Factura f) {
        this.facturas.add(f);
    }

    // 3. Método buscar
    // Se busca por el atributo numeroFactura definido en el diagrama
    public Factura buscar(int numeroFactura) {
        for (Factura f : facturas) {
            if (f.getNumeroFactura() == numeroFactura) {
                return f;
            }
        }
        return null; // Retorna null si no se encuentra
    }

    // 4. Método que retorna facturas que no se han cobrado
    // Utiliza el atributo 'pagada' de la clase Factura
    public ArrayList<Factura> facturasPendientesCobro() {
        ArrayList<Factura> pendientes = new ArrayList<>();
        for (Factura f : facturas) {
            // Si 'pagada' es false, se añade a la lista 
            if (!f.isPagada()) {
                pendientes.add(f);
            }
        }
        return pendientes;
    }
}
