/**
 * SortsAlgorithm
 * Created by Ryabenkiy Sergey on 26.06.2015 13:57.
 */
public class ShellSortApp {
    public static void main(String[] args)
    {
        int maxSize = 20; // Размер массива
        ArraySh arr;
        arr = new ArraySh(maxSize); // Создание массива
        for(int j=0; j<maxSize; j++) // Заполнение массива
        { // случайными числами
            long n = (int)(java.lang.Math.random()*999);
            arr.insert(n);
        }
        arr.display(); // Вывод несортированного массива
        arr.shellSort(); // Сортировка массива по алгоритму Шелла
        arr.display(); // Вывод отсортированного массива
    }
}
