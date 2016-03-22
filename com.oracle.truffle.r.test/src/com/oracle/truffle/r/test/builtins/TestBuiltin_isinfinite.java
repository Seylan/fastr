/*
 * This material is distributed under the GNU General Public License
 * Version 2. You may review the terms of this license at
 * http://www.gnu.org/licenses/gpl-2.0.html
 *
 * Copyright (c) 2014, Purdue University
 * Copyright (c) 2014, 2016, Oracle and/or its affiliates
 *
 * All rights reserved.
 */
package com.oracle.truffle.r.test.builtins;

import org.junit.Test;

import com.oracle.truffle.r.test.TestBase;

// Checkstyle: stop line length check
public class TestBuiltin_isinfinite extends TestBase {

    @Test
    public void testisinfinite1() {
        assertEval(Ignored.Unknown, "argv <- list(structure(c(100L, 0L, NA, NA, NA, 3L, NA), .Names = c(' 100', '-1e-13', ' Inf', '-Inf', ' NaN', '3.14', '  NA')));is.infinite(argv[[1]]);");
    }

    @Test
    public void testisinfinite2() {
        assertEval("argv <- list(c(Inf, -Inf));is.infinite(argv[[1]]);");
    }

    @Test
    public void testisinfinite3() {
        assertEval(Ignored.Unknown, "argv <- list(structure(logical(0), .Dim = c(0L, 0L)));is.infinite(argv[[1]]);");
    }

    @Test
    public void testisinfinite4() {
        assertEval(Ignored.Unknown,
                        "argv <- list(structure(c(0.00241725013897913, 2.73568372449633e-07, 0.00400531454105884, 0.0305181933571734, 0.022064930648429, 0.000416097494498381, 0.0186357510997526, 0.00896237344987589, 0.00202331168264955, 0.00279067096737535, 0.0447487811957221, 0.000577210896095096, 0.00782925975125774, 0.033211430744327, 0.0093483442273581, 0.00136284952207105, 0.0275004422708864, 0.0135979349769553, 0.000181644594904405, 0.00803803085466393, 0.00350275333198457, 0.014998898960339, 5.39459255498146e-05, 0.00123860219686858, 1.13323906102913e-05, 0.0297916373848854, 0.0312890114433758, 5.85350754663798e-05, 0.0131002435454964, 0.00277072267615578, 0.0222123285012571, 0.00194205331979335, 0.0103231522531299, 0.0261098279661105, 0.0358853728812373, 1.13323906102913e-05, 0.0486308859679786, 0.000674881587747117, 0.0218633172580077, 0.000558592420498928, 0.000802158707806158, 0.0581913205761545, 0.000436809276845313, 0.00631994234432259, 0.000141965876420771, 0.000262833357340149, 0.0055965687842748, 0.000654737007593888, 0.0140931986366498, 0.00241538552182261, 0.00414822230660342, 0.00884150659070285, 0.0647626092888162, 0.0935599413167129, 0.00117891119201738, 0.00742609802768654, 0.0306399064130622, 0.0274290617824389, 0.00217883778937331, 0.0108387379377857, 0.0242348837396833, 0.0168720396936779, 0.022211269097018, 0.0355286679037712, 0.00017126708391638, 0.00443642409999561, 0.0068913158904869, 0.0635882367317516, 0.0566932963429416, 0.00904861729235097, 0.00038919481466495), .Names = c('1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12', '13', '14', '15', '16', '17', '18', '19', '20', '21', '22', '23', '24', '25', '26', '27', '28', '29', '30', '31', '32', '33', '34', '35', '36', '37', '38', '39', '40', '41', '42', '43', '44', '45', '46', '47', '48', '49', '50', '51', '52', '53', '54', '55', '56', '57', '58', '59', '60', '61', '62', '63', '64', '65', '66', '67', '68', '69', '70', '71')));is.infinite(argv[[1]]);");
    }

    @Test
    public void testisinfinite5() {
        assertEval(Ignored.Unknown,
                        "argv <- list(structure(c(80, 80, 75, 62, 62, 62, 62, 62, 58, 58, 58, 58, 58, 58, 50, 50, 50, 50, 50, 56, 70, 27, 27, 25, 24, 22, 23, 24, 24, 23, 18, 18, 17, 18, 19, 18, 18, 19, 19, 20, 20, 20, 89, 88, 90, 87, 87, 87, 93, 93, 87, 80, 89, 88, 82, 93, 89, 86, 72, 79, 80, 82, 91, 42, 37, 37, 28, 18, 18, 19, 20, 15, 14, 14, 13, 11, 12, 8, 7, 8, 8, 9, 15, 15), .Dim = c(21L, 4L), .Dimnames = list(NULL, c('Air.Flow', 'Water.Temp', 'Acid.Conc.', 'stack.loss'))));is.infinite(argv[[1]]);");
    }

