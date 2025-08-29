public class SmallestElement {
    public static void main(String[] args) {
        int[] numbers = GivenArray.givenArray;

         int smallestNumber = numbers[0];
         for (int i = 1; i<numbers.length-1; i++){
             if (numbers[i] < smallestNumber){
                 smallestNumber = numbers[i];
             }
         }
        System.out.println("Smallest Element of the givenArray is = "+smallestNumber);

    }
}
