package Algorithm;

import java.util.*;

/**
 * Created by khushali on 10/10/15.
 */
public class Temp {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       long T, N[] = null, K[] = null;


        Scanner in = new Scanner(System.in);
        T = in.nextLong();
        N = new  long[(int)T];
        K = new  long[(int)T];
        for (int i = 0; i < T; i++) {
            try{
                N[i] = in.nextInt();

                K[i] = in.nextInt();
            }catch(NoSuchElementException e){
                e.printStackTrace();
            }


        }

        for (int i = 0; i < T; i++) {


            int[] S = new int[(int)N[i]];
            int size=(((int)N[i]) * (((int)N[i]) - 1))/2;
            int[] Ans = new int[size];
            for (int j = 0; j < N[i]; j++) {
                //create set
                S[j] = j + 1;
               // System.out.println(S[j]);

            }
int j=0;
            while(j < size) {
                for (int k = 0; k <  N[i]; k++) {
                    for(int l=k+1;l< N[i];l++){

                        //get the ans in array
                        Ans[j] = S[k] & S[l];
                            //System.out.println(S[k] + "&" + S[l] + ": " + Ans[j] + ",");
                        j++;
                    }

                }

            }
            j=0;


            //now compare ans for min and then see who is less then K
            // find
            int min = Ans[0];
            int max = Ans[0];
            for (j = 0; j < size; j++) {

                if (Ans[j] > max) {
                    if (Ans[j] < K[i]) {
                        min = Ans[j];
                    }

                }
            }

            System.out.println(min);
            Ans = null;
            S = null;
            min = 0;
            max = 0;


        }

    }
}

