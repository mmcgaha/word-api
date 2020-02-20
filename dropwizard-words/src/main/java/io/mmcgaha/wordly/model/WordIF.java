package io.mmcgaha.wordly.model;

import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
public interface WordIF {

    long getWordId();

    List<Word> getDefinitions();

}
