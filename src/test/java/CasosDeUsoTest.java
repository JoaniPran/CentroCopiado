



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasosDeUsoTest {

    @Test
    void casoDeUso1Test() {

        //0,1×45+5×15

        // 0,1 × (por cantidad de hojas 45) + 5 * (15 km)
        Costo costoEsperado = new Costo(79.5F);

        Imprimible hoja =  new Hoja(45, 15);

        Costo costoImprecion = hoja.calcularCosto();

        assertEquals(costoEsperado, costoImprecion);

    }


    @Test
    void casoDeUso02Test() {

        //0,1×45+5×15

        // 0,1 × (por cantidad de hojas 155) + 5 * (15 km)
        Costo costoEsperado = new Costo(73.95F);

        Imprimible Libro = new Libro(155 , 0);

        Costo costoImprecion = Libro.calcularCosto();

        assertEquals(costoEsperado.valorNumerico(), costoImprecion.valorNumerico());

    }

}
