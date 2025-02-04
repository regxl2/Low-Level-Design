package _20_state_pattern.design_vending_machine.vending_machine_state;

import _20_state_pattern.design_vending_machine.product.Coin;
import _20_state_pattern.design_vending_machine.product.Note;
import _20_state_pattern.design_vending_machine.product.Product;

public interface VendingMachineState {
    void selectProduct(Product product);
    void insertCoin(Coin coin);
    void insertNote(Note note);
    void dispenseProduct();
    void returnChange();
}
