package Restaurant_MenuCardBill;

class Lunch extends Breakfast {
    private String[] menu_elements_lunch = {"Roti", "Daal Tadka", "Rice", "Raita", "Paneer Tikka Masala", "Chilli Paneer", "Cold Drink"};
    private int[] menu_elements_price_lunch = {15, 65, 100, 25, 155, 135, 35};

    public String[] getMenu_elements_lunch() {
        return menu_elements_lunch;
    }

    public int[] getMenu_elements_price_lunch() {
        return menu_elements_price_lunch;
    }

    void lunch_card() {
        System.out.println("Dishes for Lunch");
        for (int i = 0; i < menu_elements_lunch.length; i++) {
            for (int j = i; j <= i; j++) {
                System.out.println(i + 1 + ") " + menu_elements_lunch[i] + "-->" + menu_elements_price_lunch[i]);
            }
        }
    }
}