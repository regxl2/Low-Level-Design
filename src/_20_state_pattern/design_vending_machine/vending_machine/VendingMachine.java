package _20_state_pattern.design_vending_machine.vending_machine;

import _20_state_pattern.design_vending_machine.product.Coin;
import _20_state_pattern.design_vending_machine.product.Note;
import _20_state_pattern.design_vending_machine.product.Product;
import _20_state_pattern.design_vending_machine.vending_machine_state.*;

public class VendingMachine {
    private static VendingMachine instance;
    private final Inventory inventory;
    private final IdleState idleState;
    private final ReadyState readyState;
    private final DispenseState dispenseState;
    private final ReturnChangeState returnChangeState;
    private VendingMachineState currentState;
    private Product selectedProduct;
    private double totalPayment;

    private VendingMachine(){
        inventory = new Inventory();
        idleState = new IdleState(this);
        readyState = new ReadyState(this);
        dispenseState = new DispenseState(this);
        returnChangeState = new ReturnChangeState(this);
        currentState = idleState;
        selectedProduct = null;
        totalPayment = 0.0;
    }

    public static VendingMachine getInstance(){
        if(instance==null){
            instance = new VendingMachine();
        }
        return instance;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public Product getSelectedProduct(){
        return selectedProduct;
    }

    public ReadyState getReadyState(){
        return readyState;
    }

    public DispenseState getDispenseState(){
        return dispenseState;
    }

    public ReturnChangeState getReturnChangeState(){
        return returnChangeState;
    }

    public void setCurrentState(VendingMachineState state){
        currentState = state;
    }

    public void reset(){
        selectedProduct = null;
        totalPayment = 0.0;
        currentState = idleState;
    }

    public void setSelectedProduct(Product product){
        selectedProduct = product;
    }

    public void addCoin(Coin coin){
        totalPayment += coin.getValue();
    }

    public void addNote(Note note){
        totalPayment += note.getValue();
    }

    public void selectProduct(Product product){
        currentState.selectProduct(product);
    }

    public void insertCoin(Coin coin){
        currentState.insertCoin(coin);
    }

    public void insertNote(Note note){
        currentState.insertNote(note);
    }

    public void dispenseProduct(){
        currentState.dispenseProduct();
    }

    public void returnChange(){
        currentState.returnChange();
    }
}
