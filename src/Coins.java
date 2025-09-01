import java.util.Scanner;

public class Coins {


   private String real;
   private String dolar;
   private double cotacaoOrigem;
   private double valorDestino;



   public void obterDados(){

     Scanner scanner = new Scanner(System.in);

     System.out.println("Digite a moeda: ");
     real = scanner.nextLine();

     System.out.println("Digite a moeda de comparacao: ");
     dolar = scanner.nextLine();

     System.out.println("Qual o valor de uma moeda em relação a outra?: ");
     cotacaoOrigem = scanner.nextDouble();

     calcularCotacao();

}

    private void calcularCotacao(){

       valorDestino = 1 / cotacaoOrigem;

       exibirResultados();






}

 private void exibirResultados(){

       System.out.println("========");
       System.out.println("Resultado");
       System.out.println("Moeda de Origem: " + dolar );
       System.out.println("Moeda de destino: " + real );
       System.out.println("Valor da Cotação: " + cotacaoOrigem );
       String valorDestinoComDoisDecimais = String.format("%,2f", valorDestino);
       System.out.println("1 " + dolar + " = " + valorDestinoComDoisDecimais + " " + real);
       System.out.println("========");






}




}
