package academy.devdojo.maratonajava.introducao;

/*
Prática:

Crie variáveis para os campos descritos abaixo entre <> e
imprima a seguinte mensagem:

Eu <name>, moranndo no endereço <adress>,
confirmo que recebi o salário de <salary>, na data <date>
*/
public class Aula03TiposPrimitivosExercicio {

    public static void main(String[] args) {
        String name = "Talita Lima";
        String adress = "Rua dos Alfeneiros, 04";
        float salary = 2000;
        String date = "28/02/2023";
        String report = "Eu " +name+" morando no endereço " +adress+
                ", confirmo que recebi o salário de R$"+salary+ " na data "+date;
        System.out.println(report);

    }
}
