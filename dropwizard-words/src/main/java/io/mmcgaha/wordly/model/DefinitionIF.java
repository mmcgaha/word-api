package io.mmcgaha.wordly.model;

import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
public interface DefinitionIF {

    long getDefinitionId();

    String getPartOfSpeech();

    String getDefinition();

    String getSampleSentence();

    List<Word> getSynonyms();

    List<Word> getAntonyms();

}
