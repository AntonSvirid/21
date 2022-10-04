package by.itstep.antonsvirid.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySorterTest {
    @Test
    public void testBubbleSortAsc() {

        int[] array = {7, 2, 3, 8, 7, 5};
        int[] expected = {2, 3, 5, 7, 7, 8};

        ArraySorter.bubbleSortAsc(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] != expected[i]) {
                fail();     // вызов ошибки при несовпадении данных
            }               // метод fail из библ Assert
        }
    }

    @Test(expected = RuntimeException.class)        // негативный тест-кейс
    public void testBubbleSortAscWithNull() {       // ожидающий данную ошибку

        ArraySorter.bubbleSortAsc(null);
    }

    @Test
    public void testBubbleSortAscWithEmptyObject() {

        ArraySorter.bubbleSortAsc(new int[0]);
    }

    @Test
    public void bubbleSortDescTest() {

        int[] array = {7, 2, 3, 8, 7, 5};
        int[] expected = {8, 7, 7, 5, 3, 2};

        ArraySorter.bubbleSortDesc(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] != expected[i]) {
                fail();
            }
        }
    }

    @Test(expected = RuntimeException.class)        // негативный тест-кейс
    public void testBubbleSortDescWithNull() {       // ожидающий данную ошибку

        ArraySorter.bubbleSortAsc(null);
    }

    @Test
    public void testBubbleSortDescWithEmptyObject() {

        ArraySorter.bubbleSortAsc(new int[0]);
    }

    @Test
    public void testSelectedSortAsc() {

        int[] array = {7, 2, 3, 8, 7, 5};
        int[] expected = {2, 3, 5, 7, 7, 8};

        ArraySorter.selectedSortAsc(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] != expected[i]) {
                fail();     // вызов ошибки при несовпадении данных
            }               // метод fail из библ Assert
        }
    }

    @Test(expected = RuntimeException.class)        // негативный тест-кейс
    public void testSelectedSortAscWithNull() {       // ожидающий данную ошибку

        ArraySorter.selectedSortAsc(null);
    }

    @Test
    public void testSelectedSortAscWithEmptyObject() {

        ArraySorter.selectedSortAsc(new int[0]);
    }
}
