//Домашка 1.6 Массивы ч.2
import java.util.Arrays;

public class Main{
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;}

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum=0;
        //Задача 1
        for (int element: arr) {
            sum += element;}
        System.out.println("Сумма трат за месяц составила "+sum+" рублей.");

        //Задача 2
        Arrays.sort(arr); //Сортировка массива
        //System.out.println(Arrays.toString(arr)); //Печать массива
        System.out.print("Минимальная сумма трат за день составила "+ arr[0] +" рублей.");
        System.out.println("Максимальная сумма трат за день составила "+ arr[(arr.length-1)] + " рублей");

        //Задача 3
        int arrSize = arr.length;
        double sumD = (double) sum*1.0;
        double avgTrata =sumD / arrSize;
        System.out.println("Средняя сумма трат за месяц составила "+avgTrata+" рублей.");

        //Задача 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int arrSize2 = reverseFullName.length;
        for (int i=(arrSize2-1); i>=0; i--){
            System.out.print(reverseFullName[i]);}
    }
}