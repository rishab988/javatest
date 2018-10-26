class q3 {
    void palindrome(){

                String str1="BOBO";
                String str2="";
                int length = str1.length();

                for (int i = length - 1; i >= 0; i--)
                    str2 = str2 + str1.charAt(i);

                if (str1.equals(str2))
                    System.out.println("yes");
                else
                    System.out.println("no");
            }


         public static void main(String[] args){
              q3 obj1= new q3();
              obj1.palindrome();
         }

}

