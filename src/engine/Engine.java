package engine;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Engine {

	public int loadDocs(String dirname) {
		File file = new File(dirname);
		String[] fileNames = file.list();
		int count = 0;
		for (String name : fileNames) {
			count += (name.contains(".txt")) ? 1 : 0;
		}
		return count;
	}

	public Doc[] getDocs() {
		return null;
	}

	public List<Result> search(Query q) {
		return new ArrayList<>();
	}

	public String htmlResult(List<Result> results) {
		return null;
	}
}
