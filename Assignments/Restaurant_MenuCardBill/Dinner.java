package Restaurant_MenuCardBill;

class Dinner extends Lunch {
    private String[] menu_elements_dinner = {"Naan", "Pizza", "Wine", "Roti", "Butter Chiken", "Cold Drink"};
    private int[] menu_elements_price_dinner = {15, 65, 350, 25, 175, 35};

    public String[] getMenu_elements_dinner() {
        return menu_elements_dinner;
    }

    public int[] getMenu_elements_price_dinner() {
        return menu_elements_price_dinner;
    }

    void dinner_card() {
        System.out.println("Dishes for Dinner");
        for (int i = 0; i < menu_elements_dinner.length; i++) {
            for (int j = i; j <= i; j++) {
                System.out.println(i + 1 + ") " + menu_elements_dinner[i] + "-->" + menu_elements_price_dinner[i]);
            }
        }
    }
}