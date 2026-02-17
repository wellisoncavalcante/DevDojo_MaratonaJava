package introducao;

public class Aula06EstruturasDeRepeticaoExercicio03 {
    static void main() {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição valor da parcela >=1000

        double valorCarro = 30000;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000){
                break;
            }
                System.out.println("Parcela "+parcela+ " R$ "+valorParcela);
            }
        }


    }

