package ch03
/** 2021.09.23
 * HOW TO USE IMPORT A PACKAGE (CLASS)
 * - T2-1One.kt = ch03  (THE SAME LEVEL)
 * - T2-2Two.kt = ch03.two
 * - T2-3Three.kt = ch03.tw0.sub
 * - Run_Test.kt = ch03
 * */
// The Class name shouldn't contain underscore('-')

import ch03.two.`T2-2Two`
import ch03.two.sub.`T2-3Three`

fun main() {
    /** 1.
     * 바로 선언해서 사용할 수도 있다.
     * */
        val three : String = `T2-1One`().description
        println(three)

    /** 2.
     * 같은 레벨은 바로 선언해서 사용한다.
     * */
        val four : String = `T2-2Two`().description
        println(four)

    /** 3.
     * 1.같은 레벨 클라스는 임포트 없이 바로사용
     * 2.다른 레벨 클라스는 임포트 후 사용한다.
     *   - T2_03Three 는 sub 레벨이므로 import
     * */
    val newbie = `T2-3Three`("one")
    val one = newbie.t2_one()
    println(one)
}