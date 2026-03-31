import java.util.Stack;

public class StockSpan {
    static int[] calculateSpan(int [] prices){
        int n=prices.length;
        int [] span = new int[n];
        Stack<Integer> st = new Stack<>();
        span[0] = 1;
        st.push(0);

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && prices[st.peek()] <= prices[i]){
                st.pop();
            }
            span[i] = st.isEmpty() ?(i+1) : (i-st.peek());
            st.push(i);
        }
        return span;
    }
    public static void main(String[] args) {
        int [] prices = {100, 80, 70, 50, 75, 85};
        int [] result = calculateSpan(prices);
        System.out.println("Stock span ");
        for(int s : result){
            System.out.println(s + " ");
        }
    }
} 
