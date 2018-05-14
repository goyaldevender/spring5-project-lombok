package com.springframework.repositories;

import com.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Devender on 14/05/2018.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
