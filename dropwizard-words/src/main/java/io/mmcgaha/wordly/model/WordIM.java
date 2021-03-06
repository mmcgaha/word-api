package io.mmcgaha.wordly.model;

import java.util.List;

import org.immutables.value.Value;

import io.mmcgaha.wordly.tools.MMStyle;

@MMStyle
@Value.Immutable
public interface WordIM {

    long getWordId();

    List<Definition> getDefinitions();
}
