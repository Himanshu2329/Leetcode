public class LeetPoweroftwo {
    public static void main(String[] args) {
        int n=3;
        boolean res=getpowerofTwo(n);
        System.out.println(res);
    }

    private static boolean getpowerofTwo(int n) {
        // TODO Auto-generated method stub
        
                return n > 0 && (n & n - 1) == 0;
        
        
        // throw new UnsupportedOperationException("Unimplemented method 'getpowerofTwo'");
    }
}
