import java.util.Arrays;

public class Fis {
	//斐波那契数列的最大长度
    public static int maxSize = 20;

    public static void main(String[] args) {
        int[] arr = {1, 23, 45, 66, 67, 88, 90, 100};
        int index = fisSearch(arr, 88);
        System.out.println("index = " +index);

    }

    //构建斐波那契数列
    public static int[] fis() {
        int[] f = new int[maxSize];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i < f.length; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f;
    }
    /**
     * 斐波那契查找算法实现
     *
     * @param arr 要查找的原始数组
     * @param key 要查找的值
     * @return 查找的结果
     */
    public static int fisSearch(int[] arr, int key) {
        //数组左侧索引
        int low = 0;
        //数组右侧索引
        int high = arr.length - 1;
        //比右侧索引大的第一个斐波那契数对应的索引
        int k = 0;
        //黄金分割点
        int mid = 0;
        //斐波那契数列
        int[] f = fis();
        //由数组最大值计算k
        while (high > f[k] - 1) {
            k++;
        }

        //因为f[k]的值可能大于数组的长度，因此需要给原数组扩容到长度 == f(k)
        int[] tmp = Arrays.copyOf(arr, f[k]);
        //调用copyOf方法后在扩容部分全部补了0，实际上需要补数组的最后一位
        for (int i = high + 1; i < tmp.length; i++) {
            tmp[i] = arr[high];
        }
        //使用while循环来查找需要找的数
        while (low <= high) {
            //先计算黄金分割点
            mid = low + f[k - 1] - 1;
            //判断黄金分割点的元素和要查找的元素的关系
            //如果要查找的值在mid左边，重置high和k
            if (tmp[mid] > key){
                high = mid - 1;
                k--;
                //如果要查找的值在mid右边
            }else if (tmp[mid] < key){
                low = mid + 1;
                k -= 2;
                //否则找到该元素
            }else {
                if (mid <= high){
                    return mid;
                }else {
                    return high;
                }
            }
        }
        //如果循环结束后还没有找到，说明没有
        return -1;
    }

}
