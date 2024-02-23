public class FactoryTrans {
    /**
     * para crear el tipo de Objeto Camion en el switch
     */
    public static final int CAMION = 0;
    /**
     * para crear el tipo de Objeto Bicicleta en el switch
     */
    public static final int BICICLETA = 1;

    /**
     *
     * @param opcion Tipo de objeto que quiere crear
     * @return Instancia de la clase elegida
     */

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
