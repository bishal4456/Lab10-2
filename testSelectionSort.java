import static org.junit.Assert.*;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {

		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
    }

    public void testMixed(){
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = 0;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -9;
        Sortedarr[1] = -8;
        Sortedarr[2] = 0;
        Sortedarr[3] = 2;
        Sortedarr[4] = 10;

        SelectionSort ss = new SelectionSort();
        int [] a = ss.basicSelectionSort(arr);
        assertArrayEquals(Sortedarr, a);

    }

    public void testDuplicates(){
    	int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 1;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 0;
        Sortedarr[1] = 1;
        Sortedarr[2] = 1;
        Sortedarr[3] = 2;
        Sortedarr[4] = 2;

        SelectionSort ss = new SelectionSort();
        int [] a = ss.basicSelectionSort(arr);
        assertArrayEquals(Sortedarr, a);
    }


}
