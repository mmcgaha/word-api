package io.mmcgaha.wordly.model;

import io.mmcgaha.wordly.tools.MMStyle;
import org.immutables.value.Value;

@MMStyle
@Value.Immutable
public interface DefinitionIM {

    long getDefinitionId();

    String getPartOfSpeech();

    String getDefinition();

    String getSampleSentence();

    //List<Word> getSynonyms();

    //List<Word> getAntonyms();

}
