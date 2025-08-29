public class NumberOfOddElements {
    public static void main(String[] args) {
        int[] numbers = GivenArray.givenArray;
        int count = 0;
        for (int num : numbers){
            if (num %2 != 0){
                count++;
            }
        }
        System.out.println("Total number of odd elements in givenArray = " + count);
    }
}