    @Test
    public void testisinfinite6() {
        assertEval(Ignored.Unknown,
                        "argv <- list(structure(c(1.12411954394441, -0.567321126080105, 1.28594901629635, -0.519809468914999, -1.485548782458, -0.435305441405687, -0.281625943801696, -0.527525498975648, 2.60041695299567, NA), .Names = c('1', '2', '3', '4', '5', '6', '7', '8', '9', '10')));is.infinite(argv[[1]]);");
    }

    @Test
    public void testisinfinite7() {
        assertEval("argv <- list(NULL);is.infinite(argv[[1]]);");
    }

    @Test
    public void testisinfinite8() {
        assertEval(Ignored.Unknown,
                        "argv <- list(structure(c(0.00544194018731062, 0.00542949133552226, 1.20718999105839e-05, 0.00505497198006266, 0.827687885653788, 0.00315385274195005, 0.0023164952286401, 0.00117183915211372, 2.09167441982205, 0.00193959227691399, 0.00358084102808485, 3.39138861812986e-05, 0.00163051710052444, 0.00168735925488057, 0.0167253073891896, 0.237074502262169, 0.0118967636015583, 0.00307437031103621, 0.00114371252369823, 0.000860763872820255, 0.00028432076263802, 0.00329557354736053, 0.000123683950933913, 0.00026114238659798, 0.00471892942651347, 0.00317288091968884, 6.76955217513137e-05, 0.0119061189538054, 0.00233356124758579, 0.00672098496026968, 0.134965372025281, 0.00102115420103838, 0.00114816901125044), .Names = c('Craig Dunain', 'Ben Rha', 'Ben Lomond', 'Goatfell', 'Bens of Jura', 'Cairnpapple', 'Scolty', 'Traprain', 'Lairig Ghru', 'Dollar', 'Lomonds', 'Cairn Table', 'Eildon Two', 'Cairngorm', 'Seven Hills', 'Knock Hill', 'Black Hill', 'Creag Beag', 'Kildcon Hill', 'Meall Ant-Suidhe', 'Half Ben Nevis', 'Cow Hill', 'N Berwick Law', 'Creag Dubh', 'Burnswark', 'Largo Law', 'Criffel', 'Acmony', 'Ben Nevis', 'Knockfarrel', 'Two Breweries', 'Cockleroi', 'Moffat Chase')));is.infinite(argv[[1]]);");
    }

    @Test
    public void testisinfinite9() {
        assertEval(Ignored.Unknown,
                        "argv <- list(structure(c(0.648648743252693, 0.52170345712821, -0.338075767187078, 0.169770656775468, -1.86324282017776, 0.362268009067608, 0.136032794890515, 0.901814933704047, -0.671639624694386, 1.79387977353953, 0.714576709724596, -0.471811539980989, -0.857026690426369, 0.226899513968796, 0.568565310101759, -0.944564385994918, 0.693403222263985, 0.02231307737364, -0.276817414323803, -0.344452836733253, -0.844829717537689, -0.421779195680793, -0.154748062715674, 1.43960300137753, 0.256965508768852, -0.295370227475694, 0.507911869619344, -0.346156318366332, -0.187948961031579, -0.454073164294974, -0.0895014237058297, 1.91227371168715, 0.779246572061347, 0.606406152381391, -0.0628430973426908, 2.1063179091687, -1.32672093069913, -0.754254955100625, -0.59565543740158, -1.95946772292555, -0.495798772099865, -3.58086046245482, -0.721772682345538, -0.254468243441054, 2.41750264738881, -0.0647957309150968, 1.87354174039771, -0.552199273430865, 0.732944502427441, 0.703597322009966, 0.875011400025303, -0.916329805907907, -0.297942295133666, -0.239141969395332, -1.79620422664673, -1.34633804643361, -Inf, 1.84762640960041, -0.344523591926435, 1.12935189480329, -0.902874350916712, -0.187948961031579, 0.444184743731147, -0.595767030989317, -0.878351658910786, 0.131398128073247, -1.16349118303155, -0.612790192876235, -0.231519954928205, -0.944564385994918, 0.136032794890519, -0.250233723215235, -0.972829009134415, 0.576852333601859, 0.226899513968797, -0.316245505808486, 0.101419270213227, 2.16953626752671, -0.383691077846572, 0.547999893193889, 0.00183871707028874, -1.28758691932778, 0.0676445397107313, -0.809987759639438, -1.04896153736838, 0.156556073105978, 0.248659709506608, 1.27246860456928, 0.554771572109539, 1.2326801378144, 2.2926344791142, 1.00034303387372, -0.554771572109538), .Names = c('1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12', '13', '14', '15', '16', '17', '18', '19', '20', '21', '22', '23', '24', '25', '26', '27', '28', '29', '30', '31', '32', '33', '34', '35', '36', '37', '38', '39', '40', '41', '42', '43', '44', '45', '46', '47', '48', '49', '50', '51', '52', '53', '54', '55', '56', '57', '58', '59', '60', '61', '62', '63', '64', '65', '66', '67', '68', '69', '70', '71', '72', '73', '74', '75', '76', '77', '78', '79', '80', '81', '82', '83', '84', '85', '86', '87', '88', '89', '90', '91', '92', '93')));is.infinite(argv[[1]]);");
    }

