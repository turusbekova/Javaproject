package com.java.homeWork.hwObjects;

public class Restaurant {
    String meal;
    String order;


    public void waitersGreeting(){
        System.out.println("Welcome to our restaurant! \nChoose a kitchen from our menu and then choose a meal:");
    }
    public void menu(){
        System.out.println("We have:\n 1.kyrgyz \n 2.china\n 3.dungan");
        System.out.println("If you want a kyrgyz kitchen, say 1\nIf you want a china kitchen, say 2\nIf you want a dungan kitchen, say 3");
    }

    public void typeOfKitchen(String orderFromUser){
        order = orderFromUser;
        if (order.equals("1")){
            System.out.println("You have chosen a kyrgyz kitchen");
            System.out.println("Our meals from kyrgyz kitchen:\n 1. besh-barmak\n 2. kuurdak\n 3. samsy");
        }

        else if (order.equals("2")){
            System.out.println("You have chosen a china kitchen");
            System.out.println("Our meals from china kitchen:\n 1. Kung Pao Chicken\n 2. Mapo Tofu\n 3. Chow Pein ");
        }
        else if (order.equals("3")){
            System.out.println("You have chosen a dungan kitchen");
            System.out.println("Our meals from dungan kitchen:\n 1. Lagman-Dungan\n 2. Ashlyamfu\n 3. National Dish of Dunngan is shchi");
        }
        else {
            System.err.println("Please choose from our menu!");
        }
    }

    public void waiterAsk(){
        System.out.println("Please can you choose a meal?");
    }

    public void ingredients(String mealFromUser){
        meal = mealFromUser;
        System.out.println("Your order is " + meal);
            if (meal.equals("besh-barmak")) {
                System.out.println("It's our traditional meal");
                System.out.println("The ingredients for this dish: \n Broth\n" +
                        "1,5 kg lamb or mutton\n" +
                        "4 l water\n" +
                        "2 onions\n" +
                        "Dough\n" +
                        "200 ml water\n" +
                           ".......");
            }
              else if (meal.equals("kuurdak")){
                    System.out.println("We have a very delicious kuurdak");
                    System.out.println("The ingredients for this dish: \n" +
                            "500 gr beef\n" +
                            "\n" +
                            "1 big-sized onion\n" +
                            "\n" +
                            "2 medium-sized potatoes\n" +
                            "\n" +
                            "4 cloves garlic");
                }else if (meal.equals("samsy")){
                    System.out.println("Our chef from Osh and he cook the best samsy");
                    System.out.println("The ingredients for this dish: \n 500 g puff pastry\n" +
                            "700 g minced meat, lamb or finely chopped lamb\n" +
                            "4 onion (s)\n" +
                            "150 ml vegetable oil\n" +
                            "1 teaspoon cumin\n" +
                            "salt and pepper");
                }

           else if (meal.equals("Kung Pao Chicken")){
                System.out.println("The ingredients for this dish: \n Chicken:\n" +
                        "28 ounces (800g) boneless/skinless chicken breast cut into 1 inch cubes\n" +
                        "\n" +
                        "1 tablespoon shaoxing wine or dry sherry\n" +
                        "1 tablespoon light soy sauce\n" +
                        "2 teaspoons baking soda\n" +
                        "1 teaspoon cornstarch / corn flour\n" +
                        "Sauce:\n" +
                        "1/2 cup low-sodium chicken stock (or broth) -- water can be used\n" +
                        "5 tablespoons light soy sauce\n" +
                        "2 tablespoons Chinese black vinegar (or substitute good-quality balsamic vinegar)\n" +
                          "...............");
            }
            else if (meal.equals("Mapo Tofu")){
                System.out.println("The ingredients for this dish: \n Ground pork – turkey, chicken, or beef can be used (although it’s not common)\n" +
                        "Soft tofu\n" +
                        "Aromatics: Green onions, ginger, garlic\n" +
                        "Condiments: Doubanjiang (spicy/non-spicy broad bean), miso, mirin, oyster sauce, soy sauce, sesame oil, and potato starch (cornstarch)");
            }
            else if (meal.equals("Chow Pein")){
                System.out.println("The ingredients for this dish: \n 225g dried or fresh egg noodles\n" +
                        "1 tbsp sesame oil, plus 1 tsp\n" +
                        "100g boneless, skinless chicken breasts, cut into fine shreds\n" +
                        "2½ tbsp groundnut oil\n" +
                        "2 garlic cloves, finely chopped\n" +
                       ".................");
            }

           else if (meal.equals("Lagman-Dungan")){
                System.out.println("The ingredients of this dish: \n 2 tablespoons olive oil\n" +
                        "\n 1 onion, finely chopped\n ½ pound beef chuck, cut into strips\n 1 teaspoon ground cumin\n ½ teaspoon ground black pepper\n" +
                        "\n" +
                        "2 tablespoons tomato paste\n" +
                        "\n" +
                        "........");
            }
            else if (meal.equals("Ashlyamfu")){
                System.out.println("Ingredients of this dish: \n For vegetable sauce:\n" +
                        "1 carrot\n" +
                        "2 paprika peppers (red, yellow)\n" +
                        "1 small radish\n" +
                        "Fresh jusai 1 bundle (I have salted), if there is no jusai, regular garlic 3 cloves.\n" +
                        "1 medium tomato\n" +
                        "..............");
            }
            else if (meal.equals("Shchi")){
                System.out.println("The ingredients of this dich: \n 300 gr Stuffing\n" +
                        "150 gr Flour\n" +
                        "Onion\n" +
                        "1 tbsp Starch\n" +
                        "To taste Spices\n" +
                        "Egg\n" +
                     "............");
            }
            System.out.println("Your order is accepted!");
        }

    }










