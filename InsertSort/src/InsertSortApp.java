/**
 * SortsAlgorithm
 * Created by Ryabenkiy Sergey on 26.06.2015 13:25.
 */
public class InsertSortApp {
    public static void main(String[] args)
    {
        int maxSize = 30; // Размер массива
        ArrayIns arr; // Ссылка на массив
        arr = new ArrayIns(maxSize); // Создание массива
        for(int j=0; j<maxSize; j++) // Заполнение массива
        { // случайными числами
            long n = (long)( java.lang.Math.random()*(maxSize-1) );
            arr.insert(n);
        }
       /* arr.insert(77); // Вставка 10 элементов
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(-2);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);
        arr.insert(-44);*/
        arr.display(); // Вывод элементов
        arr.insertionSort(); // Сортировка методом вставки
        arr.display(); // Повторный вывод
    }
}

