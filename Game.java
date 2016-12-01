import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


public class Game {

	static private int letter_id = 0;

	private ArrayList<Letter> listOfLetters = new ArrayList<Letter>();
	private ArrayList<Letter> p1Letters = new ArrayList<Letter>();
	private ArrayList<Letter> p2Letters = new ArrayList<Letter>();

	Random rand;

	public static void main(String[] args) {
		new Game();
	}

	public Game() {
		Board board = new Board();
		rand = new Random();

		createAllLetters();

		System.out.println(listOfLetters.size() + " letters remaining.");

		giveStartingLetters();

		String p1String = "Player 1 has: ";
		String p2String = "Player 2 has: ";

		for (Letter l : p1Letters) {
			p1String += l.getLetter() + " ";
		}

		for (Letter l : p2Letters) {
			p2String += l.getLetter() + " ";
		}


		System.out.println(p1String + "\n\n" + p2String );

		System.out.println(listOfLetters.size() + " letters remaining.");
	}


	private void giveStartingLetters() {
		for (int i = 0; i < 7 ; i++) {
			int size = listOfLetters.size();
			int  n = rand.nextInt(size);

			Letter first = listOfLetters.get(n);
			listOfLetters.remove(n);
			p1Letters.add(first);


			size = listOfLetters.size();
			n = rand.nextInt(size) + 1;

			Letter second = listOfLetters.get(n);
			listOfLetters.remove(n);
			p2Letters.add(second);
		}
	}



	private void createXOfLetterY(int x, char c) {
		for (int i = 0; i < x ; i++) {
			createLetter(c);
		}
	}

	private void createLetter(char c) {
		Letter l = new Letter(c, getScoreForLetter(c), letter_id);
		letter_id++;
		listOfLetters.add(l); 
	}

	private int getScoreForLetter(char c) {
		if(c == 'A' || c == 'D' || c == 'E' || c == 'I' || c == 'N' || c == 'R' || c == 'S' || c == 'T')
			return 1;


		if(c == 'G' || c == 'L' || c == 'O')
			return 2;


		if(c == 'B' || c == 'F' || c == 'K' || c == 'H' || c == 'M' || c == 'V')
			return 3;


		if(c == 'P' || c == 'U' || c == 'Å' || c == 'Ä' || c == 'Ö')
			return 4;


		if(c == 'J' || c == 'Y')
			return 7;


		if(c == 'X' || c == 'X')
			return 8;

		return -1;
	}

	private void createAllLetters() {
		createXOfLetterY(9, 'A');
		createXOfLetterY(2, 'B');
		createXOfLetterY(1, 'C');
		createXOfLetterY(5, 'D');
		createXOfLetterY(8, 'E');
		createXOfLetterY(2, 'F');
		createXOfLetterY(3, 'G');
		createXOfLetterY(2, 'H');
		createXOfLetterY(5, 'I');
		createXOfLetterY(1, 'J');
		createXOfLetterY(3, 'K');
		createXOfLetterY(5, 'L');
		createXOfLetterY(3, 'M');
		createXOfLetterY(6, 'N');
		createXOfLetterY(6, 'O');
		createXOfLetterY(2, 'P');
		createXOfLetterY(8, 'R');
		createXOfLetterY(8, 'S');
		createXOfLetterY(9, 'T');
		createXOfLetterY(3, 'U');
		createXOfLetterY(2, 'V');
		createXOfLetterY(1, 'X');
		createXOfLetterY(1, 'Y');
		createXOfLetterY(1, 'Z');
		createXOfLetterY(2, 'Å');
		createXOfLetterY(2, 'Ä');
		createXOfLetterY(2, 'Ö');
	}


}