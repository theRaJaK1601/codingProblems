import java.util.*;
class VowelReverse
{
    public static void main(String[] args)
    {
        int i,count;
        char val;

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scn.nextLine();
        // str = str.replaceAll("\\s","");

        char[] strArr = str.toCharArray();
        // for (i = 0; i < str.length(); i++) {
        //     strArr[i] = str.charAt(i);
        // }

        count=0;
        for (i = 0; i < strArr.length; i++) {
            val = Character.toLowerCase(strArr[i]);
            if (val=='a'||val=='e'||val=='i'||val=='o'||val=='u') {
                count++;
            }
        }
        
        char[] vowelArr = new char[count];
        count=0;
        for (i = 0; i < strArr.length; i++) {
            val = Character.toLowerCase(strArr[i]);
            if (val=='a'||val=='e'||val=='i'||val=='o'||val=='u') {
                vowelArr[count] = strArr[i];
                count++;
            }
        }

        char[] vowelArrRev = new char[vowelArr.length];
        count=0;
        while (count < vowelArr.length) {
            for (int j = vowelArr.length-1; j >= 0; j--) {
                vowelArrRev[count] = vowelArr[j];
                count++;
            }
        }
        
        count=0;
        for (i = 0; i < strArr.length; i++) {
            val = Character.toLowerCase(strArr[i]);
            if (val=='a'||val=='e'||val=='i'||val=='o'||val=='u') {
                strArr[i] = vowelArrRev[count];
                count++;
            }
        }

        System.out.println(new String(strArr));
        scn.close();
    }
}