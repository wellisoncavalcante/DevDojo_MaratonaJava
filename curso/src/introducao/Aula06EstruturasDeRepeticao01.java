package introducao;

public class Aula06EstruturasDeRepeticao01 {
    static void main() {
        int count = 0;
        while (count < 10) {
            System.out.println(++count);
        }
        do {
        } while(count < 10);{
                System.out.println("dentro do do-while");
        }
        for(int i=0 ; i<10 ;i++){
            System.out.println(i);
        }
        for(int j=0 ; j<=10; j++){
            System.out.println("2 x " +j+ " = "+j*2);
        }
    }
}
