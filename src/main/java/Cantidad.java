public class Cantidad {

    private int canitdad;

    public Cantidad(int cantidadPaginas){
        this.canitdad = cantidadPaginas;
    }

    public boolean menorOIgualQue(Cantidad otroCantidad) {
        return this.canitdad <= otroCantidad.valorNumerico();
    }

    public boolean mayorIgual(Cantidad otroCantidad) {
        return this.canitdad >= otroCantidad.valorNumerico();
    }


    public int valorNumerico() {
        return this.canitdad;
    }

    public Cantidad dividirPorCantidadHojas(Cantidad otroCantidad){
        return new Cantidad((int)Math.ceil((double) this.canitdad /otroCantidad.valorNumerico()));
    }

}
