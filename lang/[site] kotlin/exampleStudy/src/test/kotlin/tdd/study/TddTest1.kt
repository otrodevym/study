package tdd.study

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class TddTest1 {
    @Test
    fun `테스트 시작`() {
//        given
        val num = 1
//        when
        val `val`= 1
//        then
        assertTrue(num ==`val`)
    }
}