 
//https://codeforces.com/contest/1872/problem/G
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.invoke.MethodHandles;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;
 
public class G_Replace_With_Product {
  static final int MOD = 998244353;
  static final Random RAND = new Random();
 
  static int[] solve(int[] a) {
    int n = a.length;
 
    // try not to include 1, include 2 or above as much as possible
    int b = 0;
    while (b < n && a[b] == 1) {
      b++;
    }
    if (b == n) {
      return new int[] {1,1};
    }
    int e = n-1;
    while (a[e] == 1) {
      e--;
    }
    if (b == e) {
      return new int[] {1,1};
    } else {
 
      // Consider the "chunk" v 1 1 1 ... 1 1 w where there are m < 200000 1s and both v, w >= 2.
      // the product is v * w and the sum is v + w + m
      //   v * w - (v + w + m) = (v-1)*(w-1) - (m+1)
      // so if any of v or w >= m + 2, it always makes sense to collapse the chunk into the product.
 
      // If the product is sufficiently large, it makes sense to collapse the whole [b,e].
      // Lack of proof for a precise bound, here we use 1000000.
      {
        long p = 1;
        for (int i = b; i <= e; i++) {
          if (a[i] > 1) {
            p *= a[i];
            if (p >= 1000000) {
              return new int[] {b + 1, e + 1};
            }
          }
        }
      }
 
      // There are at most 20 values >= 2 and their products < 1M
      // detect chunks [l,r] where all values in each chunk are 2+.
      // Collection such chunks in the form {l,r,sum,product}
      List<int[]> chunks = new ArrayList<>();
      int ib = b;
      while (ib <= e) {
        int ie = ib;
        int p = a[ib];
        int s = a[ib];
        while (ie + 1 <= e && a[ie + 1] > 1) {
          ie++;
          p *= a[ie];
          s += a[ie];
        }
        int[] chunk = new int[] {ib, ie, s, p};
        chunks.add(chunk);
        ib = ie + 1;
        while (ib <= e && a[ib] == 1) {
          ib++;
        }
        // merge with previous chunks as appropriate in reverse order
      }
 
      int sum = 0;
      for (int i = b; i <= e; i++) {
        sum += a[i];
      }
      if (test) System.out.format("  chunks: %s sum:%d\n", traceListIntArray(chunks), sum);
 
      // Since we need to collapse exactly once, evaluate all pairs of [i,j]
      // in which case we collapse chunks[i] ... chunks[j] into their product.
      int m = chunks.size();
      int maxv = 0;
      int[] ans = new int[2];
      for (int i = 0; i < m; i++) {
        for (int j = i; j < m; j++) {
          int[] chunk = clone(chunks.get(i));
          for (int h = i + 1; h <= j; h++) {
            chunk = merge(chunk, chunks.get(h));
          }
          int value = sum - chunk[2] + chunk[3];
          if (value > maxv) {
            maxv = value;
            ans[0] = chunks.get(i)[0] + 1;
            ans[1] = chunks.get(j)[1] + 1;
          }
        }
      }
      return ans;
    }
  }
 
  static int[] clone(int[] a) {
    int n = a.length;
    int[] b = new int[n];
    System.arraycopy(a, 0, b, 0, n);
    return b;
  }
 
  static int[] merge(int[] a, int[] b) {
    int h = b[0] - a[1] - 1;
    int sum = a[2] + h + b[2];
    int pro = a[3] * b[3];
    return new int[] {a[0], b[1], sum, pro};
  }
 
