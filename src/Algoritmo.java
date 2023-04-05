public class Algoritmo extends Eleccion{

    //CONSTRUCTOR

    public Algoritmo() {
        this.numChocolates = 0;
    }

    //FUNCIONES
    public void unChocolate() {
        numChocolates = Opcion.UNO.getValor();
    }

    public void dosChocolates() {
        numChocolates = Opcion.DOS.getValor();
    }

    public void tresChocolates() {
        numChocolates = Opcion.TRES.getValor();
    }


}



