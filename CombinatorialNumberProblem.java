import java.util.Scanner;

public class CombinatorialNumberProblem {
    static final long MOD = 1000000007L;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        System.out.println(getCombinatorialNumber(n, m));
    }

    // 卢卡斯定理：C(n, m) mod p = ∏ C(n_i, m_i) mod p，其中 n_i、m_i 是 p 进制下的各位数字
    public static long getCombinatorialNumber(long n, long m) {
        if (m > n) return 0;
        long result = 1;
        while (n > 0 || m > 0) {
            result = result * comb(n % MOD, m % MOD) % MOD;
            n /= MOD;
            m /= MOD;
        }
        return result;
    }

    // 计算 C(n, m) mod p（n < p），分子分母分开累积，最后用费马小定理把除法转为乘逆元
    public static long comb(long n, long m) {
        if (m > n) return 0;
        if (m > n - m) m = n - m;
        long numerator = 1;   // 分子：n * (n-1) * ... * (n-m+1)
        long denominator = 1; // 分母：m!
        for (long i = 0; i < m; i++) {
            numerator = numerator * (n - i) % MOD;
            denominator = denominator * (i + 1) % MOD;
        }
        return numerator * quickPow(denominator, MOD - 2) % MOD;
    }

    // 快速幂：a^b mod p
    public static long quickPow(long a, long b) {
        long result = 1;
        a %= MOD;
        while (b > 0) {
            if ((b & 1) == 1) result = result * a % MOD;
            a = a * a % MOD;
            b >>= 1;
        }
        return result;
    }
}
