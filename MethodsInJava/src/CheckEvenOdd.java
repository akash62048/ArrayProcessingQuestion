public class CheckEvenOdd {
    public boolean isEven(int number){
        boolean response = false;
        response = number % 2 ==0;
        return  response;
    }
    public static void main(String[] args) {
        CheckEvenOdd object = new CheckEvenOdd();
        // call or invok
         boolean result = object.isEven(10);
      if(result){
          System.out.println("The number is Even");
      }
      else {
          System.out.println("The number is Odd");
      }

    }
}
