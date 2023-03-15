package TOYS.Model;

import java.util.LinkedList;
import java.util.List;

import TOYS.Presenter.Presenter;
import TOYS.View.View;

public class Main {
    public static void main(String[] args) {

        ToysCollection toys = new ToysCollection(new LinkedList<>(
                List.of(new Toy(1, "Bear", 8, 10), new Toy(2, "Car", 10, 15), new Toy(3, "Doll", 17, 15),
                        new Toy(4, "Airplane", 15, 25), new Toy(5, "Ball", 6, 35))));

        FileWriteToFile<Toy> fwTxt = new FileWriteToFile<>();

        Model model = new Model(toys, fwTxt);
        View view = new View();
        Presenter presenter = new Presenter(model, view);
        presenter.start();

    }
}
