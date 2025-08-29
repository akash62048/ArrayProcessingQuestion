public class IndexOfFirstFiftyEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = GivenArray.givenArray;

        int count = 0;
        System.out.println("Indexes of first 50 even elements:");
        for (int i = 0; i<numbers.length ; i++){
            if (numbers[i] % 2 == 0){
                count++;
                if (count==51){
                    break;
                }
                System.out.print(i + " ");
            }
        }
    }
}
