package introducao;

public class Aula05EstruturasCondicionais {
    static void main() {
         byte dia = 10;
         switch (dia) {
             case 0:
                 System.out.println("Domingo");
                 break;
             case 1:
                 System.out.println("Segunda");
                 break;
             case 2:
                 System.out.println("Terça");
                 break;
             case 3:
                 System.out.println("Quarta");
                 break;
             case 4:
                 System.out.println("Quinta");
                 break;
             case 5:
                 System.out.println("Sexta");
                 break;
             case 6:
                 System.out.println("Sábado");
                 break;
             default:
                 System.out.println("Dia inválido");
                 break;
         }
         char sexo = 'M';
        switch (sexo) {
            case 'C':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Sexo inválida");
                break;
        }
    }
}
