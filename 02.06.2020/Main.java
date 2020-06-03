import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 43;
        int b = 23;
        System.out.println( getMin(a,b) );
    }

    public static int getMin(int a, int b){
        if (a<b) return a;
        else return b;
    }
}


/*
        int[] arr = {4,5,3,5,3,2,4,5};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(Math.round((float) sum/arr.length));
        int max = (int) (-1.0 / 0.0);
        System.out.println(max);
        for(int i=0; i<arr.length; i++){
            if (arr[i]>max && arr[i]%2!=0) max = arr[i];
        }
        System.out.println(max);

        int index = 0;
        while (index<8){
            System.out.println(arr[index]);
            index++;
        }*/
