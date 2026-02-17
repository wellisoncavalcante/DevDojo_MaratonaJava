package introducao;

public class Aula04EstruturasCondicionais03 {
    static void main() {
        double salario = 6000;
        //(condicao) ? verdadeiro : falso
        String doacao = salario > 5000 ? "Eu vou doar R$500 para o DevDojo" : "Eu ainda não tenho condições de doar para o DevDojo";
        System.out.println(doacao);
    }
}