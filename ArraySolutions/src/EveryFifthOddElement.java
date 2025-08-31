public class EveryFifthOddElement {
    public static void main(String[] args) {
        int[] numbers = GivenArray.givenArray;

        int count  =0;
        for(int i = 1; i< numbers.length; i++){
            if (numbers[i] % 2 != 0){
                count++;
                if (count==5){
                    System.out.print(numbers[i] + " ");
                    count=0;
                }
            }
        }
        System.out.println();
        int evenElements=0;
        for (int i =0; i<numbers.length; i++){
            if (numbers[i] % 2 ==0){
                evenElements++;
            }
        }
        System.out.println(" All the even elements are : " + evenElements);
    }
}
