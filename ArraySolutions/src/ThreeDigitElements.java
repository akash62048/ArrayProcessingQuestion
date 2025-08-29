public class ThreeDigitElements {
    public static void main(String[] args) {
        int[] numbers = GivenArray.givenArray;
        int count = 0;
        for(int num : numbers){
            if (num >= 100 && num <= 999){
                count++;
            }
        }
        System.out.println("Total number of 3 digits elements = " + count);
    }
}
