package com.greenfox.todoweb2.Repository;

import com.greenfox.todoweb2.Module.Todo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface TodoRepository extends CrudRepository<Todo, Long>{

  List<Todo> findAllByIsDone(boolean whatever);

}
