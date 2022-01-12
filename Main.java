public class Solution {
    public int evalRPN(ArrayList<String> A) {
        int z=0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<A.size();i++){
            String s = A.get(i);
            if(s.equals("+")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b+a);
            }else if(s.equals("-")){
                int c = stack.pop();
                int d = stack.pop();
                stack.push(d-c);
            }else if(s.equals("*")){
                int e = stack.pop();
                int f = stack.pop();
                stack.push(f*e);
            }else if(s.equals("/")){
                int g = stack.pop();
                int h = stack.pop();
                stack.push(h/g);
            }else{stack.push(Integer.parseInt(s));
            }
        }
        while(!stack.isEmpty()){
            z+=stack.pop();
        }
        return z;
    }
}
