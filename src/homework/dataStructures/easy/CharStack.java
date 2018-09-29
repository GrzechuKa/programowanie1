package homework.dataStructures.easy;


public class CharStack {


    private int top;
    private int size;
    private char[] arrayString;

    public CharStack(int size) {
        this.size = size;
        this.arrayString = new char[size];
        top = -1;
    }

    public void push(char element) {
        if (top < arrayString.length - 1) {
            top++;
            arrayString[top] = element;
                    }
        return;

//        Po co wyjątek w if??
    }

    public char pop() throws EmptyCharStackExeption {
        if (!isEmpty()) {
            char element = arrayString[top];
            top--;
            return element;
        }
            throw new EmptyCharStackExeption();
    }
    public boolean isFull() {
        return top == arrayString.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

}
