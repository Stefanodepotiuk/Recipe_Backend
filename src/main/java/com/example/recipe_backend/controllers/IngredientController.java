package com.example.recipe_backend.controllers;

import com.example.recipe_backend.models.dto.IngredientDTO;
import com.example.recipe_backend.models.entity.Ingredient;
import com.example.recipe_backend.services.IngredientService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/ingredients")
@AllArgsConstructor
public class IngredientController {
    private IngredientService ingredientService;

    @GetMapping
    public ResponseEntity<List<IngredientDTO>> findAllIngredients() {
        return new ResponseEntity<>(ingredientService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<IngredientDTO> findByIngredient(@PathVariable int id) {
        return new ResponseEntity<>(ingredientService.getById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Ingredient> createIngredient(@RequestBody @Valid Ingredient ingredient) {
        return new ResponseEntity<>(ingredientService.create(ingredient), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ingredient> updateIngredient(@PathVariable int id, @RequestBody @Valid Ingredient ingredient) {
        return new ResponseEntity<>(ingredientService.update(ingredient, id), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<IngredientDTO>> deleteIngredient(@PathVariable int id) {
        return new ResponseEntity<>(ingredientService.delete(id), HttpStatus.OK);
    }
}
