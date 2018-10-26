public class q5 {
    void armstrong(){
        int sum=0,a,t;
        int n=153;

        t=n;

        while(n>0)
        {
            a=n%10;
            n=n/10;
            sum=sum+(a*a*a);
        }
        if(t==sum)
            System.out.println("yes");
        else
            System.out.println("no");

    }
        public static void main(String[] args)  {
            q5 obj1= new q5();
            obj1.armstrong();
        }
    }

