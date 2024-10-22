package org.nkcoder

import org.nkcoder.LengthOfLastWord.{lengthOfLastWord, lengthOfLastWord2, lengthOfLastWord3, lengthOfLastWord4}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class LengthOflastWordSpec extends AnyFlatSpec with should.Matchers {
  private val testCases = List(
    "Hello World" -> 5,
    "   fly me   to   the moon  " -> 4,
    "luffy is still joyboy" -> 6
  )

  "lengthOfLastWord" should "return the length of the last word" in {
    for ((input, expected) <- testCases) {
      val result = lengthOfLastWord(input)
      result should be(expected)
    }
  }

  "lengthOfLastWord2" should "return the length of the last word" in {
    for ((input, expected) <- testCases) {
      val result = lengthOfLastWord2(input)
      result should be(expected)
    }
  }

  "lengthOfLastWord3" should "return the length of the last word" in {
    for ((input, expected) <- testCases) {
      val result = lengthOfLastWord3(input)
      result should be(expected)
    }
  }

  "lengthOfLastWord4" should "return the length of the last word" in {
    for ((input, expected) <- testCases) {
      val result = lengthOfLastWord4(input)
      result should be(expected)
    }
  }

}
