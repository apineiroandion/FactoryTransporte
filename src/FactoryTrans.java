public class FactoryTrans {
    public static final int CAMION = 0;
    public static final int BICICLETA = 1;

    public static IComun getTransporte(Integer opcion){
        switch(opcion){
            case CAMION:
                return new Camion();
            case BICICLETA:
                return new Bicicleta();
            default:
                return null;
        }
    }

}
