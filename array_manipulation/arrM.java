/*ARRAY MANIPULATION IN JAVA:
* Methods:
* .add()
* .remove()
* .sort()
* */

public class arrM {
    public static void main(String[] args) {
        //TESTING
        boolean[] test = {true,false,false,true,false};
        boolean[] newArr = remove(test, false);

        for(boolean i:newArr)
            System.out.print(i+" ");
    }

/* ------------------.add() method------------------
 * Adding element in into array arr at position pos
 * .add(arr, in, pos)
 * */
    /*Add integer*/
    public static int[] add(int[] arr, int in){
        int[] newArr = new int[arr.length+1];

        for(int i=0; i<arr.length; i++) newArr[i] = arr[i]; //copy arr elements into newArr
        newArr[arr.length] = in;

        return newArr;
    }

    public static int[] add(int[] arr, int in, int pos){
        int[] newArr = new int[arr.length+1];

        for(int i=0; i<pos; i++) newArr[i] = arr[i];
        newArr[pos] = in;
        for(int i=pos+1; i<newArr.length; i++) newArr[i] = arr[i-1];

        return newArr;
    }

    /*Add String*/
    public static String[] add(String[] arr, String in){
        String[] newArr = new String[arr.length+1];

        for(int i=0; i<arr.length; i++) newArr[i] = arr[i]; //copy arr elements into newArr
        newArr[arr.length] = in;

        return newArr;
    }

    public static String[] add(String[] arr, String in, int pos){
        String[] newArr = new String[arr.length+1];

        for(int i=0; i<pos; i++) newArr[i] = arr[i];
        newArr[pos] = in;
        for(int i=pos+1; i<newArr.length; i++) newArr[i] = arr[i-1];

        return newArr;
    }

    /*Add double*/
    public static double[] add(double[] arr, double in){
        double[] newArr = new double[arr.length+1];

        for(int i=0; i<arr.length; i++) newArr[i] = arr[i]; //copy arr elements into newArr
        newArr[arr.length] = in;

        return newArr;
    }

    public static double[] add(double[] arr, double in, int pos){
        double[] newArr = new double[arr.length+1];

        for(int i=0; i<pos; i++) newArr[i] = arr[i];
        newArr[pos] = in;
        for(int i=pos+1; i<newArr.length; i++) newArr[i] = arr[i-1];

        return newArr;
    }

    /*Add boolean*/
    public static boolean[] add(boolean[] arr, boolean in){
        boolean[] newArr = new boolean[arr.length+1];

        for(int i=0; i<arr.length; i++) newArr[i] = arr[i]; //copy arr elements into newArr
        newArr[arr.length] = in;

        return newArr;
    }

    public static boolean[] add(boolean[] arr, boolean in, int pos){
        boolean[] newArr = new boolean[arr.length+1];

        for(int i=0; i<pos; i++) newArr[i] = arr[i];
        newArr[pos] = in;
        for(int i=pos+1; i<newArr.length; i++) newArr[i] = arr[i-1];

        return newArr;
    }

    /*Add char*/
    public static char[] add(char[] arr, char in){
        char[] newArr = new char[arr.length+1];

        for(int i=0; i<arr.length; i++) newArr[i] = arr[i]; //copy arr elements into newArr
        newArr[arr.length] = in;

        return newArr;
    }

    public static char[] add(char[] arr, char in, int pos){
        char[] newArr = new char[arr.length+1];

        for(int i=0; i<pos; i++) newArr[i] = arr[i];
        newArr[pos] = in;
        for(int i=pos+1; i<newArr.length; i++) newArr[i] = arr[i-1];

        return newArr;
    }

/* ------------------.remove() ------------------
* Removing element out from array arr
*       .remove(arr,out)
* */
    /*Remove integer*/
    public static int[] remove(int[] arr, int out){
        int[] newArr = new int[arr.length-1];

        for(int i=0,j=0; i<arr.length; i++)
            if (arr[i]!=out) newArr[j++] = arr[i];

        return newArr;
    }

    /*Remove String*/
    public static String[] remove(String[] arr, String out){
        String[] newArr = new String[arr.length-1];

        for(int i=0,j=0; i<arr.length; i++)
            if (!arr[i].equals(out)) newArr[j++] = arr[i];

        return newArr;
    }

    /*Remove double*/
    public static double[] remove(double[] arr, double out){
        double[] newArr = new double[arr.length-1];

        for(int i=0,j=0; i<arr.length; i++)
            if (arr[i]!=out) newArr[j++] = arr[i];

        return newArr;
    }

    /*remove boolean*/
    public static boolean[] remove(boolean[] arr, boolean out){
        boolean[] newArr = new boolean[arr.length-1];

        for(int i=0,j=0; i<arr.length; i++)
            if (arr[i]!=out) newArr[j++] = arr[i];

        return newArr;
    }

    /*remove char*/
    public static char[] remove(char[] arr, char out){
        char[] newArr = new char[arr.length-1];

        for(int i=0,j=0; i<arr.length; i++)
            if (arr[i]!=out) newArr[j++] = arr[i];

        return newArr;
    }
}