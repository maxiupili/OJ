public class BranchApple {
    public static void main(String[] args) {
        System.out.println(branch(4,3));
        System.out.println(branch2(4,3));
        System.out.println(branch3(4,3));
    }
    public static int branch(int m,int n){
        //如果拥有0个苹果或者拥有0个篮子，那么分发就是0种
        if(m==0||n==0){
            return 0;
        }
        //如果拥有m个苹果，m》0那么只有一个篮子或者只有一个苹果拥有0个篮子，那么
        //都只有一种分法；
        if(m==1||n==1){
            return 1;
        }
        //其他情况；
        return (m+1)*(n-1);
    }

    public static int branch2(int m,int n){
        //如果拥有0个苹果或者拥有0个篮子，那么分发就是0种
        if(m==0||n==1){
            return 1;
        }
        //如果拥有m个苹果，m》0那么只有一个篮子或者只有一个苹果拥有0个篮子，那么
        //都只有一种分法；
        if(m < n){
            return branch2(m,m);
        }
        //其他情况；
        return branch2(m,n-1)+branch2(m-n,n);
    }

    public static int branch3(int m,int n){
        int sum = 0;
        if(m==0||n==0){
            return sum;
        }
        for (int i = 1; i <= m/2 && i <= n ; i++) {
            sum = sum + factor(m)/(factor(m+1-i)*factor(i-1)) * factor(n)/(factor(n-i));
        }
        return sum;
    }

    public static int factor (int x) {
        if (x==0)
            return 1;
        else {
            return x*factor(x-1);
        }
    }
}