  static int[] solveNaive(int[] a) {
    int n = a.length;
    // replace [l,r] by the a single number which is the product
    // we want to maximize the sum, find such [l,r]
    long[] presum = new long[n+1];
    for (int i = 0; i < n; i++) {
      presum[i+1] = presum[i] + a[i];
    }
 
    BigInteger[] premul = new BigInteger[n+1];
    premul[0] = BigInteger.valueOf(1);
 
    for (int i = 0; i < n; i++) {
      premul[i+1] = premul[i].multiply(BigInteger.valueOf(a[i]));
    }
 
    BigInteger maxv = BigInteger.valueOf(0);
    int[] ans = new int[2];
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        long sum = presum[n] - (presum[j+1] - presum[i]);
        BigInteger value = premul[j+1].divide(premul[i]).add(BigInteger.valueOf(sum));
        if (value.compareTo(maxv) > 0) {
          maxv = value;
          ans[0] = i + 1;
          ans[1] = j + 1;
        }
      }
    }
    return ans;
  }
 
  static BigInteger getScore(int[] a, int l, int r) {
    int n = a.length;
    BigInteger p = BigInteger.valueOf(1);
    long sum = 0;
    for (int i = 0; i < n; i++) {
      if (i < l || i > r) {
        sum += a[i];
      } else {
        if (a[i] != 1) {
          p = p.multiply(BigInteger.valueOf(a[i]));
        }
      }
    }
    return p.add(BigInteger.valueOf(sum));
  }
 
  static String trace(int[] a) {
    StringBuilder sb = new StringBuilder();
    sb.append('{');
    for (int v : a) {
      if (sb.length() > 1) {
        sb.append(',');
      }
      sb.append(v);
    }
    sb.append('}');
    return sb.toString();
  }
 
  public static String traceListIntArray(List<int[]> points) {
    StringBuilder sb = new StringBuilder();
    sb.append('[');
    boolean first = true;
    for (int[] v : points) {
      if (!first) {
        sb.append(',');
      }
      first = false;
      sb.append('[');
      boolean first2 = true;
      for (int w : v) {
        if (!first2) {
          sb.append(',');
        }
        sb.append(w);
        first2 = false;
      }
 
      sb.append(']');
    }
    sb.append(']');
    return sb.toString();
  }
 
  static void test(int[] a) {
    int[] exp = solveNaive(a);
    int[] ans = solve(a);
    BigInteger vexp = getScore(a, exp[0]-1, exp[1]-1);
    BigInteger vans = getScore(a, ans[0]-1, ans[1]-1);
    boolean ok = vexp.compareTo(vans) == 0;
    System.out.format("%s\n  => %s %d %s\n", trace(a), trace(ans), vans, ok ? "" : "\n Exp " + trace(exp) + " " + vexp);
    myAssert(ok);
  }
 
  static boolean test = false;
  static void doTest() {
    if (!test) {
      return;
    }
    long t0 = System.currentTimeMillis();
    test(new int[] {1,1,2,1,1,2,2,2,1,1,2,1,1,1});
    test(new int[] {2,1,1,1,2,2});
    test(new int[] {2,3,1,1,1,1,1,1,1,1,1,1,1,1,1,2});
    for (int t = 0; t < 100; t++) {
      int n = 1 + RAND.nextInt(1000);
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = 1 + RAND.nextInt(2);
      }
      test(a);
    }
    test(new int[] {1,3,1,3});
    test(new int[] {1,1,2,3});
    test(new int[] {1,1,1,1,1});
    test(new int[] {10,1,10,1,10});
    test(new int[] {1});
    test(new int[] {2,2});
    test(new int[] {2,1,2});
    test(new int[] {2,1,1,3});
    test(new int[] {2,1,2,1,1,3});
 
    System.out.format("%d msec\n", System.currentTimeMillis() - t0);
    System.exit(0);
  }
 
  public static void main(String[] args) {
    doTest();
    MyScanner in = new MyScanner();
    int T = in.nextInt();
    for (int t = 1; t <= T; t++) {
      int n = in.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = in.nextInt();
      }
      // System.out.format("test(new int[] %s);\n", trace(a));
      int[] ans = solve(a);
      output(ans);
    }
  }
 
  static void output(int[] a) {
    if (a == null) {
      System.out.println("-1");
      return;
    }
    StringBuilder sb = new StringBuilder();
    for (int v : a) {
      sb.append(v);
      sb.append(' ');
      if (sb.length() > 4000) {
        System.out.print(sb.toString());
        sb.setLength(0);
      }
    }
    System.out.println(sb.toString());
  }
 
  static void myAssert(boolean cond) {
    if (!cond) {
      throw new RuntimeException("Unexpected");
    }
  }
 
  static class MyScanner {
    BufferedReader br;
    StringTokenizer st;
 
    public MyScanner() {
      try {
        final String USERDIR = System.getProperty("user.dir");
        String cname = MethodHandles.lookup().lookupClass().getCanonicalName().replace(".MyScanner", "");
        cname = cname.lastIndexOf('.') > 0 ? cname.substring(cname.lastIndexOf('.') + 1) : cname;
        final File fin = new File(USERDIR + "/io/c" + cname.substring(1,5) + "/" + cname + ".in");
        br = new BufferedReader(new InputStreamReader(fin.exists()
            ? new FileInputStream(fin) : System.in));
      } catch (Exception e) {
        br = new BufferedReader(new InputStreamReader(System.in));
      }
    }
 
    public String next() {
      try {
        while (st == null || !st.hasMoreElements()) {
          st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
 
    public int nextInt() {
      return Integer.parseInt(next());
    }
 
    public long nextLong() {
      return Long.parseLong(next());
    }
  }
}