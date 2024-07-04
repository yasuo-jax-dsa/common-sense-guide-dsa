package org.example.leetcode.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrtXTest {

    @Test
    public void testSqrt_with_0_expected_0(){

        assertEquals(SqrtX.rootSqrt(0), 0);
    }

    @Test
    public void testSqrt_with_1_not_expected_0(){

        assertNotEquals(SqrtX.rootSqrt(1), 0);
    }

    @Test
    public void testSqrt_with_2_expected_1(){

        assertEquals(SqrtX.rootSqrt(2), 1);
    }

    @Test
    public void testSqrt_with_3_expected_1(){

        assertEquals(SqrtX.rootSqrt(3), 1);
    }

    @Test
    public void testSqrt_with_8_expected_2(){

        assertEquals(SqrtX.rootSqrt(8), 2);
    }

    @Test
    public void testSqrt_with_120_expected_10(){

        assertEquals(SqrtX.rootSqrt(120), 10);
    }

    @Test
    public void testSqrt_with_99_expected_9(){

        assertEquals(SqrtX.rootSqrt(99), 9);
    }

    @Test
    public void testSqrt_with_36_expected_6(){

        assertEquals(SqrtX.rootSqrt(36), 6);
    }
}