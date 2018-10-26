public class q1 {
    void fibonacci(){

        int n1=0,n2=1,n3,i;
        int c=20;
        System.out.print(n2+" ");

        for(i=2;i<c;i++)
        {
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }

    }
    public static void main(String args[])
    {
        q1 f1= new q1();
        f1.fibonacci();

    }
}
