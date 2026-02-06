package com.fctxcoco.mathutil.tester;

import com.fctxcoco.mathutil.core.MathUtility;

import static com.fctxcoco.mathutil.core.MathUtility.getFactorial;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
//        testGetFactorialGivenRightArg0RunsWel     l();
//        testGetFactorialGivenRightArgNrunswell();
////        testGetFactorialGivenWrongArgMinus5ThrowException();
//        testGetFactorialGivenWrongArg25ThrowException();

        //sài thử hàm tính giai thừa
        System.out.println("5! = "+ MathUtility.getFactorial(5));
        System.out.println("6! = "+ MathUtility.getFactorial(6));



    }

    //testcase #2
    //DESC: CHECK GETF() WITH VALID BOUNDARY NUMBER, E,G N=0
    //STEP N=0
    // CALL GETF(N)
    //EXPECTED 1 AS THE RESULT OF 1
    // STATUS:
    public static void testGetFactorialGivenRightArg0RunsWell() {
        int n = 0;
        long expected = 1;//0! hy vong la 1, con thuc te thi
        long actual;//goi ham moi biet
        actual = getFactorial(n);
        System.out.println("Actual: " + actual + " EXPECTED: " + expected);
    }

    public static void testGetFactorialGivenRightArgNrunswell(){
      System.out.println("Actual: " + getFactorial(5) + " EXPECTED: 120" );
    }

    public static void testGetFactorialGivenWrongArgMinus5ThrowException(){
        System.out.println("-5 Expected: Exception; Actual: ");
        getFactorial(-5);
        // thấy ngoại lệ khi đưa n=-5 -> hàm mlem với n âm, ít nhất với -5. CODE đúng!!
        //đúng vì -5 phải ném ra ngoại lệ, và thực tế nó đã ném
        //              Expected                Actual
    }

    public static void testGetFactorialGivenWrongArg25ThrowException() {
        System.out.println("25 Expected: Exception; Actual: ");
        getFactorial(25);
    }

    // testcase#1: (caau2 số 3 là viết testcase đó em)
    //ID, TESTCASE DESCRIPTION | DATA | STEP/ PRODUCERE | EXPECTED RESULT| RESULT/ STATUS(PASSED/FAILED)| TEST DATE | TEST BY
    // ID | DESC                  DATA| STEPS       | EXPECTED RESULT| STATUS|DATE    | BY
    //TC01| VERIFY getFactorial()|n=0  |n=0         |                 |chờ chạy| 23/1/26|GL
    //      CHECK                      CALL getF(0)| 1 as the result of 0|
    //      TEST

    // cách viết theo chiều dọc cho dễ đọc
    // test ID: TC01
    //DESC: CHECK getFactorial(0) with a valid n(boundary value), e.g 0, 20
    //DATA: n=0
    //STEP (các bước kiểm thử - nếu test chức năng màn hình giống như user guide)
    // step 1 : click..
    //step 2: input...
    // prepare n=0 (a boundary value)
    // EXPECTED RESULT:
    // getFactorial(0 will) return 1
    //STATUS: passed/failed thì đợi xong code, hàm chạy xong mới biết

}

