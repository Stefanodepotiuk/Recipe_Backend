package com.example.recipe_backend.dao;

import com.example.recipe_backend.models.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientDAO extends JpaRepository<Ingredient, Integer> {

}
