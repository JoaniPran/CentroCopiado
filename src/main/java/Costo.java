import java.util.Objects;

public class Costo {

    private float valor;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Costo puntaje = (Costo) o;
        return valor == puntaje.valor;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(valor);
    }

    public Costo(float valor) {
        this.valor = valor;
    }

    public Costo sumarseCon(Costo otroCosto) {
        return new Costo(this.valor + otroCosto.valorNumerico());
    }

    public Costo descontar(Costo otroCosto) {
        return new Costo(this.valor - otroCosto.valorNumerico());
    }

    public boolean menorOIgualQue(Costo otroCosto) {
        return this.valor <= otroCosto.valorNumerico();
    }

    public boolean mayorIgual(Costo otroCosto) {
        return this.valor >= otroCosto.valorNumerico();
    }

    public float valorNumerico() {
        return this.valor;
    }


}
