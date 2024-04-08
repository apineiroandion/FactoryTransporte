import org.junit.jupiter.api.Test;

import  org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class TestFactoryTrans {
    @Test
    public void testGetTransporteReturnCamionNotNull() {
        assertNotNull(FactoryTrans.getTransporte(FactoryTrans.CAMION));
    }
    @Test
    public void testGetTransporteReturnBicicletaNotNull() {
        assertNotNull(FactoryTrans.getTransporte(FactoryTrans.BICICLETA));
    }
    //Preguntar por este metodo
    @Test
    public void testGetTransporteAssertEqualsBicicletaRetrunTrue() {
        Bicicleta bicicleta = new Bicicleta();
        assertNotEquals(FactoryTrans.getTransporte(FactoryTrans.BICICLETA), bicicleta);
    }
}
