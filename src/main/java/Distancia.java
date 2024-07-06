
public class Distancia {

    private int kilomentros;

    public Distancia(int kilomentros){
        this.kilomentros = kilomentros;
    }

    public boolean pasaBuscarlo() {
        return (this.valorNumerico() == 0);
    }

    public int valorNumerico() {
        return this.kilomentros;
    }

}
