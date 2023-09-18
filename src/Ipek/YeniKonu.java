package Ipek;

public class YeniKonu{
    public static void main(String[] args) {
        int a=1,b=3;
        if(a<b){
            System.out.println("doğru");
        }else{
            System.out.println("yanlış");
        }

        int m=1,n=4,t=7;
        if((m<n)&&(m<t)) {
            System.out.println("m en küçük sayıdır");
        }else if((n<m)&&(n<t)){
            System.out.println("n en küçüktür");
        }else if((t<m)&&(t<n)){
            System.out.println("t en küçüktür");
        }

    }
}
