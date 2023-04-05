public class Usuario extends Eleccion {

    //CONSTRUCTOR

    public Usuario() {
        this.numChocolates = 0;
    }


    //FUNCIONES


    public void pedirEleccion(int espacios) {

        while (true) {
            if (espacios > Opcion.DOS.getValor()) {
                System.out.println("Cuantos chocolates quieres?\n" +
                        Opcion.UNO.getValor() + ", " + Opcion.DOS.getValor() + " o " + Opcion.TRES.getValor());
                int eleccion = eleccion();

                if ( !(eleccion == Opcion.UNO.getValor() || eleccion == Opcion.DOS.getValor() || eleccion == Opcion.TRES.getValor())) {
                    System.out.println("Tiene que ser " +
                            Opcion.UNO.getValor() + ", " + Opcion.DOS.getValor() + " o " + Opcion.TRES.getValor());
                }else {
                    opcion = setOpcion(eleccion);
                    break;
                }

            } else if (espacios == Opcion.DOS.getValor()) {
                System.out.println("Cuantos chocolates quieres?\n" +
                        Opcion.UNO.getValor() + " o " + Opcion.DOS.getValor());
                int eleccion = eleccion();

                if (!(eleccion == Opcion.UNO.getValor() || eleccion == Opcion.DOS.getValor())) {
                    System.out.println("Tiene que ser "+
                            Opcion.UNO.getValor() + " o " + Opcion.DOS.getValor());
                } else {
                    opcion = setOpcion(eleccion);
                    break;
                }
            } else {
                System.out.println("Cuantos chocolates quieres?\n" + Opcion.UNO.getValor());
                int eleccion = eleccion();

                if (!(eleccion == Opcion.UNO.getValor())) {
                    System.out.println("Tiene que ser " + Opcion.UNO.getValor());
                } else {
                    opcion = setOpcion(eleccion);
                    break;
                }
            }
        }
    }

    private static int eleccion() {
        int eleccion = Utilidades.in.nextInt();
        Utilidades.in.nextLine();

        return eleccion;
    }


    public void comerChocolates() {
        switch (opcion) {
            case UNO -> numChocolates = 1;
            case DOS -> numChocolates = 2;
            case TRES -> numChocolates = 3;
        }
    }






}
