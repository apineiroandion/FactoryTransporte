public interface IComun {
    /**
     *Tipo de Emalaje
     */
    int PALET = 0;
    /**
     * Tipo de Emalaje
     */
    int ENVOLTORIO_CARTON = 1;
    /**
     * Tipo de Emalaje
     */
    int CAJA_MADERA = 2;

    /**
     *
     * @param cp Integer codigo postal
     * @return coste
     */
    public Float costeTotal(Integer cp);

    /**
     *
     * @param x dimension eje x
     * @param y dimension eje y
     * @param peso del paquete
     * @return tipo de embalaje a usar
     */
    public Integer tipoEmbalaje(Float x, Float y, Float peso);
}
