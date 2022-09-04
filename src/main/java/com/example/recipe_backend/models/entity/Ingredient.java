package com.example.recipe_backend.models.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    @Size(min = 2,max = 10, message = "ingredient type should have at least 2 characters")
    private String type;

    @NotBlank
    @Size(min = 2, max = 20, message = "ingredient name should have at least 2 characters")
    private String name;

    @NotNull(message = "The weight field cannot be empty ")
    @Min(value = 1, message = "The weight cannot be less than 1 gram")
    @Max(value = 300, message = "The weight cannot be more than 500 gram")
    private int weight;

    @NotNull(message = "The calories field cannot be empty ")
    @Min(value = 1, message = "The calories cannot be less than 1")
    @Max(value = 500, message = "The calories cannot be more than 500")
    private int calories;

    @NotNull(message = "The total protein field cannot be empty")
    @Min(value = 0, message = "The total protein cannot be less than 0")
    private double total_protein;

    @NotNull(message = "The carbohydrate field cannot be empty ")
    @Min(value = 0, message = "The carbohydrate cannot be less than 0")
    private double carbohydrate;

    @NotNull(message = "The vitamin_a field cannot be empty ")
    @Min(value = 0, message = "The vitamin_a cannot be less than 0")
    private int vitamin_a;

    @NotNull(message = "The iron field cannot be empty ")
    @Min(value = 0, message = "The iron cannot be less than 0")
    private double iron;

    @NotNull(message = "The zinc field cannot be empty ")
    @Min(value = 0, message = "The zinc cannot be less than 0")
    private double zinc;

    public Ingredient(Ingredient ingredient) {
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