    @Test
    public void testisinfinite10() {
        assertEval(Ignored.Unknown,
                        "argv <- list(structure(c(100, -1e-13, Inf, -Inf, NaN, 3.14159265358979, NA), .Names = c(' 100', '-1e-13', ' Inf', '-Inf', ' NaN', '3.14', '  NA')));is.infinite(argv[[1]]);");
    }

    @Test
    public void testisinfinite11() {
        assertEval(Ignored.Unknown,
                        "argv <- list(structure(c(0.140840156507829, 0.04056135019562, 0.0029302031336855, 0.244192917875952, 0.613916838192149, 0.0888451715064135, 0.0786481028238466, 0.000549230092684491, 0.00048785961836479, 0.235214398525727, 0.000402612842061681, 0.00423992719924668, 0.0355604120039037, 0.00432748168352161, 0.170388213068447, 0.466682597016338), .Names = c('1947', '1948', '1949', '1950', '1951', '1952', '1953', '1954', '1955', '1956', '1957', '1958', '1959', '1960', '1961', '1962')));is.infinite(argv[[1]]);");
    }

    @Test
    public void testisinfinite12() {
        assertEval("argv <- list(4);is.infinite(argv[[1]]);");
    }

    @Test
    public void testisinfinite13() {
        assertEval(Ignored.Unknown, "argv <- list(structure(1:24, .Dim = 2:4));is.infinite(argv[[1]]);");
    }

    @Test
    public void testisinfinite14() {
        assertEval(Ignored.Unknown, "argv <- list(structure(c(1, 0.5, 0.5, 1), .Dim = c(2L, 2L), .Dimnames = list(c('A', 'B'), c('A', 'B'))));is.infinite(argv[[1]]);");
    }

    @Test
    public void testisinfinite15() {
        assertEval("argv <- list(c(21L, 21L, 21L, 21L, 21L, 21L, 21L, 21L, 21L, 21L, 21L, 21L, 21L, 21L, 21L, 21L, 21L, 21L, 36L, 51L, 66L, 81L, 96L, 111L, 126L, 141L, 156L, 171L, 178L, 185L, 192L, 199L, 206L, 213L, 220L, 227L, 234L, 241L, 248L, 250L, 252L, 254L, 256L, 258L, 260L, 262L, 264L, 266L, 268L, 270L, 267L, 264L, 261L, 258L, 255L, 242L, 229L, 216L, 203L, 190L, 177L, 164L, 151L, 138L, 125L, 112L, 111L, 110L, 109L, 108L, 107L, 106L, 105L, 104L, 103L, 102L, 101L, 100L, 99L, 102L, 105L, 108L, 111L, 114L, 117L, 120L, 123L, 126L, 129L, 132L, 141L, 150L, 159L, 168L, 177L, 186L, 195L, 204L, 213L, 222L, 231L, 240L, 257L, 274L, 291L, 308L, 325L, 342L, 359L, 376L, 393L, 384L, 375L, 366L, 357L, 348L, 339L, 330L, 321L, 312L, 303L, 294L, 285L, 286L, 287L, 288L, 289L, 290L, 291L, 292L, 293L, 294L, 295L, 296L, 282L, 268L, 254L, 240L, 226L, 212L, 198L, 184L, 170L, 156L, 142L, 128L, 114L, 100L, 86L, 72L, 58L, 44L, NA, NA, NA, NA, NA, NA, NA, NA, NA, NA, NA, NA, NA, NA, NA, NA, NA, NA, NA, NA, NA, NA, NA, NA, NA, NA, NA, NA));is.infinite(argv[[1]]);");
    }
}
