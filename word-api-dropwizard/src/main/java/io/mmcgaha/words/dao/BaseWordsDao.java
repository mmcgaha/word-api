package io.mmcgaha.words.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import io.mmcgaha.words.model.Word;

public class BaseWordsDao implements WordsDao {
	
	private Set<Word> words;
	
	public BaseWordsDao() {
		words = new HashSet<>();
	}

	@Override
	public Word getWord(String wordID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Word createWord(Word word) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Word updateWord(Word word) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Word> getAllWords() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteWord(String wordID) {
		// TODO Auto-generated method stub
		
	}

}
