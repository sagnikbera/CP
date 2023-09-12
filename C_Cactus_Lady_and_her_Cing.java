//https://codeforces.com/problemset/problem/1872/F
import static java.lang.Math.*;
import java.util.*;
import java.io.*;
 
public class C_Cactus_Lady_and_her_Cing
{
    static final int INF = Integer.MAX_VALUE/2;
    static final long MOD = 998244353L;
    public static void main(String[] followthekkathyoninsta) throws Exception
    {
        BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(infile.readLine());
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(st.nextToken());
        tc:while(T-->0)
        {
            int N = Integer.parseInt(infile.readLine());
            int[] afraid = readArr(N, infile, st);
            int[] cost = readArr(N, infile, st);
            for(int i=0; i < N; i++)
                afraid[i]--;
            int[] processed = new int[N];
            Arrays.fill(processed, -1);
            ArrayList<Integer> res = new ArrayList<Integer>();
            for(int v=0; v < N; v++)
                if(processed[v] == -1) {
                    int curr = v;
                    while (processed[curr] == -1) {
                        processed[curr] = v;
                        curr = afraid[curr];
                    }
                    if(processed[curr] != v)
                        continue;
 
                    int minCost = INF;
                    int choice = -1;
                    ArrayList<Integer> cycle = new ArrayList<Integer>();
                    while (processed[curr] != INF) {
                        processed[curr] = INF;
                        cycle.add(curr);
                        if (cost[curr] < minCost) {
                            minCost = cost[curr];
                            choice = curr;
                        }
                        curr = afraid[curr];
                    }
                    if(cycle.size() == 0)
                        continue;
                    int start = 0;
                    while (true) {
                        if (cycle.get(start) == choice)
                            break;
                        start++;
                    }
                    //append the cycle at the end
                    start++;
                    for (int turns = 0; turns < cycle.size(); turns++) {
                        if (start == cycle.size())
                            start = 0;
                        res.add(cycle.get(start++) + 1);
                    }
                }
            boolean[] isCyc = new boolean[N];
            for(int x: res)
                isCyc[x-1] = true;
            //reverse bfs into the cycle
            int[] deg = new int[N];
            ArrayList<Integer> firstadd = new ArrayList<Integer>();
            for(int i=0; i < N; i++)
                deg[afraid[i]]++;
            ArrayDeque<Integer> q = new ArrayDeque<Integer>();
            for(int i=0; i < N; i++)
                if(!isCyc[i] && deg[i] == 0)
                    q.add(i);
            while(q.size() > 0)
            {
                int curr = q.poll();
                firstadd.add(curr+1);
                int next = afraid[curr];
                deg[next]--;
                if(deg[next] == 0 && !isCyc[next])
                    q.add(next);
            }
 
            for(int x: firstadd)
                sb.append(x+" ");
            for(int x: res)
                sb.append(x+" ");
            sb.append("\n");
        }
        System.out.print(sb);
    }
    public static int[] readArr(int N, BufferedReader infile, StringTokenizer st) throws Exception
    {
        int[] arr = new int[N];
        st = new StringTokenizer(infile.readLine());
        for(int i=0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        return arr;
    }
}