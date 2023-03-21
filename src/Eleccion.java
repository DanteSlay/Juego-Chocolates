abstract class Eleccion {
    //ATRIBUTOS
    protected Opcion opcion;
    protected int numChocolates;

    //CONSTRUCTOR
/*
    public Eleccion(Opcion opcion) {
        this.opcion = opcion;
    }*/

    //GETTER

    public Opcion opcion() {
        return opcion;
    }

    public int opcion(Opcion opcion) {
        return opcion.getValor();
    }

    //SETTER

    public void setOpcion(Opcion opcion) {
        this.opcion = opcion;
    }

    public Opcion setOpcion(int numero) {
        Opcion[] opcion = Opcion.values();
        return opcion[numero - 1];
    }

    public void setNumChocolates(Opcion opcion) {
        this.numChocolates = opcion(opcion);
    }

    public void setNumChocolates(int numChocolates) {
        this.numChocolates = numChocolates;
    }

    //FUNCIONES



}
