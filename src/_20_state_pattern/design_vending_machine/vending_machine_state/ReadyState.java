package _20_state_pattern.design_vending_machine.vending_machine_state;

import _20_state_pattern.design_vending_machine.product.Coin;
import _20_state_pattern.design_vending_machine.product.Note;
import _20_state_pattern.design_vending_machine.product.Product;
import _20_state_pattern.design_vending_machine.vending_machine.VendingMachine;

public class ReadyState implements VendingMachineState{

    private final VendingMachine vendingMachine;

    public ReadyState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(Product product) {
        System.out.println("Product is already selected. Please make payment");
    }

    @Override
    public void insertCoin(Coin coin) {
        vendingMachine.addCoin(coin);
        System.out.println("Coin inserted: " + coin);
        checkPaymentStatus();
    }

    @Override
    public void insertNote(Note note) {
        vendingMachine.addNote(note);
        System.out.println("Note inserted: " + note);
        checkPaymentStatus();
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please make payment first");
    }

    @Override
    public void returnChange() {
        System.out.println("Please make payment first");
    }

    private void checkPaymentStatus(){
        if(vendingMachine.getTotalPayment() >= vendingMachine.getSelectedProduct().price()){
            vendingMachine.setCurrentState(vendingMachine.getDispenseState());
        }
    }
}
