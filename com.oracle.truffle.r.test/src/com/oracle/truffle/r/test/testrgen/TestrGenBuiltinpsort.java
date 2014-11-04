/*
 * This material is distributed under the GNU General Public License
 * Version 2. You may review the terms of this license at
 * http://www.gnu.org/licenses/gpl-2.0.html
 * 
 * Copyright (c) 2014, Purdue University
 * Copyright (c) 2014, Oracle and/or its affiliates
 *
 * All rights reserved.
 */
package com.oracle.truffle.r.test.testrgen;

import org.junit.*;

import com.oracle.truffle.r.test.*;

// Checkstyle: stop line length check
public class TestrGenBuiltinpsort extends TestBase {

    @Test
    @Ignore
    public void testpsort1() {
        assertEval("argv <- list(7:8, 1:2); .Internal(psort(argv[[1]], argv[[2]]))");
    }

    @Test
    @Ignore
    public void testpsort2() {
        assertEval("argv <- list(c(0.0499999999999972, 0.300000000000004, 1.1, 0.0500000000000007, 0, 0.25, 1, 2.15, 1.95, 2.09999999999999, 1.95, 2.04999999999999, 2.59999999999999, 2.59999999999999, 2.6, 4.25, 3.45, 2.65000000000001, 3.49999999999999, 3.75000000000001, 2.75, 3.05, 2.8, 4.45, 3.35, 7.7, 14.2), 14L); .Internal(psort(argv[[1]], argv[[2]]))");
    }

    @Test
    @Ignore
    public void testpsort3() {
        assertEval("argv <- list(c(4.23272528138341e-16, 5.68989300120393e-16, 0.0499999999999982, 3.05311331771918e-16, 0.049999999999999, 0.0499999999999994, 3.05311331771918e-16, 0.0499999999999994, 0.100000000000001, 0.0999999999999994, 0.0999999999999994, 0.0500000000000006, 0.15, 0.15, 0.100000000000001, 0.0499999999999997, 0.150000000000001, 0.0999999999999995, 0.0999999999999993, 0.100000000000001, 0.0999999999999994, 0.100000000000001, 0.250000000000001, 0.250000000000001, 0.299999999999999, 0.199999999999999, 0.200000000000001, 0.3, 0.25, 0.199999999999999, 0.199999999999999, 0.150000000000001, 0.200000000000001, 0.199999999999998, 0.249999999999999, 0.199999999999999, 0.3, 0.350000000000001, 0.35, 0.300000000000001, 0.3, 0.350000000000002, 0.35, 0.35, 0.300000000000001, 0.350000000000001, 0.399999999999999, 0.4, 0.349999999999999, 0.350000000000001, 0.400000000000001, 0.300000000000001, 0.400000000000001, 0.449999999999999, 0.45, 0.450000000000001, 0.45, 0.450000000000001, 1.05, 0.7, 0.6, 1, 0.500000000000001, 0.5, 0.699999999999999, 1.05, 0.850000000000001, 0.650000000000001, 0.750000000000001, 0.75, 1, 0.699999999999999, 0.749999999999999, 1.05, 0.549999999999999, 0.500000000000001, 0.7, 0.8, 0.500000000000001, 0.650000000000001, 0.700000000000001, 0.599999999999999, 0.9, 0.75, 0.949999999999999, 0.899999999999999, 0.550000000000001, 1, 1.05, 1.05, 0.600000000000001, 0.6, 1.05, 0.749999999999999, 0.949999999999999, 1.1, 2.15, 1.45, 1.3, 2.1, 4.85, 3.7, 2.05, 1.2, 1.4, 1.3, 1.2, 1.85), 54:55); .Internal(psort(argv[[1]], argv[[2]]))");
    }

