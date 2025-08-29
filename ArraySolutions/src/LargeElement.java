public class LargeElement {
    public static void main(String[] args) {
                int[] numbers = GivenArray.givenArray;

                int largestNumber = numbers[0];
                for (int i = 1; i<numbers.length-1; i++){
                    if (numbers[i] > largestNumber){
                        largestNumber = numbers[i];
                    }
                }
                System.out.println("Largest Element of the givenArray is = "+ largestNumber);

            }
        }