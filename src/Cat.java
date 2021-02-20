public class Cat {
    private final String name;
    private final int appetite;
    private boolean isFull;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }

    //voids

    @Override
    public String toString() {
        return "Кот: " + name + " Аппетит: " + appetite + " Сытость: " + isFull;
    }

    public void eat(Plate plate) {
        if (plate.getAmountFood() > appetite) {
            plate.decreaseFood(appetite);
            isFull = true;
        }
    }
}