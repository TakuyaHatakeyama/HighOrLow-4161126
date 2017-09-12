import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		String card[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "joker" };

		System.out.println("High or Low ゲームを始めます");
		System.out.println("\nカードの強さは下記の通りです");


		for(int i = 0; i < 8; i++) {
			System.out.print(card[i]);
			if(i != 8 - 1) {
				System.out.print(" < ");
				}
		}
		System.out.println();
		for(int i = 7; i < card.length; i++) {
			System.out.print(card[i]);
			if(i != card.length - 1) {
				System.out.print(" < ");
				}
		}
		System.out.println();


		Random rnd = new Random();
		int num1 = rnd.nextInt(14);
		System.out.println("\n1枚目のカードは「 " + card[num1] + " 」です。");

		System.out.println("\n2枚目のカードは High or Low ?");
		System.out.println("※Highの場合は 1 、Lowの場合は 2 を入力してください");

		Scanner sc = new Scanner(System.in);
		int ans = sc.nextInt();

		int num2;
		do{
			num2 = rnd.nextInt(14);
		}while(num1 == num2);
		System.out.println("\n2枚目のカードは「 " + card[num2] + " 」でした。");

		if(ans == 1 && num1 > num2) {
			System.out.println("You lose ...");
		}
		if(ans == 1 && num1 < num2) {
			System.out.println("You win !");
		}
		if(ans == 2 && num1 > num2) {
			System.out.println("You win !");
		}
		if(ans == 2 && num1 < num2) {
			System.out.println("You lose ...");
		}
	}
}