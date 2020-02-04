public class Runner {
    public static void main(String[] args) {
        int[] a = {9, 7, 5};
        int[] b = {10, 7, 5};
        int[] c = {9, 13, 5};
        int[] outer = {7, 9, 13, 5};
        int[] inner = {9, 13};
        System.out.println(helloName("Matt"));
        System.out.println(icyHot(50, 150));
        System.out.println(sumDouble(5, 10));
        System.out.println(arrayCount9(a));
        System.out.println(in1To10(2, true));
        System.out.println(luckySum(13, 7, 3 ));
        System.out.println(countHi("Hi"));
        System.out.println(equalIsNot("is"));
        System.out.println(sum3(b));
        System.out.println(sum13(c));
        System.out.println(linearIn(outer, inner));
    }

    //Warm-up #1 icyHot
    public static boolean icyHot(int temp1, int temp2) {
        if (temp1 > 100 && temp2 < 0) {
            return true;
        }
        if (temp2 > 100 && temp1 < 0) {
            return true;
        } else {
            return false;
        }
    }


    // Warm-up 1 sumDouble
    public static int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        } else {
            return (a + b);
        }
    }
    // Warm-up 2 arrayCount9
    public static int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }

    // Logic # 1 in1To10
    public static boolean in1To10(int n, boolean outsideMode) {
        if ((outsideMode == false) && (n < 1 || n > 10)) {
            return false;
        }
        if ((outsideMode == true) && (n <= 1 || n >= 10)) {
            return true;
        }
        if ((n <= 10 || n > 1) && (outsideMode == false)) {
            return true;
        } else {
            return false;
        }
    }

    // Logic #2 luckySum
    public static int luckySum(int a, int b, int c) {
        if (a == 13){
            return 0;
        }
        if (b == 13){
            return a;
        }
        if (c == 13){
            return a + b;
        }
        else{
            return a + b + c;
        }
    }

    // string #1 helloName
    public static String helloName(String name){
        return "Hello " + name + "!";
    }

    // String 2
    public static int countHi(String str){
        int count = 0;
        for (int x = 0; x < str.length()-1; x++) {
            String sub = str.substring(x, x + 2);
            if (sub.equals("hi")){
                count++;
            }
        }
        return count;
    }


    // String 3
    public static boolean equalIsNot(String str) {
        int isCount = 0;
        int notCount = 0;
        for (int x = 0; x + 1< str.length(); x++){
            String is = str.substring(x, x + 2);
            if (is.equals("is")){
                isCount++;
            }
        }
        for (int x = 0; x + 2< str.length(); x++) {
            String not = str.substring(x, x + 3);
            if (not.equals("not")){
                notCount++;
            }
        }
        if (isCount == notCount){
            return true;
        }else{
            return false;
        }
    }

    // Array 1
    public static int sum3(int[] nums) {
        return (nums[0] + nums[1] + nums[2]);
    }

    //Array 2
    public static int sum13(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 13){
                sum += nums[i];
            } else {
                i++;
            }
        }
        return sum;
    }

    //Array 3

    public static boolean linearIn(int[] outer, int[] inner) {
        int i = 0;
        int x = 0;
        while (x < outer.length && i < inner.length) {
            if(inner[i] > outer[x]) {
                x++;
            }else if(inner[i] < outer[x]) {
                return false;
            }else{
                i++;
            }
        }
        if(i != inner.length){
            return false;
        }
        return true;
    }

}





