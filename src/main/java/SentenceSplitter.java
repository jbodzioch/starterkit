
import java.util.List;

import com.google.common.base.Splitter;

public class SentenceSplitter {
	private String sentence = null;
	public SentenceSplitter(String sentence) {
		this.sentence = sentence;
	}
	
	public List<String> splitWordsFromSentence() {
		List<String> wordsList = Splitter.on(" ").splitToList(sentence);
		return wordsList;
	}
}

