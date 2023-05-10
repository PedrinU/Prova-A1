import java.util.Scanner;

 public class provaA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o nome do funcionário: ");
           String nome = sc.nextLine();

        System.out.print("Digite o peso do funcionário em kg: ");
           double peso = sc.nextDouble();

        System.out.print("Digite a quantidade de água já ingerida pelo funcionário no dia de hoje em litros: ");
          double qtdAguaIngerida = sc.nextDouble();

           int qtdIdealAgua = (int) ((peso * 35) / 1000);

      
          if ((peso * 35) % 1000 != 0) {
            qtdIdealAgua += 1;
        }
             double qtdAguaDia = qtdIdealAgua - qtdAguaIngerida;
 
          System.out.println("\nNome do funcionário: " + nome);

        System.out.println("Peso do funcionário: " + peso + " kg");

        System.out.println("Quantidade de água ingerida: " + qtdAguaIngerida + " litros");

        System.out.println("Quantidade ideal de água a ingerir: " + qtdIdealAgua + " litros");

        if (qtdAguaDia <= 0) {
            System.out.println("Parabéns, você atingiu a meta de hidratação diária");

        } else {
            System.out.println("Continue focado em se hidratar por hoje, ainda faltam " + qtdAguaDia + " litros! Você consegue!");
        }

        sc.close();
    }
}
