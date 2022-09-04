package com.example.recipe_backend.services;

import com.example.recipe_backend.dao.IngredientDAO;
import com.example.recipe_backend.models.entity.Ingredient;
import com.example.recipe_backend.models.dto.IngredientDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class IngredientService {
    private IngredientDAO ingredientDAO;

    public List<IngredientDTO> getAll() {
        List<Ingredient> ingredients = ingredientDAO.findAll();
        return ingredients.stream().map(IngredientDTO::new).collect(Collectors.toList());
    }

    public IngredientDTO getById(int id) {
        Ingredient ingredient = ingredientDAO.findById(id).orElseThrow();
        return new IngredientDTO(ingredient);
    }

    public Ingredient create(Ingredient ingredient) {
        return new Ingredient(ingredientDAO.save(ingredient));
    }

    public Ingredient update(Ingredient ingredient, int id) {
        ingredient.setId(id);
        return new Ingredient(ingredientDAO.save(ingredient));
    }

    public List<IngredientDTO> delete(int id) {
        ingredientDAO.deleteById(id);
        List<Ingredient> all = ingredientDAO.findAll();
        return all.stream().map(IngredientDTO::new).collect(Collectors.toList());
    }
}
