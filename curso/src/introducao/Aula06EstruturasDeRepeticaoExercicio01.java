package introducao;

public class Aula06EstruturasDeRepeticaoExercicio01 {
    static void main() {
        int count = 0;
        while (count <= 1000000) {
        System.out.println(count);
        count = count + 2;
    }
        for (int i = 0; i <= 1000000; i++){
            if(i % 2 == 0){
            System.out.println(i);
        }
        }
    }
}
