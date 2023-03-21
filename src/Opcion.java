public enum Opcion {
    UNO(1),
    DOS(2),
    TRES(3);

    private final int valor;

    Opcion(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }


}
