package Restaurant_MenuCardBill;

class Breakfast {
    private String[] menu_elements_break = {"Papad", "Salad", "Coffee", "Ice Tea", "Poha"};
    private int[] menu_elements_price_break = {20, 25, 15, 22, 30};

    public String[] getMenu_elements_break() {
        return menu_elements_break;
    }

    public int[] getMenu_elements_price_break() {
        return menu_elements_price_break;
    }

    void breakfast_card() {
        System.out.println("Dishes for Breakfast");
        for (int i = 0; i < menu_elements_break.length; i++) {
            for (int j = i; j <= i; j++) {
                System.out.println(i + 1 + ") " + menu_elements_break[i] + "-->" + menu_elements_price_break[i]);
            }
        }
    }
}