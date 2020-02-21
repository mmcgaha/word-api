package io.mmcgaha.wordly.data;

import java.util.List;
import java.util.Optional;

public interface Dao<E> {

  Optional<E> get(long id);

  List<E> getAll();

  E create(E e);

  E update(E e);

  boolean delete(long id);
}
