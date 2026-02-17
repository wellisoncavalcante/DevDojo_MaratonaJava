package introducao;

public class Aula05EstruturasCondicionaisExercicio {
    static void main() {
        byte dia = 1;
        switch (dia) {
            case 1,7:
                System.out.println("Final de Semana");
                break;
            case 2, 3, 4, 5, 6:
                System.out.println("Dia de Semana");
                break;
            default:
                System.out.println("Dia de semana inválido");
                break;
        }
    }
}
