import java.util.Scanner;

public class media1 {

	public static void main (String[] args) {
		double x,y,z, media; 
		
		System.out.println("Vamos calcular a média entre 3 números. Digite o primeiro número:");
		Scanner n1 = new Scanner(System.in);
		
		
		System.out.println("Digite o segundo número:");
		Scanner n2 = new Scanner(System.in);
		
		
		System.out.println("Digite o terceiro número:");
		Scanner n3 = new Scanner(System.in);
		
		
		x= n1.nextDouble();
		y= n2.nextDouble();
		z= n3.nextDouble();
		
		media=(x+y+z)/3; 
		
		System.out.print("A média entre os três números é: " +media);
		n1.close();
		n2.close();
		n3.close();
	}
	
	}

