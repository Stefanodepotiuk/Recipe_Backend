package com.example.recipe_backend.models.dto;

import com.example.recipe_backend.models.entity.Ingredient;
import lombok.Data;

@Data
public class IngredientDTO {
    private int id;
    private String type;
    private String name;
    private int weight;
    private int calories;
    private double total_protein;
    private double carbohydrate;
    private int vitamin_a;
    private double iron;
    private double zinc;

    public IngredientDTO(Ingredient ingredient) {
        this.id = ingredient.getId();
        this.type = ingredient.getType();
        this.name = ingredient.getName();
        this.weight = ingredient.getWeight();
        this.calories = ingredient.getCalories();
        this.total_protein = ingredient.getTotal_protein();
        this.carbohydrate = ingredient.getCarbohydrate();
        this.vitamin_a = ingredient.getVitamin_a();
        this.iron = ingredient.getIron();
        this.zinc = ingredient.getZinc();

    }
}
