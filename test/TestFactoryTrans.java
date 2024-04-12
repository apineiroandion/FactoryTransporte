import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import  org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class TestFactoryTrans {
    @Test
    @DisplayName("Camion no nulo")
    public void testGetTransporteReturnCamionNotNull() {
        assertNotNull(FactoryTrans.getTransporte(FactoryTrans.CAMION));
    }
    @Test
    @DisplayName("Bicicleta no nulo")
    public void testGetTransporteReturnBicicletaNotNull() {
        assertNotNull(FactoryTrans.getTransporte(FactoryTrans.BICICLETA));
    }
    //Preguntar por este metodo
    @Test
    @DisplayName("Tipo Bicileta")
    public void testGetTransporteAssertEqualsBicicletaRetrunTrue() {
        Bicicleta bicicleta = new Bicicleta();
        assertNotEquals(FactoryTrans.getTransporte(FactoryTrans.BICICLETA), bicicleta);
    }
    @Test
    @DisplayName("Tipo Camion")
    public void testGetTransporteAssertEqualsCamionRetrunTrue() {
        Camion camion = new Camion();
        assertNotEquals(FactoryTrans.getTransporte(FactoryTrans.CAMION), camion);
    }
}
