package Pract15;

public class ProgresCollection {
    private int size;
    private int[] collectionArray;
    public  ProgresCollection(){
        collectionArray = new int[0];
    }

    public void delete(int ind){
        if (collectionArray.length == 0 || ind >= collectionArray.length || ind < 0)
            return;
        boolean check = false;
        collectionArray[ind] = Integer.MIN_VALUE;
        int[] buffArray = new int[collectionArray.length - 1];
        for (int i = 0; i < collectionArray.length - 1; i++){
            if (collectionArray[i] == Integer.MIN_VALUE)
                check = true;
            if (!check)
                buffArray[i] = collectionArray[i];
            else
                buffArray[i] = collectionArray[i + 1];
        }
        collectionArray = new int[collectionArray.length - 1];
        System.arraycopy(buffArray, 0, collectionArray, 0, collectionArray.length);
        size--;
    }

    public void addElement(int item){
        if (collectionArray.length == 0)
            collectionArray = new int[1];
        else {
            int[] resizeArray = new int[collectionArray.length + 1];
            System.arraycopy(collectionArray, 0, resizeArray, 0, resizeArray.length - 1);
            collectionArray = new int[collectionArray.length + 1];
            System.arraycopy(resizeArray, 0, collectionArray, 0, collectionArray.length);
        }
        collectionArray[collectionArray.length - 1] = item;
        size++;
    }

    public int searchByItem(int item){
        for (int i = 0; i < collectionArray.length; i++)
            if (collectionArray[i] == item){
                return i;}
        return Integer.MIN_VALUE;
    }

    public int maxItem(){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < collectionArray.length; i++)
            if (collectionArray[i] > max)
                max = collectionArray[i];
        return max;
    }

    public double averageNumber(){
        int tmp = 0;
        for (int i = 0; i < collectionArray.length; i++)
            tmp += collectionArray[i];
        return collectionArray.length > 0 ? (double)(tmp / collectionArray.length) : 0;
    }

    public int minItem(){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < collectionArray.length; i++)
            if (collectionArray[i] < min)
                min = collectionArray[i];
        return min;
    }

    public int getSize(){
        return size;
    }

    public int searchByIndex(int ind){
        return (ind < collectionArray.length && ind >= 0) ? collectionArray[ind] : Integer.MIN_VALUE;
    }
}
