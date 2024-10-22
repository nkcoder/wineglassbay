package org.nkcoder

import org.nkcoder.LongestCommonPrefix.{longestCommonPrefix, longestCommonPrefix2, longestCommonPrefixByTranspose}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

import scala.runtime.stdLibPatches.Predef.assert

class LongestCommonPrefixSpec extends AnyFlatSpec with should.Matchers {
  private val testCases = List(
    Array("flower", "flow", "flight") -> "fl",
    Array("dog", "racecar", "car") -> "",
    Array("a") -> "a",
    Array("a", "a") -> "a",
    Array("a", "b") -> "",
    Array("ab", "a") -> "a",
    Array("interspecies", "interstellar", "interstate") -> "inters"
  )

  "LongestCommonPrefix" should "return the longest common prefix" in {
    testCases.foreach { (input, expected) =>
      longestCommonPrefix(input) should be(expected)
    }
  }

  "LongestCommonPrefix2" should "return the longest common prefix" in {
    testCases.foreach { (input, expected) =>
      longestCommonPrefix2(input) should be(expected)
    }
  }

  "LongestCommonPrefixByTranspose" should "return the longest common prefix" in {
    testCases.foreach { (input, expected) =>
      longestCommonPrefixByTranspose(input) should be(expected)
    }
  }

}
