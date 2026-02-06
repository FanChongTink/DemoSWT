package com.fctxcoco.mathutil.core;

//đây là thư viện toán học, m phỏng gống thư viện chuẩn Math, của JDK
//các thư vện mang tính chất tiện ích, đồ dùng saài chung các nơi, cung cấp các tool nho nhỏ, thì ta sẽ thiết kế các hàm là static!!!!!!!!!!!!
public class MathUtility {
    //hàm tính n!= 1 2 3...n
    // ko có giai thừa là số âm
    //20! vừa đủ kiểu long- 18 con số 0, 21! kiểu long chứa ko nổi
    public static long getFactorial(int n) {

        long result = 1;
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0 and 20");
        }

        if (n == 0) {
            return 1;
        }

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
