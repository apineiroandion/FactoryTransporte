public interface IComun {
    int PALET = 0;
    int ENVOLTORIO_CARTON = 1;
    int CAJA_MADERA = 2;
    public Float costeTotal(Integer cp);
    public Integer tipoEmbalaje(Float x, Float y, Float peso);
}
