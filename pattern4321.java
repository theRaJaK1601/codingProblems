import java.util.*;

public class Solution {

    public static void main(String[] args) {

        int n=4, m=(2*n)-1, o=m, p=m;
        for(int i=0;i<m;i++){
            int k=1;
            for(int j=0; j<(2*n)-1;j++){
                System.out.print(n);
                if(k>=(2*n)-1){
                    int temp=n;
                    while(k<o){
                        System.out.print(++temp);
                        k++;
                        o--;
                    }
                    System.out.println();
                    while(p>=k){
                        System.out.print(temp--);
                        k++;
                    }
                    break;
                }
                k++;
            }
            n--;
        }
    }
}
