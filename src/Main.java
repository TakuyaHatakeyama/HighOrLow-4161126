
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
	}
}