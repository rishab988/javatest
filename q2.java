class q2 {

    void prime(){
        int n=10;
        int flag=0;

        for(int i=2;i<n/2;i++) {
            if (n % i == 0) {
                flag = 1;
                break;
            }
        }
        if(flag==1)
            System.out.println(n+" is NOT PRIME");
        else
            System.out.println(n+" is prime");


    }
    public static void main(String[] args){
        q2 obj1= new q2();
        obj1.prime();
    }
}

