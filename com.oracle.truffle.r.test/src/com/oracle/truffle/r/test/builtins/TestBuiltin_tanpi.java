/*
 * Copyright (c) 2013, 2016, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package com.oracle.truffle.r.test.builtins;

import org.junit.Test;

import com.oracle.truffle.r.test.TestBase;

// Checkstyle: stop line length check
public class TestBuiltin_tanpi extends TestBase {

    @Test
    public void testtan1() {
        assertEval("argv <- list(c(-6.28318530717959, -6.1261056745001, -5.96902604182061, -5.81194640914112, -5.65486677646163, -5.49778714378214, -5.34070751110265, -5.18362787842316, -5.02654824574367, -4.86946861306418, -4.71238898038469, -4.5553093477052, -4.39822971502571, -4.24115008234622, -4.08407044966673, -3.92699081698724, -3.76991118430775, -3.61283155162826, -3.45575191894877, -3.29867228626928, -3.14159265358979, -2.9845130209103, -2.82743338823081, -2.67035375555132, -2.51327412287183, -2.35619449019234, -2.19911485751286, -2.04203522483337, -1.88495559215388, -1.72787595947439, -1.5707963267949, -1.41371669411541, -1.25663706143592, -1.09955742875643, -0.942477796076938, -0.785398163397448, -0.628318530717959, -0.471238898038469, -0.314159265358979, -0.15707963267949, 0, 0.15707963267949, 0.314159265358979, 0.471238898038469, 0.628318530717959, 0.785398163397448, 0.942477796076938, 1.09955742875643, 1.25663706143592, 1.41371669411541, 1.5707963267949, 1.72787595947439, 1.88495559215388, 2.04203522483337, 2.19911485751286, 2.35619449019234, 2.51327412287183, 2.67035375555133, 2.82743338823081, 2.9845130209103, 3.14159265358979, 3.29867228626928, 3.45575191894877, 3.61283155162826, 3.76991118430775, 3.92699081698724, 4.08407044966673, 4.24115008234622, 4.39822971502571, 4.5553093477052, 4.71238898038469, 4.86946861306418, 5.02654824574367, 5.18362787842316, 5.34070751110265, 5.49778714378214, 5.65486677646163, 5.81194640914112, 5.96902604182061, 6.1261056745001, 6.28318530717959, 6.44026493985908, 6.59734457253857, 6.75442420521805, 6.91150383789754, 7.06858347057704, 7.22566310325652, 7.38274273593601, 7.5398223686155, 7.69690200129499, 7.85398163397448, 8.01106126665397, 8.16814089933346, 8.32522053201295, 8.48230016469244, 8.63937979737193, 8.79645943005142, 8.95353906273091, 9.1106186954104, 9.26769832808989, 9.42477796076938));tanpi(argv[[1]]);");
    }

    @Test
    public void testtan2() {
        assertEval("argv <- list(c(0.0156298141969641, 0.0312596283939283, 0.0468894425908924, 0.0625192567878566, 0.0781490709848207, 0.0937788851817849, 0.109408699378749, 0.125038513575713, 0.140668327772677, 0.156298141969641, 0.171927956166606, 0.18755777036357, 0.203187584560534, 0.218817398757498, 0.234447212954462, 0.250077027151426, 0.26570684134839, 0.281336655545355, 0.296966469742319, 0.312596283939283, 0.328226098136247, 0.343855912333211, 0.359485726530175, 0.375115540727139, 0.390745354924104, 0.406375169121068, 0.422004983318032, 0.437634797514996, 0.45326461171196, 0.468894425908924, 0.484524240105888, 0.500154054302853, 0.515783868499817, 0.531413682696781, 0.547043496893745, 0.562673311090709, 0.578303125287673, 0.593932939484637, 0.609562753681602, 0.625192567878566, 0.64082238207553, 0.656452196272494, 0.672082010469458, 0.687711824666422, 0.703341638863387, 0.718971453060351, 0.734601267257315, 0.750231081454279, 0.765860895651243, 0.781490709848207, 0.797120524045171, 0.812750338242136, 0.8283801524391, 0.844009966636064, 0.859639780833028, 0.875269595029992, 0.890899409226956, 0.90652922342392, 0.922159037620885, 0.937788851817849, 0.953418666014813, 0.969048480211777, 0.984678294408741, 1.00030810860571, 1.01593792280267, 1.03156773699963, 1.0471975511966, 1.06282736539356, 1.07845717959053, 1.09408699378749, 1.10971680798445, 1.12534662218142, 1.14097643637838, 1.15660625057535, 1.17223606477231, 1.18786587896927, 1.20349569316624, 1.2191255073632, 1.23475532156017, 1.25038513575713, 1.2660149499541, 1.28164476415106, 1.29727457834802, 1.31290439254499, 1.32853420674195, 1.34416402093892, 1.35979383513588, 1.37542364933284, 1.39105346352981, 1.40668327772677, 1.42231309192374, 1.4379429061207, 1.45357272031767, 1.46920253451463, 1.48483234871159, 1.50046216290856, 1.51609197710552, 1.53172179130249, 1.54735160549945, 1.56298141969641));tanpi(argv[[1]]);");
    }

    @Test
    public void testtan3() {
        assertEval("argv <- list(c(0.560475646552213, 0.23017748948328, -1.55870831414912, -0.070508391424576, -0.129287735160946, -1.71506498688328, -0.460916205989202, 1.26506123460653, 0.686852851893526, 0.445661970099958, -1.22408179743946, -0.359813827057364, -0.400771450594052, -0.11068271594512, 0.555841134754075, -1.78691313680308, -0.497850478229239, 1.96661715662964, -0.701355901563686, 0.472791407727934, 1.06782370598685, 0.217974914658295, 1.02600444830724, 0.72889122929114, 0.625039267849257, 1.68669331074241, -0.837787044494525, -0.153373117836515, 1.13813693701195, -1.25381492106993, -0.426464221476814, 0.295071482992271, -0.895125661045022, -0.878133487533042, -0.821581081637487, -0.688640254100091, -0.553917653537589, 0.0619117105767217, 0.305962663739917, 0.380471001012383, 0.694706978920513, 0.207917278019599, 1.26539635156826, -2.16895596533851, -1.20796199830499, 1.12310858320335, 0.402884835299076, 0.466655353623219, -0.779965118336318, 0.0833690664718293, -0.253318513994755, 0.028546755348703, 0.0428704572913161, -1.36860228401446, 0.225770985659268, -1.51647060442954, 1.54875280423022, -0.584613749636069, -0.123854243844614, -0.215941568743973, -0.379639482759882, 0.502323453109302, 0.33320738366942, 1.01857538310709, 1.07179122647558, -0.303528641404258, -0.448209778629426, -0.0530042267305041, -0.922267467879738, -2.05008468562714, 0.491031166056535, 2.30916887564081, -1.00573852446226, 0.709200762582393, 0.688008616467358, -1.0255713696967, 0.284773007051009, 1.22071771225454, -0.18130347974915, 0.138891362439045, -0.00576418589988693, -0.38528040112633, 0.370660031792409, -0.644376548518833, 0.220486561818751, -0.331781963915697, -1.09683901314935, -0.435181490833803, 0.325931585531227, -1.14880761845109, -0.993503855962119, -0.54839695950807, -0.238731735111441, 0.627906076039371, -1.36065244853001, 0.600259587147127, -2.18733299301658, -1.53261062618519, 0.235700359100477));tanpi(argv[[1]]);");
    }

    @Test
    public void testtan4() {
        assertEval("argv <- list(c(-1.88495559215388, 0.628318530717959, -2.51327412287183, 5.02654824574367, 0.942477796076938, -2.51327412287183, 1.5707963267949, 2.19911485751286, 1.88495559215388, -0.942477796076938, 4.71238898038469, 1.25663706143592, -1.88495559215388, -6.91150383789755, 3.45575191894877, 0, 0, 2.82743338823081, 2.51327412287183, 1.88495559215388, 2.82743338823081, 2.51327412287183, 0.314159265358979, -6.28318530717959, 1.88495559215388, -0.314159265358979, -0.628318530717959, -4.71238898038469, -1.5707963267949, 1.25663706143592));tanpi(argv[[1]]);");
    }

    @Test
    public void testtan5() {
        assertEval("argv <- list(structure(c(-0.416146836547142, -0.989992496600445, -0.653643620863612, 0.283662185463226, 0.960170286650366, -0.416146836547142, 0.283662185463226, -0.839071529076452, -0.275163338051597, 0.64691932232864, 0.283662185463226, -0.759687912858821, 0.914742357804531, -0.918282786212119, 0.776685982021631), .Dim = c(5L, 3L)));tanpi(argv[[1]]);");
    }

    @Test
    public void testtan6() {
        assertEval("argv <- list(c(-0.560475646552213-0.710406563699301i, -0.23017748948328+0.25688370915653i, 1.55870831414912-0.24669187846237i, 0.070508391424576-0.347542599397733i, 0.129287735160946-0.951618567265016i, 1.71506498688328-0.04502772480892i, 0.460916205989202-0.784904469457076i, -1.26506123460653-1.66794193658814i, -0.686852851893526-0.380226520287762i, -0.445661970099958+0.918996609060766i, 1.22408179743946-0.57534696260839i, 0.359813827057364+0.607964322225033i, 0.40077145059405-1.61788270828916i, 0.11068271594512-0.055561965524539i, -0.555841134754075+0.519407203943462i, 1.78691313680308+0.30115336216671i, 0.497850478229239+0.105676194148943i, -1.96661715662964-0.64070600830538i, 0.701355901563686-0.849704346033582i, -0.47279140772793-1.02412879060491i, -1.06782370598685+0.11764659710013i, -0.217974914658295-0.947474614184802i, -1.02600444830724-0.49055744370067i, -0.72889122929114-0.256092192198247i, -0.62503926784926+1.84386200523221i, -1.68669331074241-0.65194990169546i, 0.837787044494525+0.235386572284857i, 0.153373117836515+0.077960849563711i, -1.13813693701195-0.96185663413013i, 1.25381492106993-0.0713080861236i, 0.42646422147681+1.44455085842335i, -0.295071482992271+0.451504053079215i, 0.895125661045022+0.04123292199294i, 0.878133487533042-0.422496832339625i, 0.82158108163749-2.05324722154052i, 0.68864025410009+1.13133721341418i, 0.55391765353759-1.46064007092482i, -0.061911710576722+0.739947510877334i, -0.30596266373992+1.90910356921748i, -0.38047100101238-1.4438931609718i, -0.694706978920513+0.701784335374711i, -0.207917278019599-0.262197489402468i, -1.26539635156826-1.57214415914549i, 2.16895596533851-1.51466765378175i, 1.20796199830499-1.60153617357459i, -1.12310858320335-0.5309065221703i, -0.40288483529908-1.4617555849959i, -0.466655353623219+0.687916772975828i, 0.77996511833632+2.10010894052567i, -0.08336906647183-1.28703047603518i, 0.253318513994755+0.787738847475178i, -0.028546755348703+0.76904224100091i, -0.042870457291316+0.332202578950118i, 1.36860228401446-1.00837660827701i, -0.225770985659268-0.119452606630659i, 1.51647060442954-0.28039533517025i, -1.54875280423022+0.56298953322048i, 0.584613749636069-0.372438756103829i, 0.123854243844614+0.976973386685621i, 0.215941568743973-0.374580857767014i, 0.37963948275988+1.05271146557933i, -0.5023234531093-1.04917700666607i, -0.33320738366942-1.26015524475811i, -1.01857538310709+3.2410399349424i, -1.07179122647558-0.41685758816043i, 0.303528641404258+0.298227591540715i, 0.448209778629426+0.636569674033849i, 0.053004226730504-0.483780625708744i, 0.922267467879738+0.516862044313609i, 2.05008468562714+0.36896452738509i, -0.491031166056535-0.215380507641693i, -2.30916887564081+0.06529303352532i, 1.00573852446226-0.03406725373846i, -0.70920076258239+2.12845189901618i, -0.688008616467358-0.741336096272828i, 1.0255713696967-1.09599626707466i, -0.284773007051009+0.037788399171079i, -1.22071771225454+0.31048074944314i, 0.18130347974915+0.436523478910183i, -0.138891362439045-0.458365332711106i, 0.00576418589989-1.06332613397119i, 0.38528040112633+1.26318517608949i, -0.370660031792409-0.349650387953555i, 0.644376548518833-0.865512862653374i, -0.220486561818751-0.236279568941097i, 0.331781963915697-0.197175894348552i, 1.09683901314935+1.10992028971364i, 0.435181490833803+0.084737292197196i, -0.325931585531227+0.754053785184521i, 1.14880761845109-0.49929201717226i, 0.993503855962119+0.214445309581601i, 0.54839695950807-0.324685911490835i, 0.238731735111441+0.094583528173571i, -0.627906076039371-0.895363357977542i, 1.36065244853001-1.31080153332797i, -0.60025958714713+1.99721338474797i, 2.18733299301658+0.60070882367242i, 1.53261062618519-1.25127136162494i, -0.235700359100477-0.611165916680421i, -1.02642090030678-1.18548008459731i));tanpi(argv[[1]]);");
    }

    @Test
    public void testtan7() {
        assertEval(Ignored.Unknown, "argv <- list(Inf);tanpi(argv[[1]]);");
    }

    @Test
    public void testTrigExp() {
        assertEval(Ignored.Unknown, "{ tanpi(c(0,0.5,-0.5)) }");
        assertEval("{ tanpi(1.2) }");
        assertEval("{ tannpi(c(0.3,0.6,0.9)) }");
        assertEval("{ tanpi() }");
    }
}
