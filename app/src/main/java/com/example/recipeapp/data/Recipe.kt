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
        title = "Bolo de Chocolate",
        description = "Um bolo delicioso e fofinho, com bastante chocolate!",
        instructions = "Misture os ingredientes e asse por 30 minutos.",
        imgUrl = R.drawable.chocolatecake,
        imgStr = "Bolo de Chocolate",
        ingredients = listOf(
            Ingredient(id = 1, name = "Farinha de Trigo", imgUrl = R.drawable.flour, imgStr = "Farinha de Trigo", quantity = "2 xícaras"),
            Ingredient(id = 2, name = "Chocolate em pó", imgUrl = R.drawable.cocoapowder, imgStr = "Chocolate em pó", quantity = "4 colheres de sopa"),
            Ingredient(id = 3, name = "Ovos", imgUrl = R.drawable.eggs, imgStr = "Ovos", quantity = "3 unidades")
        )
    ),
    Recipe(
        id = 2,
        title = "Salada de Frutas",
        description = "Uma salada refrescante com frutas da estação.",
        instructions = "Corte as frutas e misture em uma tigela.",
        imgUrl = R.drawable.fruitsalad,
        imgStr = "Salada de Frutas",
        ingredients = listOf(
            Ingredient(id = 1, name = "Maçã", imgUrl = R.drawable.apple, imgStr = "Maçã", quantity = "1 unidade"),
            Ingredient(id = 2, name = "Banana", imgUrl = R.drawable.banana, imgStr = "Banana", quantity = "2 unidades"),
            Ingredient(id = 3, name = "Laranja", imgUrl = R.drawable.orange, imgStr = "Laranja", quantity = "1 unidade")
        )
    ),
    Recipe(
        id = 3,
        title = "Pizza Margherita",
        description = "Pizza clássica com molho de tomate, queijo e manjericão.",
        instructions = "Prepare a massa, adicione o molho e asse por 20 minutos.",
        imgUrl = R.drawable.margherita,
        imgStr = "Pizza Margherita",
        ingredients = listOf(
            Ingredient(id = 1, name = "Farinha de Trigo", imgUrl = R.drawable.flour, imgStr = "Farinha de Trigo", quantity = "3 xícaras"),
            Ingredient(id = 2, name = "Molho de Tomate", imgUrl = R.drawable.tomatosauce, imgStr = "Molho de Tomate", quantity = "1 xícara"),
            Ingredient(id = 3, name = "Queijo Mussarela", imgUrl = R.drawable.mozzarella, imgStr = "Queijo Mussarela", quantity = "200g")
        )
    ),
    Recipe(
        id = 4,
        title = "Lasanha à Bolonhesa",
        description = "Camadas de massa de lasanha com molho bolonhesa e queijo.",
        instructions = "Monte a lasanha e asse por 40 minutos.",
        imgUrl = R.drawable.lasagna,
        imgStr = "Lasanha à Bolonhesa",
        ingredients = listOf(
            Ingredient(id = 1, name = "Massa de Lasanha", imgUrl = R.drawable.lasagnasheets, imgStr = "Massa de Lasanha", quantity = "1 pacote"),
            Ingredient(id = 2, name = "Carne Moída", imgUrl = R.drawable.rawmeat, imgStr = "Carne Moída", quantity = "500g"),
            Ingredient(id = 3, name = "Molho Bechamel", imgUrl = R.drawable.bechamel, imgStr = "Molho Bechamel", quantity = "2 xícaras")
        )
    ),
    Recipe(
        id = 5,
        title = "Frango Assado",
        description = "Frango temperado e assado até ficar dourado e crocante.",
        instructions = "Tempere o frango e asse por 1 hora.",
        imgUrl = R.drawable.cookedchicken,
        imgStr = "Frango Assado",
        ingredients = listOf(
            Ingredient(id = 1, name = "Frango", imgUrl = R.drawable.rawchicken, imgStr = "Frango", quantity = "1 unidade"),
            Ingredient(id = 2, name = "Alho", imgUrl = R.drawable.garlic, imgStr = "Alho", quantity = "3 dentes"),
            Ingredient(id = 3, name = "Ervas Finas", imgUrl = R.drawable.oregano, imgStr = "Ervas Finas", quantity = "a gosto")
        )
    ),
    Recipe(
        id = 6,
        title = "Sopa de Legumes",
        description = "Uma sopa saudável com diversos legumes frescos.",
        instructions = "Cozinhe os legumes em água temperada e bata no liquidificador.",
        imgUrl = R.drawable.soup,
        imgStr = "Sopa de Legumes",
        ingredients = listOf(
            Ingredient(id = 1, name = "Cenoura", imgUrl = R.drawable.carrots, imgStr = "Cenoura", quantity = "2 unidades"),
            Ingredient(id = 2, name = "Batata", imgUrl = R.drawable.potato, imgStr = "Batata", quantity = "2 unidades"),
            Ingredient(id = 3, name = "Abobrinha", imgUrl = R.drawable.zuchinni, imgStr = "Abobrinha", quantity = "1 unidade")
        )
    ),
    Recipe(
        id = 7,
        title = "Hambúrguer Caseiro",
        description = "Hambúrguer suculento feito com carne de qualidade.",
        instructions = "Modele os hambúrgueres e frite por 5 minutos de cada lado.",
        imgUrl = R.drawable.hambuguer,
        imgStr = "Hambúrguer Caseiro",
        ingredients = listOf(
            Ingredient(id = 1, name = "Carne Moída", imgUrl = R.drawable.rawmeat, imgStr = "Carne Moída", quantity = "500g"),
            Ingredient(id = 2, name = "Pão de Hambúrguer", imgUrl = R.drawable.hamburguerbread, imgStr = "Pão de Hambúrguer", quantity = "2 unidades"),
            Ingredient(id = 3, name = "Queijo", imgUrl = R.drawable.mozzarella, imgStr = "Queijo", quantity = "2 fatias")
        )
    ),
    Recipe(
        id = 8,
        title = "Mousse de Maracujá",
        description = "Sobremesa leve e refrescante com maracujá.",
        instructions = "Bata os ingredientes no liquidificador e leve à geladeira por 2 horas.",
        imgUrl = R.drawable.mousse,
        imgStr = "Mousse de Maracujá",
        ingredients = listOf(
            Ingredient(id = 1, name = "Polpa de Maracujá", imgUrl = R.drawable.passionfruit, imgStr = "Polpa de Maracujá", quantity = "1/2 xícara"),
            Ingredient(id = 2, name = "Leite Condensado", imgUrl = R.drawable.leitecondensado, imgStr = "Leite Condensado", quantity = "1 lata"),
            Ingredient(id = 3, name = "Creme de Leite", imgUrl = R.drawable.cremedeleite, imgStr = "Creme de Leite", quantity = "1 caixa")
        )
    ),
    Recipe(
        id = 9,
        title = "Macarrão à Carbonara",
        description = "Macarrão com molho cremoso de queijo e bacon.",
        instructions = "Cozinhe o macarrão e prepare o molho enquanto isso.",
        imgUrl = R.drawable.carbonara,
        imgStr = "Macarrão à Carbonara",
        ingredients = listOf(
            Ingredient(id = 1, name = "Macarrão", imgUrl = R.drawable.macarraocru, imgStr = "Macarrão", quantity = "250g"),
            Ingredient(id = 2, name = "Bacon", imgUrl = R.drawable.bacon, imgStr = "Bacon", quantity = "100g"),
            Ingredient(id = 3, name = "Queijo Parmesão", imgUrl = R.drawable.mozzarella, imgStr = "Queijo Parmesão", quantity = "50g")
        )
    ),
    Recipe(
        id = 10,
        title = "Brownie de Chocolate",
        description = "Um brownie de chocolate com pedaços crocantes.",
        instructions = "Misture os ingredientes e asse por 30 minutos.",
        imgUrl = R.drawable.brownie,
        imgStr = "Brownie de Chocolate",
        ingredients = listOf(
            Ingredient(id = 1, name = "Chocolate Meio Amargo", imgUrl = R.drawable.chocolate, imgStr = "Chocolate Meio Amargo", quantity = "200g"),
            Ingredient(id = 2, name = "Açúcar", imgUrl = R.drawable.sugar, imgStr = "Açúcar", quantity = "1 xícara"),
            Ingredient(id = 3, name = "Manteiga", imgUrl = R.drawable.butter, imgStr = "Manteiga", quantity = "100g")
        )
    ))