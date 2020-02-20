package io.mmcgaha.wordly.model;

import java.util.List;

import org.immutables.value.Value;

import io.mmcgaha.wordly.tools.MMStyle;

@MMStyle
@Value.Immutable
public interface DefinitionIF {

    long getDefinitionId();

    String getPartOfSpeech();

    String getDefinition();

    String getSampleSentence();

    List<Word> getSynonyms();

    List<Word> getAntonyms();

}
