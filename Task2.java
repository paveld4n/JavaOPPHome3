import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task2 {
    private String figure;
    private int area;

    public Task2(String figure, int area) {
        this.figure = figure;
        this.area = area;
    }

    public String getFigure() {
        return figure;
    }

    public int getArea() {
        return area;
    }

    public static void main(String[] args) {
        // Создание списка объектов Person
        List<Task2> figures = new ArrayList<>();
        figures.add(new Task2("Прямоугольника", 48));
        figures.add(new Task2("Параллелограма", 32));
        figures.add(new Task2("Квадрата", 16));

        // Использование Comparator для сортировки по имени в алфавитном порядке
        Comparator<Task2> nameComparator =(p1,p2)->(p1.getFigure().compareTo(p2.getFigure()));


        Collections.sort(figures, nameComparator);

        // Вывод отсортированного списка
        for (Task2 figure : figures) {
            System.out.println("Площадь " + figure.getFigure() + " - " + figure.getArea());
        }
    }
}
