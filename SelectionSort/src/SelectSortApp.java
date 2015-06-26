/**
 * SortsAlgorithm
 * Created by Ryabenkiy Sergey on 26.06.2015 12:53.
 */
public class SelectSortApp {
    public static void main(String[] args)
    {
        int maxSize = 100; // Размер массива
        ArraySel arr; // Ссылка на массив
        arr = new ArraySel(maxSize); // Создание массива
        arr.insert(77); // Вставка 10 элементов
        arr.insert(99);
        arr.insert(-7);
        arr.insert(55);
        arr.insert(-2);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);
        arr.insert(33);
        arr.insert(-45);
        arr.display(); // Вывод элементов
        arr.selectionSort(); // Сортировка методом выбора
        arr.display(); // Повторный вывод
    }
} // Конец класса SelectSortApp

