package practices;

import java.util.Arrays;

public class  MyStack {
    //栈容量
    private Integer initCapacity;
    //存放数据的数组
    private int[] arr;
    //元素数量
    private int count;

    public MyStack(){
        this.initCapacity = 8;
        this.arr = new int[8];
        this.count = 0;
    }
    //容量成长系数
    private static final int GROW_FACTOR = 2;

    /**
     * 出栈
     * @return
     */
    public int pop(){
        count --;
        if (count == -1){
            throw new IllegalArgumentException("stack is empty");
        }
        return arr[count];
    }

    /**
     * 入栈
     * @param value
     */
    public void push(int value){
        if (count == initCapacity){
            expandArr();
        }
        arr[count++] = value;
    }

    /**
     * 扩容
     */
    public void expandArr(){
        int newCapacity = initCapacity * GROW_FACTOR;
        arr = Arrays.copyOf(arr,newCapacity);
        initCapacity = newCapacity;
    }

    /**
     * 返回栈顶元素但不出栈
     * @return
     */
    public int peek(){
        if (count == 0){
            throw new IllegalArgumentException("stack is empty");
        }else {
            return arr[count-1];
        }
    }

    /**
     * 返回栈内元素数量
     * @return
     */
    public int size(){
        return count;
    }
}
