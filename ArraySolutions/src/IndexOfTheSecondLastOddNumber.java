public class IndexOfTheSecondLastOddNumber {
    public static void main(String[] args) {
         int[] numbers = GivenArray.givenArray;

         int count = 0;
         for (int i = numbers.length-1; i>=0; i--){
             if (numbers[i] % 2 != 0){
                 count++;
                 if (count ==2 ) {
                     System.out.println("Index of second last odd element = " + i);
                     break;
                 }
             }
         }
    }
}
