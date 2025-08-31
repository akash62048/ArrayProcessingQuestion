public class DivisibleNine {
    public boolean isDivisible(int number){
        boolean response = false;
        response = number % 9 == 0;
        return response;
    }
    public static void main(String[] args){
        DivisibleNine obj =  new DivisibleNine();
        boolean result = obj.isDivisible(18);

        if (result){
            System.out.println(" Yes divisible by 9 ");
        }
        else {
            System.out.println("Not divisible by 9");
        }
    }
}
