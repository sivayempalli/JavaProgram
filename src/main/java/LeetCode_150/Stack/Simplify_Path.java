package LeetCode_150.Stack;

import java.util.Stack;

public class Simplify_Path {
    public static void main(String[] args) {
        System.out.println(new Simplify_Path_Solution().simplifyPath("/home//foo/"));
        System.out.println(new Simplify_Path_Solution().simplifyPath("/home/user/Documents/../Pictures"));
        System.out.println(new Simplify_Path_Solution().simplifyPath("/../"));
        System.out.println(new Simplify_Path_Solution().simplifyPath("/.../a/../b/c/../d/./"));
    }
}

class Simplify_Path_Solution {
    public String simplifyPath(String path) {

        Stack<String> st = new Stack<>();

        int currentIndex = 0;
        while(currentIndex < path.length()){

            StringBuilder currDir = new StringBuilder();
            while(currentIndex < path.length()){
                char ch =  path.charAt(currentIndex);
                if( ch == '/' && currDir.length() == 0){
                    currentIndex++;
                }
                else if(ch == '/'){
                    break;
                }
                else{
                    currDir.append(ch);
                    currentIndex++;
                }
            }

            if(currDir.toString().equals(".")){
                continue;
            }
            else if(currDir.toString().equals("..")){

                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else {
                if(currDir.length() != 0 ) st.push(currDir.toString());
            }
        }

        StringBuilder output = new StringBuilder();

        while (!st.isEmpty()){
            String curr = st.pop();
            output.insert(0, "/" + curr);
        }

        if(output.length() == 0){
            return  "/";
        }

        return  output.toString();
    }
}
