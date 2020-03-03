package io.mmcgaha.wordly.data;

import io.mmcgaha.wordly.model.Word;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;
import java.util.Optional;

public interface WordsDao extends Dao<Word> {

  @SqlQuery("Select * From Words Where id = :id")
  Optional<Word> get(@Bind("id") long id);

  @SqlQuery("Select * From Words")
  List<Word> getAll();

  @SqlQuery("Select * From Words Where Name = :name")
  Word get(@Bind("name") String name);

  //TODO: fix
  //@SqlQuery("Insert Into Words (name) Values (:word.getName())")
 // Word create(@Bind word);


  Word update(Word word);

  @SqlQuery("Delete From Words Where id = :id")
  boolean delete(long id);
}
