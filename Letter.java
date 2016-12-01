public class Letter {

	public char letter;
	public int value;

	private int id;

	public Letter() {

	}

	public Letter(char l, int v) {
		letter = l;
		value = v;
	}

	public Letter(char l, int v, int id) {
		letter = l;
		value = v;
		this.id = id;
	}

	public void setLetter(char l) {
		letter = l;
	}

	public void setValue(int v) {
		value = v;
	}

	public char getLetter() {
		return letter;
	}

	public int getValue() {
		return value;
	}


}