    @Test
    @Ignore
    public void testpsort4() {
        assertEval("argv <- list(c(0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.0499999999999998, 0.05, 0.05, 0.05, 0.0499999999999999, 0.05, 0.0499999999999999, 0.05, 0.0499999999999999, 0.0499999999999999, 0.05, 0.0499999999999999, 0.0499999999999999, 0.05, 0.05, 0.0499999999999998, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.0499999999999999, 0.05, 0.05, 0.05, 0.0499999999999999, 0.0499999999999999, 0.0499999999999999, 0.05, 0.05, 0.0499999999999999, 0.05, 0.0499999999999999, 0.05, 0.05, 0.05, 0.0499999999999998, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.05, 0.0555556, 0.05555554, 0.05555556, 0.05555556, 0.05555554, 0.0555556, 0.0555555, 0.0555556, 0.0555555, 0.0555556, 0.0555555, 0.0555556, 0.0555556, 0.0555555, 0.0555555999999999, 0.0555555000000001, 0.0555555999999999, 0.0555555000000001, 0.0555555999999999, 0.0555555, 0.0555556, 0.0555559999999999, 0.055555, 0.0555559999999999, 0.0526315, 0.05263162, 0.05263158, 0.05263158, 0.05263162, 0.0526315, 0.0526316, 0.0526316, 0.0526316, 0.0526316, 0.0526315, 0.0526316, 0.0526316, 0.0526316, 0.0526316, 0.0526315000000001, 0.0526316, 0.0526315999999999, 0.0526316, 0.0526315000000001, 0.0526316, 0.0526316, 0.052632, 0.0526310000000001, 0.0526319999999998, 0.08333333, 0.08333333, 0.08333334, 0.08333333, 0.08333333, 0.08333337, 0.0833333, 0.0833333, 0.0833333, 0.0833333, 0.0833333, 0.0833333, 0.0833333000000001, 0.0833333000000001, 0.0833333999999999, 0.0833333000000001, 0.0833333000000001, 0.0833333999999999, 0.0833333000000001, 0.0833333000000001, 0.0833333999999999, 0.0833333000000001, 0.0833333000000001, 0.0833330000000001, 0.0833330000000001), 76:77); .Internal(psort(argv[[1]], argv[[2]]))");
    }

    @Test
    @Ignore
    public void testpsort5() {
        assertEval("argv <- list(c(-3.35281542033775, -3.57533122743112, -3.23282496934355, -3.3903449466851, -3.39757437954971, -3.36251831175626, -3.22932468384763, -3.22295685034786, -3.21402130636699, -3.11638102275539, -3.09226646401048, -3.21757818016328, -3.0862187014408, -3.08484132891786), 7:8); .Internal(psort(argv[[1]], argv[[2]]))");
    }

    @Test
    @Ignore
    public void testpsort6() {
        assertEval("argv <- list(c(FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, TRUE, FALSE, FALSE, FALSE, TRUE, TRUE, FALSE, FALSE, TRUE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, TRUE, TRUE, FALSE, TRUE, TRUE, FALSE, FALSE, FALSE, FALSE, TRUE, TRUE, FALSE, FALSE, TRUE, TRUE, TRUE, FALSE, FALSE, FALSE, FALSE, FALSE, TRUE, FALSE, FALSE, FALSE, FALSE, TRUE, TRUE, FALSE, FALSE, TRUE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE, TRUE, TRUE, TRUE), c(66L, 195L)); .Internal(psort(argv[[1]], argv[[2]]))");
    }

    @Test
    @Ignore
    public void testpsort7() {
        assertEval("argv <- list(c(1, 2, 2, 3, 3, 4, 4, 5), 1:8); .Internal(psort(argv[[1]], argv[[2]]))");
    }

    @Test
    @Ignore
    public void testpsort8() {
        assertEval("argv <- list(27:28, 1:2); .Internal(psort(argv[[1]], argv[[2]]))");
    }

    @Test
    @Ignore
    public void testpsort9() {
        assertEval("argv <- list(c(-Inf, -Inf, Inf, Inf), 1:4); .Internal(psort(argv[[1]], argv[[2]]))");
    }

    @Test
    @Ignore
    public void testpsort10() {
        assertEval("argv <- list(c(-1.05715266611575, -0.873306430909872, -0.548705796690786, -0.288240908441576, -0.0649703574297026, 0.224762433374997, 0.3255545927283, 0.4813346401898, 0.530823516045489, 1.2699009772491), c(1L, 3L, 4L, 5L, 6L, 7L, 8L, 10L)); .Internal(psort(argv[[1]], argv[[2]]))");
    }

