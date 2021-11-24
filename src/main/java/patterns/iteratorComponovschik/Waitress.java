package main.java.patterns.iteratorComponovschik;

import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        Iterator iterator = allMenus.createIterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try {
                if (menuComponent.isVegetarian()){
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {}
        }
    }


    //    MenuInt pancakeHouseMenu;
//    MenuInt dinerMenu;
//
//    public Waitress(MenuInt pancakeHouseMenu, MenuInt dinerMenu) {
//        this.pancakeHouseMenu = pancakeHouseMenu;
//        this.dinerMenu = dinerMenu;
//    }
//
//    public void printMenu() {
//        Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
//        Iterator dinerMenuIterator = dinerMenu.createIterator();
//        printMenu(pancakeHouseMenuIterator);
//        printMenu(dinerMenuIterator);
//    }
//
//    private void printMenu(Iterator iterator){
//        while (iterator.hasNext()) {
//            MenuItem menuItem = (MenuItem) iterator.next();
//            System.out.println(menuItem.getName() + ", ");
//            System.out.println(menuItem.getPrice() + " -- ");
//            System.out.println(menuItem.getDescription());
//        }
//    }
}
