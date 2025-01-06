package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        double valor_carro = 30000;

        for(int parcela = 1; parcela <= valor_carro; parcela++){
            double valor_parcela = valor_carro / parcela;
            if(valor_parcela >= 100){
                System.out.println("Parcela "+ parcela + " R$ " + valor_parcela);
            }
            System.out.println("Fora do if");
        }

    }
}
