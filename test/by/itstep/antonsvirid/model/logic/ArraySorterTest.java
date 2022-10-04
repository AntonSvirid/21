package by.itstep.antonsvirid.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySorterTest {
    @Test
    public void testBubbleSortAsc() {

        int[] array = {7, 2, 3, 4, 4};
        int[] expected = {2, 3, 4, 4, 7};

        ArraySorter.bubbleSortAsc(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] != expected[i]) {
                fail();     // вызов ошибки при несовпадении данных
            }               // метод фэил из библ Assert
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

}
