/*
Реализуйте метод boolean swap(int i, int j, int[] anArray),
меняющий местами элементы по индексам i и j в массиве anArray
 и возвращающий false, если индексы выходят за пределы массива
*/

public class Main {
    boolean swap(int i, int j, int[] anArray){
        if(i <= anArray.length-1 && j <= anArray.length-1 && i >= 0 && j >= 0){
            int temp = anArray[i];
            anArray[i] = anArray[j];
            anArray[j] = temp;
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
