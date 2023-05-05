import java.util. Scanner;
public class vetorMedia {


	public static void main(String[] args){


	System.out.println("Você quer calcular a média de quantos números?");
	Scanner num = new Scanner(System.in);
	int n = num.nextInt();
	
	double[] Xn = new double[n];

	for (int i=0; i<n;i++){
	System.out.printf("Informe o número %d:",i+1);
	Xn[i] = num.nextDouble();
	}

	double soma = 0;
	for(double y:Xn){
		soma +=y;
	}

	double	media = soma/n;

	System.out.printf("A média entre os %d números é de %.3f.\n", n, media);
	
	num.close();
}
}



