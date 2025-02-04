package _20_state_pattern.design_vending_machine;

import _20_state_pattern.design_vending_machine.product.Coin;
import _20_state_pattern.design_vending_machine.product.Note;
import _20_state_pattern.design_vending_machine.product.Product;
import _20_state_pattern.design_vending_machine.vending_machine.Inventory;
import _20_state_pattern.design_vending_machine.vending_machine.VendingMachine;

public class Demo {
    public static void main(String[] args) {
        VendingMachine vendingMachine = VendingMachine.getInstance();

        Product coke = new Product("Coke", 1.5);
        Product pepsi = new Product("Pepsi", 1.5);
        Product water = new Product("Water", 1.0);

        Inventory inventory = vendingMachine.getInventory();
        inventory.addProduct(coke, 1);
        inventory.addProduct(pepsi, 1);
        inventory.addProduct(water, 1);

        vendingMachine.selectProduct(coke);

        vendingMachine.insertCoin(Coin.QUARTER);
        vendingMachine.insertCoin(Coin.QUARTER);
        vendingMachine.insertCoin(Coin.QUARTER);
        vendingMachine.insertCoin(Coin.QUARTER);

        vendingMachine.insertNote(Note.FIVE);

        vendingMachine.dispenseProduct();

        vendingMachine.returnChange();

        vendingMachine.selectProduct(pepsi);
        vendingMachine.insertCoin(Coin.DIME);
        vendingMachine.insertCoin(Coin.DIME);
        vendingMachine.insertCoin(Coin.DIME);
        vendingMachine.insertCoin(Coin.DIME);
        vendingMachine.insertCoin(Coin.DIME);
        vendingMachine.insertCoin(Coin.QUARTER);
        vendingMachine.insertCoin(Coin.QUARTER);
        vendingMachine.insertCoin(Coin.QUARTER);
        vendingMachine.insertCoin(Coin.QUARTER);

        vendingMachine.dispenseProduct();
        vendingMachine.returnChange();
    }
}
