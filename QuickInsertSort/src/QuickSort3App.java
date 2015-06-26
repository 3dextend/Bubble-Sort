/**
 * SortsAlgorithm
 * Created by Ryabenkiy Sergey on 26.06.2015 14:31.
 */
public class QuickSort3App {
    public static void main(String[] args)
    {
        int maxSize = 16; // Размер массива
        ArrayIns arr; // Ссылка на массив
        arr = new ArrayIns(maxSize); // Создание массива
        for(int j=0; j<maxSize; j++) // Заполнение массива
        { // случайными числами
            long n = (int)(java.lang.Math.random()*199);
            arr.insert(n);
        }
        arr.display(); // Вывод элементов
        arr.quickSort(); // Быстрая сортировка
        arr.display(); // Повторный вывод
    }
}

