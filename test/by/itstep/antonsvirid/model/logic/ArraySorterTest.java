package by.itstep.antonsvirid.model.logic;

import org.junit.*;

import static org.junit.Assert.*;

public class ArraySorterTest {

    private int[] array;     // создание переменной как (финал) бефоКласс - static
                             // для просто бефо - без статик
//    @BeforeClass        // глобальная настройка
//    public static void initGlobal(){
//        array = new int[]{7, 2, 3, 8, 7, 5};
//}
//    @AfterClass
//    public static void destroyGlobal(){
//        array = null;
//    }

    @Before             // может быть сколько угодно таких методов для чего-либо одного
    public void init() {
        array = new int[]{7, 2, 3, 8, 7, 5};
    }

    @After          // локальная настройка - обнуление изменений после каждого тест-кейса
    public void destroy() {
        array = null;
    }

    @Test
    public void testBubbleSortAsc() {

        int[] expected = {2, 3, 5, 7, 7, 8};

        ArraySorter.bubbleSortAsc(array);


//        for (int i = 0; i < array.length; i++) {
//            if (array[i] != expected[i]) {
//                fail();     // вызов ошибки при несовпадении данных
//            }               // метод fail из библ Assert
//        }
        // замена кода выше:
        assertArrayEquals(expected, array); //  готоый метод сравнения массива
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
