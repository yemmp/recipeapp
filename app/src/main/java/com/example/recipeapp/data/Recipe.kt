package com.example.recipeapp.data

import com.example.recipeapp.R

data class Recipe(
    val id:Int,
    val title:String,
    val description:String,
    val instructions:String,
    val imgUrl:Int,
    val imgStr:String,
    val ingredients:List<Ingredient>
)

val fakeRecipes = listOf(
    Recipe(
        id = 1,
        title = "Chocolate Cake",
        description = "A delicious and fluffy cake with lots of chocolate!",
        instructions = "Mix the ingredients and bake for 30 minutes.",
        imgUrl = R.drawable.chocolatecake,
        imgStr = "Chocolate Cake",
        ingredients = listOf(
            Ingredient(id = 1, name = "Wheat Flour", imgUrl = R.drawable.flour, imgStr = "Wheat Flour", quantity = "2 cups"),
            Ingredient(id = 2, name = "Cocoa Powder", imgUrl = R.drawable.cocoapowder, imgStr = "Cocoa Powder", quantity = "4 tablespoons"),
            Ingredient(id = 3, name = "Eggs", imgUrl = R.drawable.eggs, imgStr = "Eggs", quantity = "3 units")
        )
    ),
    Recipe(
        id = 2,
        title = "Fruit Salad",
        description = "A refreshing salad with seasonal fruits.",
        instructions = "Cut the fruits and mix them in a bowl.",
        imgUrl = R.drawable.fruitsalad,
        imgStr = "Fruit Salad",
        ingredients = listOf(
            Ingredient(id = 1, name = "Apple", imgUrl = R.drawable.apple, imgStr = "Apple", quantity = "1 unit"),
            Ingredient(id = 2, name = "Banana", imgUrl = R.drawable.banana, imgStr = "Banana", quantity = "2 units"),
            Ingredient(id = 3, name = "Orange", imgUrl = R.drawable.orange, imgStr = "Orange", quantity = "1 unit")
        )
    ),
    Recipe(
        id = 3,
        title = "Margherita Pizza",
        description = "Classic pizza with tomato sauce, cheese, and basil.",
        instructions = "Prepare the dough, add the sauce, and bake for 20 minutes.",
        imgUrl = R.drawable.margherita,
        imgStr = "Margherita Pizza",
        ingredients = listOf(
            Ingredient(id = 1, name = "Wheat Flour", imgUrl = R.drawable.flour, imgStr = "Wheat Flour", quantity = "3 cups"),
            Ingredient(id = 2, name = "Tomato Sauce", imgUrl = R.drawable.tomatosauce, imgStr = "Tomato Sauce", quantity = "1 cup"),
            Ingredient(id = 3, name = "Mozzarella Cheese", imgUrl = R.drawable.mozzarella, imgStr = "Mozzarella Cheese", quantity = "200g")
        )
    ),
    Recipe(
        id = 4,
        title = "Lasagna Bolognese",
        description = "Layers of lasagna pasta with Bolognese sauce and cheese.",
        instructions = "Assemble the lasagna and bake for 40 minutes.",
        imgUrl = R.drawable.lasagna,
        imgStr = "Lasagna Bolognese",
        ingredients = listOf(
            Ingredient(id = 1, name = "Lasagna Sheets", imgUrl = R.drawable.lasagnasheets, imgStr = "Lasagna Sheets", quantity = "1 package"),
            Ingredient(id = 2, name = "Ground Beef", imgUrl = R.drawable.rawmeat, imgStr = "Ground Beef", quantity = "500g"),
            Ingredient(id = 3, name = "Bechamel Sauce", imgUrl = R.drawable.bechamel, imgStr = "Bechamel Sauce", quantity = "2 cups")
        )
    ),
    Recipe(
        id = 5,
        title = "Roast Chicken",
        description = "Seasoned and roasted chicken, golden and crispy.",
        instructions = "Season the chicken and bake for 1 hour.",
        imgUrl = R.drawable.cookedchicken,
        imgStr = "Roast Chicken",
        ingredients = listOf(
            Ingredient(id = 1, name = "Chicken", imgUrl = R.drawable.rawchicken, imgStr = "Chicken", quantity = "1 unit"),
            Ingredient(id = 2, name = "Garlic", imgUrl = R.drawable.garlic, imgStr = "Garlic", quantity = "3 cloves"),
            Ingredient(id = 3, name = "Fine Herbs", imgUrl = R.drawable.oregano, imgStr = "Fine Herbs", quantity = "to taste")
        )
    ),
    Recipe(
        id = 6,
        title = "Vegetable Soup",
        description = "A healthy soup with fresh vegetables.",
        instructions = "Cook the vegetables in seasoned water and blend.",
        imgUrl = R.drawable.soup,
        imgStr = "Vegetable Soup",
        ingredients = listOf(
            Ingredient(id = 1, name = "Carrot", imgUrl = R.drawable.carrots, imgStr = "Carrot", quantity = "2 units"),
            Ingredient(id = 2, name = "Potato", imgUrl = R.drawable.potato, imgStr = "Potato", quantity = "2 units"),
            Ingredient(id = 3, name = "Zucchini", imgUrl = R.drawable.zuchinni, imgStr = "Zucchini", quantity = "1 unit")
        )
    ),
    Recipe(
        id = 7,
        title = "Homemade Burger",
        description = "Juicy burger made with quality meat.",
        instructions = "Shape the patties and fry for 5 minutes on each side.",
        imgUrl = R.drawable.hambuguer,
        imgStr = "Homemade Burger",
        ingredients = listOf(
            Ingredient(id = 1, name = "Ground Beef", imgUrl = R.drawable.rawmeat, imgStr = "Ground Beef", quantity = "500g"),
            Ingredient(id = 2, name = "Burger Bun", imgUrl = R.drawable.hamburguerbread, imgStr = "Burger Bun", quantity = "2 units"),
            Ingredient(id = 3, name = "Cheese", imgUrl = R.drawable.mozzarella, imgStr = "Cheese", quantity = "2 slices")
        )
    ),
    Recipe(
        id = 8,
        title = "Passion Fruit Mousse",
        description = "A light and refreshing passion fruit dessert.",
        instructions = "Blend the ingredients and refrigerate for 2 hours.",
        imgUrl = R.drawable.mousse,
        imgStr = "Passion Fruit Mousse",
        ingredients = listOf(
            Ingredient(id = 1, name = "Passion Fruit Pulp", imgUrl = R.drawable.passionfruit, imgStr = "Passion Fruit Pulp", quantity = "1/2 cup"),
            Ingredient(id = 2, name = "Condensed Milk", imgUrl = R.drawable.leitecondensado, imgStr = "Condensed Milk", quantity = "1 can"),
            Ingredient(id = 3, name = "Heavy Cream", imgUrl = R.drawable.cremedeleite, imgStr = "Heavy Cream", quantity = "1 box")
        )
    ),
    Recipe(
        id = 9,
        title = "Carbonara Pasta",
        description = "Pasta with a creamy cheese and bacon sauce.",
        instructions = "Cook the pasta and prepare the sauce simultaneously.",
        imgUrl = R.drawable.carbonara,
        imgStr = "Carbonara Pasta",
        ingredients = listOf(
            Ingredient(id = 1, name = "Pasta", imgUrl = R.drawable.macarraocru, imgStr = "Pasta", quantity = "250g"),
            Ingredient(id = 2, name = "Bacon", imgUrl = R.drawable.bacon, imgStr = "Bacon", quantity = "100g"),
            Ingredient(id = 3, name = "Parmesan Cheese", imgUrl = R.drawable.mozzarella, imgStr = "Parmesan Cheese", quantity = "50g")
        )
    ),
    Recipe(
        id = 10,
        title = "Chocolate Brownie",
        description = "A chocolate brownie with crunchy chunks.",
        instructions = "Mix the ingredients and bake for 30 minutes.",
        imgUrl = R.drawable.brownie,
        imgStr = "Chocolate Brownie",
        ingredients = listOf(
            Ingredient(id = 1, name = "Dark Chocolate", imgUrl = R.drawable.chocolate, imgStr = "Dark Chocolate", quantity = "200g"),
            Ingredient(id = 2, name = "Sugar", imgUrl = R.drawable.sugar, imgStr = "Sugar", quantity = "1 cup"),
            Ingredient(id = 3, name = "Butter", imgUrl = R.drawable.butter, imgStr = "Butter", quantity = "100g")
        )
    ))