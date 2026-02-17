package introducao;

public class Aula04EstruturasCondicionaisExercicio {
    static void main() {

        double salario = 70000;
        String imposto;

        if (salario <= 34712) {
            imposto = "Você irá pagar 9,7% de imposto, o total a ser pago é "+(salario*0.097);
        } else if (salario > 34712 && salario <= 68507) {
            imposto = "Você irá pagar 37,35% de imposto, o total a ser pago é "+(salario*0.3735);
        } else{
            imposto = "Você irá pagar 49,5% de imposto, o total a ser pago é "+(salario*0.495);
        }
        System.out.println(imposto);
    }
}