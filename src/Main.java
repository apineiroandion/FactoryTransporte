/**
 * @author Angel
 * Esta aplicacion es un ejemplo de comousar un factory
 * para ello se crean dos clases, Camion y Bicicleta que implementan una interfaz
 * Se crea la clase Factory que crea un objeto deltipo de la interfaz que sea instancia de
 * una de las dos clases en funcion de losparametros introducidos
 * muestra datos de casa instancia en main para comprobar que el programa funciona
 */
public class Main {
    /**
     * Main
     * @param args
     */
    public static void main(String[] args) {

        IComun transporte;

        transporte=FactoryTrans.getTransporte(FactoryTrans.CAMION);
        if(transporte instanceof Camion) System.out.println("CAMION:");
        System.out.println("Coste total: "+transporte.costeTotal(36201)+" "+ "Tipo de transporte: "+transporte.tipoEmbalaje(15f,20f ,35f));


        transporte=FactoryTrans.getTransporte(FactoryTrans.BICICLETA);
        if(transporte instanceof Bicicleta) System.out.println("BICICLETA:");
        System.out.println("Coste total: "+transporte.costeTotal(3600)+" "+"Tipo de transporte: "+transporte.tipoEmbalaje(1f,1f,5f));
    }
}