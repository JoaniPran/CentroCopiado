public class Libro extends Imprimible implements Enviable {

    private Hoja cantidadDeHojas;
    private Costo costoPorKilomentro = new Costo(5);
    private Costo costoEncuadernacion = new Costo(50);

    Libro(int cantidaHojas, int kilomentros) {
        this.cantidadDeHojas = new Hoja(cantidaHojas, kilomentros);
    }

    @Override
    public Costo calcularCosto() {

        Costo descuento = new Costo(0);

        Costo costoCantidad =  this.cantidadDeHojas.costoPorCantidad().sumarseCon(costoEncuadernacion);
        if (this.cantidadDeHojas.ObtenerCantidad().mayorIgual(new Cantidad(100))){
            descuento = new Costo (costoCantidad.valorNumerico() * 10 / 100);
        }

        if (this.cantidadDeHojas.ObtenerCantidad().mayorIgual(new Cantidad(200))){
            descuento = new Costo (costoCantidad.valorNumerico() * 20 / 100);
        }

        return this.cantidadDeHojas.costoPorCantidad().sumarseCon(costoEncuadernacion).sumarseCon(this.calcularCostoEnvio()).descontar(descuento);
    }

    @Override
    public Costo calcularCostoEnvio() {
        if (!this.cantidadDeHojas.ObtenerDistancia().pasaBuscarlo()) {
            return this.cantidadDeHojas.calcularCostoEnvio(); // se le cobra como una hoja. no lo va a buscar.
        } else {
            if (this.cantidadDeHojas.ObtenerCantidad().mayorIgual(new Cantidad(100))) {
                Cantidad cantidad = this.cantidadDeHojas.ObtenerCantidad().dividirPorCantidadHojas(new Cantidad(100));
                return new Costo(cantidad.valorNumerico() * 5);
            }
            //lo pasa a buscar
            return new Costo(0);
        }
    }
}


