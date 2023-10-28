class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(int ast : asteroids){
            if(ast>0){
               stack.push(ast);
            }
            else{
                while(!stack.isEmpty() && stack.peek()>0 && stack.peek() < Math.abs(ast))
                    stack.pop();

                if(stack.isEmpty() || stack.peek()<0)
                    stack.push(ast);

                if(stack.peek()==Math.abs(ast))
                    stack.pop();
            }
        }
        int[] result=new int[stack.size()];
        int currIndex=stack.size()-1;
        while(!stack.isEmpty()){
            result[currIndex--]=stack.pop();
        
        }
        return result;
    }
}