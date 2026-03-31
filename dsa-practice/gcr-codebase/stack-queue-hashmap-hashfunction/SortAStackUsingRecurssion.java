import java.util.Stack;

public class SortAStackUsingRecurssion {
    public static void sortStack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        sortStack(st);
        insertSorted(st, top);
    }
    public static void insertSorted(Stack<Integer> st, int element){
        if(st.isEmpty() || st.peek() <= element){
            st.push(element);
            return;
        }
        int top = st.pop();
        insertSorted(st, element);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(6);
        st.push(2);
        st.push(9);
        st.push(7);
        st.push(4);
        System.out.println("Before sorting " + st);
        sortStack(st);
        System.out.println("After sorting " + st);
    }
}
