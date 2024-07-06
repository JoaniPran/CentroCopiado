public class Hoja extends Imprimible implements Enviable{

    private int cantidadDeHojas;
    private Distancia distancia;
    private Costo costoPorHoja = new Costo(0.1F);
    private Costo costoPorKilomentro = new Costo(5);
    private Cantidad cantidad;

    Hoja(int cantidaHojas, int kilomentros){
        this.distancia = new Distancia(kilomentros);
        this.cantidad = new Cantidad(cantidaHojas);
    }

    @Override
    public Costo calcularCosto(){
        return (costoPorCantidad()).sumarseCon(calcularCostoEnvio());
    }


    public Costo costoPorCantidad(){
        return (new Costo(cantidad.valorNumerico() * costoPorHoja.valorNumerico()));
    }

    @Override
    public Costo calcularCostoEnvio(){
        return (new Costo (distancia.valorNumerico() * costoPorKilomentro.valorNumerico()));
    }

    public Cantidad ObtenerCantidad(){
        return cantidad;
    }

    public Distancia ObtenerDistancia(){
        return distancia;
    }


}
