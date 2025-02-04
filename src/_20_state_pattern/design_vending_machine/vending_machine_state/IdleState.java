package _20_state_pattern.design_vending_machine.vending_machine_state;

import _20_state_pattern.design_vending_machine.product.Coin;
import _20_state_pattern.design_vending_machine.product.Note;
import _20_state_pattern.design_vending_machine.product.Product;
import _20_state_pattern.design_vending_machine.vending_machine.Inventory;
import _20_state_pattern.design_vending_machine.vending_machine.VendingMachine;

public class IdleState implements VendingMachineState{

    private final VendingMachine vendingMachine;

    public IdleState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(Product product) {
        Inventory inventory = vendingMachine.getInventory();
        if(inventory.isAvailable(product)){
            vendingMachine.setSelectedProduct(product);
            vendingMachine.setCurrentState(vendingMachine.getReadyState());
            System.out.println("Product: " + product.name() + " is selected");
        }
        else{
            System.out.println("Product is unavailable");
        }
    }

    @Override
    public void insertCoin(Coin coin) {
        System.out.println("Please select the product first");
    }

    @Override
    public void insertNote(Note note) {
        System.out.println("Please select the product first");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please select the product first and make payment");
    }

    @Override
    public void returnChange() {
        System.out.println("No change to return");
    }
}
