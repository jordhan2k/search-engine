package engine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class Word {
	public static Set<String> stopWords;

	private String rawText;

	private Word(String rawText) {
		this.rawText = rawText;
	}

	public static Word createWord(String rawText) {
		return new Word(rawText);
	}

	public boolean isKeyword() {
		return true;
	}

	public String getPrefix() {
		return null;
	}

	public String getSuffix() {
		return null;
	}

	public String getText() {
		return null;
	}

	public static boolean loadStopWords(String fileName) {
		stopWords = new HashSet<String>();
		try {
			File file = new File(fileName);
			FileReader reader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(reader);
			String nextLine;
			while ((nextLine = bufferedReader.readLine()) != null) {
				stopWords.add(nextLine);
			}
			bufferedReader.close();
			reader.close();
			return true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		return false;
	}

	public boolean equals(Object o) {
		return false;
	}

	public String toString() {
		return rawText;
	}
}
