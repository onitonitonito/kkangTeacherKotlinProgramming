package ch03.two
/**
 * 질문? : 화일이름은 소문자로 시작하지 않나?
 * */

import ch03.T2_01One
import ch03.two.sub.T2_03Three

fun main(args: Array<String>) {
    /**
     * 1.같은 레벨 클라스는 임포트 없이 바로사용
     * 2.다른 레벨 클라스는 임포트 후 사용한다.
     *   - T2_03Three 는 sub 레벨이므로 import
     * */
        val newbie = T2_03Three("one")
        val one = newbie.t2_one()
        println(one)


    /**
     * 바로 선언해서 사용할 수도 있다.
     * */
        val three : String = T2_01One().description
        println(three)

    /**
     * 같은 레벨은 바로 선언해서 사용한다.
     * */
        val four : String = WeAreOnrTheSameLevel().description
        println(four)

}