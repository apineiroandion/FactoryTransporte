public class Camion implements IComun{
    public Camion() {
    }

    @Override
    public Float costeTotal(Integer cp) {
        Float coste;
        if(cp > 36200) coste = 5f;
        else coste = 6f;
        return coste;
    }

    @Override
    public Integer tipoEmbalaje(Float x, Float y, Float peso) {
        Integer embalaje;
        if(peso > 30) embalaje = IComun.PALET;
        else if (peso >= 30 || peso >=10) embalaje = IComun.CAJA_MADERA;
        else embalaje = IComun.ENVOLTORIO_CARTON;
        return embalaje;
    }
}
