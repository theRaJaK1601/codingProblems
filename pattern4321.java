import java.util.*;

public class Solution {

    public static void main(String[] args) {

        int counter=0, n=4, limit=(2*n)-1, o=limit, p=limit;
        if(counter==0){
        for(int i=0;i<limit;i++){
            int k=1;
            for(int j=0; j<(2*n)-1;j++){
                System.out.print(n);
                if(k>=(2*n)-1){
                    int temp=n;
                    while(k<o){
                        System.out.print(++temp);
                        k++;
                    }
                    o--;
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
        counter++;
        }
        if(counter==1){
           n=4; limit=(2*n)-1; o=limit; p=limit;

        }
    }
}
