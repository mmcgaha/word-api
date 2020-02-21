package io.mmcgaha.wordly.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.immutables.value.internal.$guava$.collect.$Maps;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import io.mmcgaha.wordly.model.Word;

public class Words implements WordsDao {

  Map<Long, Word> words;

  public Words() {
    words = Maps.newConcurrentMap();
  }

  @Override
  public Optional<Word> get(long id) {
    return Optional.of(words.get(id));
  }

  @Override
  public List<Word> getAll() {
    return new ArrayList<>(words.values());
  }

  @Override
  public Word get(String name) {
    return null;
  }

  @Override
  public Word create(Word word) {
    return null;
  }

  @Override
  public Word update(Word word) {
    return null;
  }

  @Override
  public boolean delete(long id) {
    return false;
  }
}
