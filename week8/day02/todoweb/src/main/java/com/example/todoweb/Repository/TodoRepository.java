package com.example.todoweb.Repository;

import com.example.todoweb.Module.Todo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Gabor on 08/05/2017.
 */
public interface TodoRepository extends CrudRepository<Todo, Long>{

}
