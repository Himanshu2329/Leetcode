package BasicRecursion;

public class BasicRecursion {
    public static void main(String[] args) {
        int n=5;
        int res=getElements(n);
        System.out.println(res);
    }
    static int getElements(int n){
        if(n<1){
            return n;
        }
        System.out.println(n-1);
        return n;
    }
}
