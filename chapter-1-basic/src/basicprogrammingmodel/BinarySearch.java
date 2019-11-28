package basicprogrammingmodel;
import java.util.Arrays;
public class BinarySearch {
    public static int rank(int key,int[] a){
        //数组必须是有序的
        int low = 0;
        int high = a.length - 1;

        while (low<= high){
            //被查找的键要么不存在，要么必然存在与a[low...high]中
            int mid = low + (high - low)/2;
            if (key<a[mid]){
                high = mid -1;
            }else if (key>a[mid]){
                low = mid + 1;
            }else {
                return a[mid];
            }
        }
        return -1;
    }
}
