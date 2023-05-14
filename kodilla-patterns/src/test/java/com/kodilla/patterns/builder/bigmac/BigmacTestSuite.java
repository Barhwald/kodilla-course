package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        //Given
        Bigmac myBigmac = new Bigmac.BigmacBuilder()
                .bun("wheat")
                .burgers(2)
                .ingredient(Ingredient.BACON)
                .ingredient(Ingredient.PICKLE)
                .ingredient(Ingredient.LETTUCE)
                .ingredient(Ingredient.CHILLI_PEPPER)
                .ingredient(Ingredient.CHEESE)
                .sauce(Sauce.BARBECUE)
                .build();
        System.out.println(myBigmac);

        //When
        String whatSauce = myBigmac.getSauce().name().toLowerCase();
        int meatChopsNum = myBigmac.getBurgers();
        int ingredientsNum = myBigmac.getIngredients().size();

        //Then
        assertEquals("barbecue", whatSauce);
        assertEquals(2, meatChopsNum);
        assertEquals(5, ingredientsNum);
    }

}
