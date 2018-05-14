package com.springframework.services;

import com.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created by Devender on 14/05/2018.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
