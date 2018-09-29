package dataSructures.stack;

public class IntStack {

    private int top;
    private int[] array;

    public IntStack(int size) {
        this.array = new int[size];
        top = -1;
    }

    public boolean push(int element) {
        if (top < array.length - 1) {
            top++;
            array[top] = element;
            return true;
        }
        return false;
    }

    public int pop() throws EmptyStackExeptionMy {
        if (!isEmpty()) {
            int element = array[top];
            top--;
            return element;
        }
        throw new EmptyStackExeptionMy();
    }


    public int peek() throws EmptyStackExeptionMy {
        if (!isEmpty()) {
            return array[top];
        }
        throw new EmptyStackExeptionMy();
    }

    public boolean isFull() {
            return top == array.length - 1;
        }

        public boolean isEmpty() {
            return top == -1;
    }
}
