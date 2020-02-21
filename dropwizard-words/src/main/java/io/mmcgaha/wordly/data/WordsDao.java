package io.mmcgaha.wordly.data;

import java.util.List;
import java.util.Optional;

import io.mmcgaha.wordly.model.Word;

public interface WordsDao extends Dao<Word> {

  Optional<Word> get(long id);

  List<Word> getAll();

  Word get(String name);

  Word create(Word word);

  Word update(Word word);

  boolean delete(long id);
}
