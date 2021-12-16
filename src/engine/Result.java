package engine;

import java.util.List;

public class Result {
	private Doc doc;
	private List<Match> matches;

	public Result(Doc doc, List<Match> matches) {
		super();
		this.doc = doc;
		this.matches = matches;
	}

	public Doc getDoc() {
		return doc;
	}

	public List<Match> getMatches() {
		return matches;
	}

	public int getTotalFrequency() {
		return 0;
	}

	public double getAverageFistIndex() {
		return 0;
	}

	public String htmlHighlight() {
		return null;
	}

	public int compareTo(Result o) {
		return 0;
	}
}
