public class SecuenciaDeEscape {
    public static void main(String[] args) {

        String tabulacion = "Esto es una frase para poder\t tabularla";
        String saltoDeLinea = "Esto es un\n saldo de linea";
        String borrarLAnterior = "Esto sirve para borrar\b una letra anterior";

        System.out.println(tabulacion);
        System.out.println(saltoDeLinea);
        System.out.println(borrarLAnterior);


    }
}
