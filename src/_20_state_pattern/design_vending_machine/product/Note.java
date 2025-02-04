package _20_state_pattern.design_vending_machine.product;

public enum Note {
    ONE(1),
    FIVE(5),
    TEN(10),
    TWENTY(20);

    private final int value;

    Note(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
