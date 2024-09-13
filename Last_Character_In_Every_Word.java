import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        String[] ss=s.split(" ");
        String sss="";
        for(int i=0;i<ss.length;i++){
            char lastChar = ss[i].charAt(ss[i].length() - 1); 
            if ((lastChar >= 'A' && lastChar <= 'Z') || (lastChar >= 'a' && lastChar <= 'z')) {
                sss += lastChar; 
            }
        }
        System.out.println(sss);
    }
}
