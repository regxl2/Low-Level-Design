package _20_state_pattern.design_vending_machine.vending_machine_state;

import _20_state_pattern.design_vending_machine.product.Coin;
import _20_state_pattern.design_vending_machine.product.Note;
import _20_state_pattern.design_vending_machine.product.Product;
import _20_state_pattern.design_vending_machine.vending_machine.VendingMachine;

public class DispenseState implements VendingMachineState{

    private final VendingMachine vendingMachine;

    public DispenseState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(Product product) {
        System.out.println("Product already selected. Please collect the dispensed product");
    }

    @Override
    public void insertCoin(Coin coin) {
        System.out.println("Payment is already made. Please collect the dispensed product");
    }

    @Override
    public void insertNote(Note note) {
        System.out.println("Payment is already made. Please collect the dispensed product");
    }

    @Override
    public void dispenseProduct() {
        Product product = vendingMachine.getSelectedProduct();
        vendingMachine.getInventory().updateQuantity(product, vendingMachine.getInventory().getQuantity(product) - 1);
        System.out.println("Product is dispensed: " + product.name());
        vendingMachine.setCurrentState(vendingMachine.getReturnChangeState());
    }

    @Override
    public void returnChange() {
        System.out.println("Please collect the dispensed product first");
    }
}
