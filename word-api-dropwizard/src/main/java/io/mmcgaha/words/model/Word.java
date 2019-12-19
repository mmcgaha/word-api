package io.mmcgaha.words.model;

public class Word {
	
	private String wordID;
	private String name;
	private String definition;
	private String tag;
	private String sentence;
	
	/**
	 * @return the wordID
	 */
	public String getWordID() {
		return wordID;
	}
	/**
	 * @param wordID the wordID to set
	 */
	public void setWordID(String wordID) {
		this.wordID = wordID;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the definition
	 */
	public String getDefinition() {
		return definition;
	}
	/**
	 * @param definition the definition to set
	 */
	public void setDefinition(String definition) {
		this.definition = definition;
	}
	/**
	 * @return the tag
	 */
	public String getTag() {
		return tag;
	}
	/**
	 * @param tag the tag to set
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}
	/**
	 * @return the sentence
	 */
	public String getSentence() {
		return sentence;
	}
	/**
	 * @param sentence the sentence to set
	 */
	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	

}
