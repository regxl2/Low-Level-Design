package _20_state_pattern.design_vending_machine.vending_machine_state;

import _20_state_pattern.design_vending_machine.product.Coin;
import _20_state_pattern.design_vending_machine.product.Note;
import _20_state_pattern.design_vending_machine.product.Product;
import _20_state_pattern.design_vending_machine.vending_machine.VendingMachine;

public class ReturnChangeState implements VendingMachineState{

    private final VendingMachine vendingMachine;

    public ReturnChangeState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(Product product) {
        System.out.println("Product already dispensed. Please collect the change.");
    }

    @Override
    public void insertCoin(Coin coin) {
        System.out.println("Product already dispensed. Please collect the change.");
    }

    @Override
    public void insertNote(Note note) {
        System.out.println("Product already dispensed. Please collect the change.");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Product already dispensed. Please collect the change.");
    }

    @Override
    public void returnChange() {
        double change = vendingMachine.getTotalPayment() - vendingMachine.getSelectedProduct().price();
        if(change > 0){
            System.out.println("Change returned: " + change);
        }
        else{
            System.out.println("No change to return");
        }
        vendingMachine.reset();
    }
}
