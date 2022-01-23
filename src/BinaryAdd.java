class BinaryAdd {
    public static String addBinary(String a, String b) {

        String res = "";

        int i = a.length()-1;
        int j =b.length()-1;

        int sum=0;
        int carry =0;

        while(i>=0 || j>=0)
        {
            sum =carry;

            if(i>=0)
            {
                sum+= Character.getNumericValue(a.charAt(i));
            }

            if(j>=0)
            {
                sum+= Character.getNumericValue(b.charAt(j));
            }

            res+= Integer.toString(sum%2);
            carry = sum/2;
            i--;
            j--;




        }
        if(carry!=0)
        {
            res+= 1;
        }
        return res;
    }

    public static void main(String args[])
    {
        String a ="1010";
        String b="1011";

        String res =addBinary(a,b);
        System.out.println(res);
    }
}