    @Test
    @Ignore
    public void testpsort11() {
        assertEval("argv <- list(c(-1.05715266611575, -0.873306430909873, -0.548705796690787, -0.288240908441577, -0.0649703574297025, 0.224762433374994, 0.3255545927283, 0.481334640189799, 0.530823516045488, 1.2699009772491), c(1L, 3L, 4L, 5L, 6L, 7L, 8L, 10L)); .Internal(psort(argv[[1]], argv[[2]]))");
    }

    @Test
    @Ignore
    public void testpsort12() {
        assertEval("argv <- list(c(-Inf, -Inf, -Inf, -Inf, -Inf, -Inf, -Inf, -Inf, -Inf, -Inf, -Inf, -Inf, -Inf, -Inf, -Inf, -Inf, -Inf, -Inf, -Inf, -Inf, -Inf, -Inf, -4.17369555651928e+302, -2.72671165723473e+289, -2.21240023126594e+276, -2.24780296109123e+263, -2.88514442494869e+250, -4.72336572671053e+237, -9.96611412047338e+224, -2.74100158340596e+212, -9.94902790498679e+199, -4.83110332887119e+187, -3.18582547396557e+175, -2.90089508183654e+163, -3.71562599613334e+151, -6.83535188151783e+139, -1.84898368353639e+128, -7.55412056676629e+116, -4.80716085942859e+105, -4.9383857330861e+94, -8.54170618068872e+83, -2.61556777274611e+73, -1.5069799345972e+63, -1.76183826972506e+53, -4.60125024792566e+43, -3.04622557026196e+34, -6.08456909882282e+25, -473300382255715392, -21650982809.6744, -12820.0784261145, -1.12778377684043), c(1L, 13L, 14L, 26L, 38L, 39L, 51L)); .Internal(psort(argv[[1]], argv[[2]]))");
    }

    @Test
    @Ignore
    public void testpsort13() {
        assertEval("argv <- list(c(0.5, 0.6, 1.2, 1.3, 1.6, 5.8, 6.2, 3.7, 5.1, 5, 4, 4, 5.3, 1.4, 6.6, 3.8, 2.6, 3.2, 2.9, 6.8, 10.6, 7.6, 9.3, 8, 10, 10, 8, 10.5, 10.5, 9.7, 9.7, 9.4, 8.9, 8.8, 8, 10.1, 8.5, 9.1, 7.5, 7.4, 7.5, 7.6, 8.4, 8.5, 10.8, 11.1, 12, 12, 18, 17.7, 16, 15, 14, 12.9, 12.7, 12.6, 17.9, 12.1, 17.7, 16.1, 13, 17.3, 17, 16.7, 13, 15.7, 19, 16, 17, 12, 12.2, 12.8, 14.6, 14.9, 17.6, 21, 20.5, 19.6, 20.2, 20.8, 21.1, 21.9, 20.5, 19.2, 22.5, 22, 23.2, 23, 22, 22, 23.4, 23.4, 23.5, 29, 26, 25, 28.5, 25.4, 29, 24.2, 23.9, 24.6, 25.7, 25.3, 28.6, 26.5, 29, 37.8, 30.9, 42, 31, 38.5, 41.4, 43.6, 46.7, 37.4, 45, 35.9, 36.1, 32, 44.4, 40.3, 30, 31, 32, 32.7, 36, 43.5, 33.1, 32.9, 36.3, 38.9, 30, 46.1, 45, 47.1, 47.7, 187, 147, 130, 49.2, 62, 141, 122, 105, 62, 64, 123, 112, 105, 63.6, 60, 49, 66, 87, 56.9, 60.7, 61.4, 156, 62, 64, 82, 88, 48.3, 109, 107, 85, 91, 148, 145, 53.1, 50, 92.2, 224, 293, 300, 211, 200, 197, 203, 359, 370), c(1L, 46L, 47L, 91L, 92L, 136L, 137L, 182L)); .Internal(psort(argv[[1]], argv[[2]]))");
    }

    @Test
    @Ignore
    public void testpsort14() {
        assertEval("argv <- list(c(-1.36919169254062, -0.667819876370237, -0.253162069270378, -0.0834190388782434, -0.00786394222146348, 0.0246733498130512, 0.0730305465518564, 0.0881443844426084, 0.170711734013213, 0.552921941721332), c(1L, 3L, 4L, 5L, 6L, 7L, 8L, 10L)); .Internal(psort(argv[[1]], argv[[2]]))");
    }
}
