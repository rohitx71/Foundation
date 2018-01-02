package DP;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by rohitx71 on 29-12-2017.
 */
public class ALTARAY {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            StringTokenizer stringTokenizer = new StringTokenizer(sc.nextLine());
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(stringTokenizer.nextToken());
            }
            int memo[] = new int[n];
            memo[n - 1] = 1;
            for (int i = n - 2; i >= 0; i--) {
                if (a[i] > 0 && a[i + 1] < 0 || a[i] < 0 && a[i + 1] > 0) {
                    memo[i] = 1 + memo[i + 1];
                }else{
                    memo[i]=1;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(memo[i] + " ");
            }
            System.out.println();
        }
    }
}
