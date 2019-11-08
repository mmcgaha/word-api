package io.mmcgaha.words.dao;

import java.util.List;

import io.mmcgaha.words.model.Word;

public interface WordsDao {

	/**
	 * Retrieves stored word 
	 * 
	 * @param wordID
	 * @return The retrieved word
	 */
	Word getWord(String wordID);
	
	/**
	 * Creates word 
	 * 
	 * @param word
	 * @return created word
	 */
	Word createWord(Word word);
	
	/**
	 * Updates stored word 
	 * 
	 * @param word
	 * @return updated word
	 */
	Word updateWord(Word word);
	
	/**
	 * Retrieves all words 
	 * 
	 * @return list of all words
	 */
	List<Word>getAllWords();

	/**
	 * Deletes word
	 * 
	 * @param wordID
	 */
	void deleteWord(String wordID);
	
}
