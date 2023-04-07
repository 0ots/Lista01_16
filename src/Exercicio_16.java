import java.util.Scanner;

import java.lang.Math;

public class Exercicio_16 {

    public static void main(String[] args) throws Exception {

        int quantidadelatastintaint;

        double area, quantidadelatastinta, preco;

        Scanner input;

        input = new Scanner(System.in);

        System.out.println("Digite o tamanho da área a ser pintada em metros quadrados: ");

        area = input.nextInt();

        input.close();

        quantidadelatastinta = Math.ceil(area / (3 * 18));

        quantidadelatastintaint = (int) quantidadelatastinta;

        System.out.println("A quantidade de latas de tinta a ser comprada é: " + quantidadelatastintaint);

        preco = quantidadelatastinta * 80;

        System.out.println("O valor total da(s) lata(s) de tinta é: R$ " + preco);

    }

}
