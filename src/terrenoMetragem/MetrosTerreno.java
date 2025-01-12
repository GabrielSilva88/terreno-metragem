/*
  	Faça um programa que leia a largura e o comprimento de um terreno retangular, calculando e mostrando a sua área em m². 
  	O programa também deve mostrar a classificação desse terreno, de acordo com a lista abaixo: 
	
	Abaixo de 100m² = TERRENO POPULAR 
	Entre 100m² e 500m² = TERRENO MASTER 
	Acima de 500m² = TERRENO VIP

*/
package terrenoMetragem;

import java.util.Scanner;

public class MetrosTerreno {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double largura, comprimento, area;

		System.out.println("Digite a largura: ");
		largura = scan.nextDouble();

		System.out.println("Digite o comprimento: ");
		comprimento = scan.nextDouble();

		area = largura * comprimento;

		if (area < 100) {
			System.out.println(" TERRENO POPULAR ");
		} else if (area >= 100 && area <= 500) {
			System.out.println("TERRENO MASTER");
		} else {
			System.out.println(area + " do *TERRENO VIP*");
		}

	}
	

}
