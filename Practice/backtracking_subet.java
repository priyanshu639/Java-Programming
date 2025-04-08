public class backtracking_suset {
    public static void findsubset(String str,int i,String ans){
        if(i==str.length()){{
            System.out.println(ans);
        }
            return;
        }
        findsubset(str,i+1, ans);
        findsubset(str,i+1, ans + str.charAt(i));
        

        

    }
    public static void main(String[] args) {
        String str="abc";
        findsubset(str,0," ");
    }
    
}
