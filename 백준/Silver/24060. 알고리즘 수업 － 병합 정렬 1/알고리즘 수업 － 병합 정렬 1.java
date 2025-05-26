import java.io.*;
import java.util.*;

public class Main {
    int[] a;
    static int[] tmp;
    static int result = -1;
    static int cnt = 0;
    static int k;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        
        k = Integer.parseInt(st.nextToken());
        
        int[] a = new int[n];
        
        tmp = new int[n];
        
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }

        merge_sort(a, 0, n - 1);

        System.out.println(result);
    }

    static void merge_sort(int a[], int p, int r){
        if(cnt > k) {
            return;
        }
        if(p < r){
            int q = (p + r) / 2;
            
            merge_sort(a, p, q);
            merge_sort(a, q + 1, r);
            merge(a, p, q, r);
        }
    }

    static void merge(int arr[], int p, int q, int r){
        int i = p;
        int j = q + 1;
        int t = 0;
        
        while(i <= q && j <= r){
            if(arr[i] < arr[j]){
                tmp[t++] = arr[i++];
            }
            else{
                tmp[t++] = arr[j++];
            }
        }

        while(i <= q){
            tmp[t++] = arr[i++];
        }

        while(j <= r){
            tmp[t++] = arr[j++];
        }

        i = p;
        t = 0;
        
        while(i <= r){
            cnt++;

            if(cnt == k){
                result = tmp[t];
                break;
            }

            arr[i++] = tmp[t++];
        }
    }
}