package Chapter9.dinerMerger;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = (Iterator) pancakeHouseMenu.createIterator();
        Iterator dinerIterator = (Iterator) dinerMenu.createIterator();
        System.out.println("MENU\n----\n아침 식사");
        printMenu(pancakeIterator);
        System.out.println("\n점심 식사");
        printMenu(dinerIterator);

    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}

