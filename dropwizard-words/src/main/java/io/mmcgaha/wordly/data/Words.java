package io.mmcgaha.wordly.data;

import com.google.common.collect.Maps;
import io.mmcgaha.wordly.model.Word;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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
  public String get(int id) {
    return null;
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
