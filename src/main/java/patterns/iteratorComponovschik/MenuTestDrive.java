package main.java.patterns.iteratorComponovschik;

public class MenuTestDrive {

    public static void main(String[] args) {

        MenuComponent pancakeHouseMenu = new Menu("Pancake house menu", "BREAKFAST");
        MenuComponent dinerMenu = new Menu("DINER MENU", "LUNCH");
        MenuComponent cafeMEnu = new Menu("CAFE MENU", "DINNER");
        MenuComponent dessertMenu = new Menu("DESERT MENU", "DESSERT");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMEnu);

        dinerMenu.add(new MenuItem("PAsta", "Spagetti with sause", true, 3.89));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple pie", "Apple pie", true, 1.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printVegetarianMenu();


//        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
//        DinerMenu dinerMenu = new DinerMenu();
//
//        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
//
//        waitress.printMenu();
    }

}
