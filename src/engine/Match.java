package engine;

public class Match {
	private Doc doc;
	private Word word;
	private int freq;
	private int firstIndex;

	public Match(Doc d, Word w, int freq, int firstIndex) {
		this.doc = d;
		this.word = w;
		this.freq = freq;
		this.firstIndex = firstIndex;
	}

	public int compareTo(Result o) {
		return 0;
	}

	public Word getWord() {
		return word;
	}

	public int getFirstIndex() {
		return firstIndex;
	}

	public int getFreq() {
		return freq;
	}
}
