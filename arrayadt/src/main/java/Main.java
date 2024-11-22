public class Main {
    public static void main(String[] args) {

        int[] arr = {1,2,9,5,20};
        displayArr(arr);

    }

    static void displayArr (int[] arr) {
        for(int i = 0; i<arr.length; i++) System.out.println(i+1 + ": " + arr[i]);
    }
}
