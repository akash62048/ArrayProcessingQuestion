public class IndexOfLastEvenNumber {
    public static void main(String[] args) {
        int[] numbers = GivenArray.givenArray;


        for (int i = numbers.length-1; i >= 0 ; i--) {
            if (numbers[i] % 2 == 0){
                System.out.println(" Index of the last even number = " +i);
                break;
            }
        }
    }
}
