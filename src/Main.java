public class Main {
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