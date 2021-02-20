import java.util.Scanner;

public class Plate {
    private int amountFood;
    private int addedFood;
    Scanner scan = new Scanner(System.in);

    Plate(int amountFood) {
        this.amountFood = amountFood;
    }

    //voids

    @Override
    public String toString() {
        return "Тарелка: " + amountFood;
    }

    public void decreaseFood(int appetite) {
        if (amountFood >= appetite) {
            amountFood -= appetite;
        }
    }

    public  void increaseFood() {
        amountFood += getAddedFood();
    }
    public void addFood() {

        System.out.println("Введите количество еды, которое хотите добавить: ");
        addedFood = scan.nextInt();
        System.out.println("Увеличить количество еды на " + getAddedFood() + " едениц");
        increaseFood();
    }

    int getAmountFood() {
        return amountFood;
    }

    int getAddedFood() {
        return addedFood;
    }
}