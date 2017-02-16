import java.util.Arrays;

/**
 * 算法学习笔记1
 * 插入排序
 */

public class Main {

    public static void main(String[] args) {
        int[] array={5,4,3,2,1};
        insertSort(array);
        System.out.println(Arrays.toString(array));//输出结果为[1, 2, 3, 4, 5]
    }

    public static void insertSort(int[] array) {
        for (int j = 1; j < array.length; j++) {
            //从第二位开始遍历数组
            int key = array[j];
            int i = j - 1;
            //遍历数组下标j之前的数据，如果大于当前值，则后移一位
            while (i >= 0 && array[i] > key) {
                array[i + 1] = array[i];
                i--;
            }
            //直至遍历到最前一位，或者当前值小于遍历值，将当前值插入当前位置的后一个位置
            array[i+1]=key;
        }
    }
}
