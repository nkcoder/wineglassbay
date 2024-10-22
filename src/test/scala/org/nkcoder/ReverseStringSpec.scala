package org.nkcoder

import org.nkcoder.ReverseString.*
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class ReverseStringSpec extends AnyFlatSpec with should.Matchers {
  private val testCases = List(
    Array('h', 'e', 'l', 'l', 'o') -> Array('o', 'l', 'l', 'e', 'h'),
    Array('H', 'a', 'n', 'n', 'a', 'h') -> Array('h', 'a', 'n', 'n', 'a', 'H')
  )

  "reverseString" should "reverse the input string" in {
    for ((input, expected) <- testCases) {
      val s = input.clone()
      reverseString(s)
      assert(s sameElements expected)
    }
  }

  "reverseString2" should "reverse the input string" in {
    for ((input, expected) <- testCases) {
      val s = input.clone()
      reverseString2(s)
      assert(s sameElements expected)
    }
  }

  "reverseStringUsingForLoop" should "reverse the input string" in {
    for ((input, expected) <- testCases) {
      val s = input.clone()
      reverseStringUsingForLoop(s)
      assert(s sameElements expected)
    }
  }

  "reverseStringUsingRecursion" should "reverse the input string" in {
    for ((input, expected) <- testCases) {
      val s = input.clone()
      reverseStringUsingRecursion(s)
      assert(s sameElements expected)
    }
  }

  "reverseStringUsingStack" should "reverse the input string" in {
    for ((input, expected) <- testCases) {
      val s = input.clone()
      reverseStringUsingStack(s)
      assert(s sameElements expected)
    }
  }

}
