public class Camion implements IComun{
    /**
     * Constructor
     */
    public Camion() {
    }

    /**
     *
     * @param cp Integer codigo postal
     * @return coste
     */

    @Override
    public Float costeTotal(Integer cp) {
        Float coste;
        if(cp > 36200) coste = 5f;
        else coste = 6f;
        return coste;
    }

    /**
     *
     * @param x dimension eje x
     * @param y dimension eje y
     * @param peso del paquete
     * @return tipo de embalaje a usar
     */

    @Override
    public Integer tipoEmbalaje(Float x, Float y, Float peso) {
        Integer embalaje;
        if(peso > 30) embalaje = IComun.PALET;
        else if (peso >= 30 || peso >=10) embalaje = IComun.CAJA_MADERA;
        else embalaje = IComun.ENVOLTORIO_CARTON;
        return embalaje;
    }
}
