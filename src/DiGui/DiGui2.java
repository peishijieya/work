package DiGui;

public class DiGui2 {
    public static void main(String[] args) {
        int result=jc(5);
        System.out.println("5的阶乘是："+result);
    }
    public  static  int jc(int n ){
        if (n==1){
            return  1;
        }
        else  {
            return n*jc(n-1);
        }
    }
}
