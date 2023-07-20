// class Solution {
// 	public int[] asteroidCollision(int[] asteroids) {
// 		Stack<Integer> stack = new Stack<>();

// 		for(int i=0; i<asteroids.length; i++){
// 			if(asteroids[i] >0) stack.push(asteroids[i]);

// 			else{
// 				while(!stack.isEmpty() && stack.peek() >0 && stack.peek() < - asteroids[i]){// negative makes it positive
// 					stack.pop();
// 				}
// 				if(!stack.isEmpty() && stack.peek() == -asteroids[i]){
// 					stack.pop();
// 				}
// 				else if(stack.isEmpty() || stack.peek() <0){
// 					stack.push(asteroids[i]);
// 				}
// 			}
// 		}
// 		int [] ans = new int[stack.size()];
// 		int i=stack.size()-1;
// 		while(!stack.isEmpty()){
// 			ans[i--] = stack.peek();
// 			stack.pop();
// 		}
// 		return ans;
// 	}
// }

// a - Index of current accepted array
// b - Index of next asteroid to search

class Solution {    
    public int[] asteroidCollision(int[] asteroids) {
        int len = helper(asteroids, 0, 1) + 1;
        return Arrays.copyOfRange(asteroids, 0, len);
    }
    
    private int helper(int[] as, int a, int b) {
        if (as.length <= 1) return as.length;
        while (b < as.length) {
            if (a < 0 || as[a] < 0 || as[b] > 0) {
                as[++a] = as[b++];  // Win-Win (both are survived)
            }
            else if (as[a] == -1 * as[b]) {
                a--; b++;           // Lost-Lost (both are destroyed)
            }
            else if (as[a] < -1 * as[b]) {
                a--;                // Win (b replace a, a go back)
            }
            else {
                b++;                // Lost (b goes on, a stay)
            }
        }
        return a;
    }
    
}