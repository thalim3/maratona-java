package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        int idade = (int) 10000000000L; /* cast */
        long numeroGrande = 100000;
        double salarioDouble = 2000.0; /* decimal com mais bytes */
        float salarioFloat = 2500.0F; /* decimal com menos bytes*/
        byte idadeByte = 10;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 87;

        System.out.println("A idade é " +idade+" anos.");
        System.out.println(falso);
        System.out.println("char " +caractere);
    }
}
