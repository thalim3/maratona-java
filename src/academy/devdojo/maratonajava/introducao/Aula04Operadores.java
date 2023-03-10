package academy.devdojo.maratonajava.introducao;
public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        // resto = $
        int resto = 20 % 2;
        System.out.println(resto);

        /* operadores lógicos:
        < > <= >= == != -> sempre vão retornar valores booleanos
        */
        boolean isTenBiggerThanTwenty = 10 > 20;
        boolean isTenLessThanTwenty = 10 < 20;
        boolean isTenEqualToTwenty = 10 == 20;
        boolean isTenEqualToTen = 10 == 10;
        boolean isTenDifferentThanTen = 10 != 10;

        System.out.println("isTenBiggerThanTwenty? "+isTenBiggerThanTwenty);
        System.out.println("isTenLessThanTwenty? "+isTenLessThanTwenty);
        System.out.println("isTenEqualToTwenty? "+isTenEqualToTwenty);
        System.out.println("isTenEqualToTen? "+isTenEqualToTen);
        System.out.println("isTenDifferentThanTen? "+isTenDifferentThanTen);

        // && (and) || (or) ! (different)
        int age = 29;
        float salary = 3500F;
        boolean isInsideTheLawAbove30 = age >= 30 && salary >= 4612;
        boolean isInsideTheLawLessThan30 = age < 30 && salary >= 3381;

        System.out.println("isInsideTheLawAbove30? " +isInsideTheLawAbove30);
        System.out.println("isInsideTheLawLessThan30? " +isInsideTheLawLessThan30);
    }
}
