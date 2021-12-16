package engine;

import java.util.List;

public class Query {
	private String searchPhrase;
	
    public Query(String searchPhrase) {
    	this.searchPhrase = searchPhrase;
    }
    public List<Word> getKeywords() {
        return null;
    }
    public List<Match> matchAgainst(Doc doc) {
        return null;
    }
}
