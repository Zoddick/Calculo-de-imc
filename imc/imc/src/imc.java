import java.util.Scanner;

public class imc {

    public static void main(String[] args) {
        String nome;
        float peso, altura, imc;

        Calculo c1 = new Calculo();
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite seu nome:  ");
        nome = leia.nextLine();
        System.out.println("Digite sua altura: ");
        altura = leia.nextFloat();
        System.out.println("Digite seu peso: ");
        peso = leia.nextFloat();
        imc = c1.calcular(altura, peso);
        System.out.println(" Seu valor do seu imc é: "+ imc);

        if (imc <= 18.5) {
            System.out.println("Magreza");

        } else if (imc > 18.5 && imc <= 24.9) {

            System.out.println("Normal");
        } else if ( imc == 25) {
            System.out.println("Sobrepeso");

        } else if ( imc > 25 && imc <= 29.9 ) {
            System.out.println("pré Obeso");

        } else if ( imc  >= 30 && imc <= 34.9) {
            System.out.println("Obeso 1");

        } else if ( imc >= 35 && imc <= 39.9) {
            System.out.println("Obeso 2");
        } else {

            System.out.println("Obeso 3");
        }


    }
}


