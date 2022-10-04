package by.itstep.antonsvirid.model.logic;

public class ArraySorter {
    public static void selectedSortAsc(int[] array) {      // алгоритм сортировки выбора на осн

        if (array == null) {
            throw new RuntimeException();
        }

        for (int j = 0; j < array.length -1; j++) {

        int indexMinElement = j;

        for (int i = j + 1; i < array.length; i++) {        // находление экстремальнго значения min
            if (array[indexMinElement] > array[i]) {
                indexMinElement = i;
            }
        }

        int t = array[j];
        array[j] = array[indexMinElement];
        array[indexMinElement] = t;
    }

}

    public static void bubbleSortAsc(int[] array) { // по возрастанию - ASC

 //       int count = 0;          // debug - счётчик дебага, инициализация

        if (array == null) {
            throw new RuntimeException();
        }

        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
    //            count++;                //  debug - счётчик дебага во внутренний цикл
                if (array[i] > array[i + 1]) {
                    int t = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = t;
                }
            }
        }
  //      System.out.println("count = " + count);      //debug - визуализация
    }

    public static void bubbleSortDesc(int[] array) { // по убыванию - Desc
  //      int count = 0;          // debug - счётчик дебага, инициализация

        if (array == null) {
            throw new RuntimeException();
        }

        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
   //             count++;                //  debug - счётчик дебага во внутренний цикл
                if (array[i] < array[i + 1]) {
                    int t = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = t;
                }
            }
        }
  //      System.out.println("count = " + count);      //debug - визуализация
    }


}

