package dataSructures.stack;

public class RunnerStack {

    public static void main(String[] args) throws EmptyStackExeptionMy {
        // write your code here
        IntStack intStack = new IntStack(4);

//        System.out.println(intStack.push(2));
//        System.out.println(intStack.push(5));
//        System.out.println(intStack.push(9));
//        System.out.println(intStack.push(22));

//        try {
//            System.out.println(intStack.pop());
//        } catch (EmptyStackExeptionMy e){
//            e.printExeption();
//        }

        try{
            System.out.println(intStack.peek());
        } catch (EmptyStackExeptionMy e){
            e.printStackTrace();
        }

//        System.out.println(intStack.isEmpty());

        System.out.println(intStack.isFull());

    }
}
