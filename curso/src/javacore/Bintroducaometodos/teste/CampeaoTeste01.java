package javacore.Bintroducaometodos.teste;

import javacore.Bintroducaometodos.dominio.Campeao;

public class CampeaoTeste01 {
    public static void main(String[] args) {
        Campeao campeao01 = new Campeao();
        Campeao campeao02 = new Campeao();
        Campeao campeao03 = new Campeao();
        Campeao campeao04 = new Campeao();
        Campeao campeao05 = new Campeao();
        //ImpressoraCampeao impressora = new ImpressoraCampeao();

        campeao01.nome = "Aatrox";
        campeao01.rota = "Top lane";
        campeao01.level = 20;
        campeao01.farm = 300;
        campeao01.sexo = 'M';
        campeao01.tier = 'S';

        campeao02.nome = "Viego";
        campeao02.rota = "Jungler";
        campeao02.level = 18;
        campeao02.farm = 262;
        campeao02.sexo = 'M';
        campeao02.tier = 'A';

        campeao03.nome = "Ahri";
        campeao03.rota = "Mid laner";
        campeao03.level = 18;
        campeao03.farm = 290;
        campeao03.sexo = 'F';
        campeao03.tier = 'B';

        campeao04.nome = "Draven";
        campeao04.rota = "Ad carry";
        campeao04.level = 18;
        campeao04.farm = 360;
        campeao04.sexo = 'M';
        campeao04.tier = 'S';

        campeao05.nome = "Leona";
        campeao05.rota = "Suporte";
        campeao05.level = 18;
        campeao05.farm = 40;
        campeao05.sexo = 'F';
        campeao05.tier = 'A';

        /* impressora.imprime(campeao01);
        impressora.imprime(campeao02);
        impressora.imprime(campeao03);
        impressora.imprime(campeao04);
        impressora.imprime(campeao05); */

        campeao01.imprime();
        campeao02.imprime();
        campeao03.imprime();
        campeao04.imprime();
        campeao05.imprime();

    }
}
