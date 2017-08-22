package com.cn.algorithm;

public class HeapSort {
    public static void main(String[] args) {  
        int[] array = { 87,45,78,32,17,65,53,9,122 };  

        System.out.println("Before heap:");  
        ArrayUtils.printArray(array);  

        heapSort(array);  

        System.out.println("After heap sort:");  
        ArrayUtils.printArray(array);  
    }  

    public static void heapSort(int[] array) 
    {  
        if (array == null || array.length <= 1) 
        {  
            return;  
        }  

        buildMaxHeap(array);  
        System.out.println("---------------------------");
        for (int i = array.length - 1; i >= 1; i--) 
        {  
            ArrayUtils.exchangeElements(array, 0, i);  
            maxHeap(array, i, 0);  
        }  
    }  

    private static void buildMaxHeap(int[] array) 
    {  
        if (array == null || array.length <= 1) 
        {  
            return;  
        }  

        int half = array.length / 2;  
        for (int i = half; i >= 0; i--) 
        {  
            maxHeap(array, array.length, i);
        }  
    }  

    private static void maxHeap(int[] array, int heapSize, int index) 
    {  
    	System.out.println("index-->"+index);
    	//index = index-1;
        int left = index * 2 + 1;  
        int right = index * 2 + 2;  
        System.out.println("left:"+left+";right:"+right);
        System.out.println(left < heapSize && array[left] > array[index]);
        //System.out.println(right < heapSize && array[right] > array[largest]);
        int largest = index;  
        if (left < heapSize && array[left] > array[index]) 
        {
        	System.out.println("Left===>left:"+array[left]+" :index:"+array[index]);
            largest = left;  
        }

        if (right < heapSize && array[right] > array[largest]) 
        {
        	System.out.println("Right===>right:"+array[right]+" :largest:"+array[largest]);
            largest = right; 
        }

        if (index != largest) 
        {
            ArrayUtils.exchangeElements(array, index, largest);  

            maxHeap(array, heapSize, largest);  
        }
    } 
    
    public static class ArrayUtils {  
        
        public static void printArray(int[] array) 
        {  
            System.out.print("{");  
            for (int i = 0; i < array.length; i++) 
            {  
                System.out.print(array[i]);  
                if (i < array.length - 1) 
                {  
                    System.out.print(", ");  
                }  
            }  
            System.out.println("}");  
        }  
  
        public static void exchangeElements(int[] array, int index1, int index2) 
        {  
            int temp = array[index1];  
            array[index1] = array[index2];  
            array[index2] = temp;  
        }  
    }
}
