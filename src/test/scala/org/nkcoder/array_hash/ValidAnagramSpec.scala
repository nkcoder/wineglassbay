package org.nkcoder.array_hash

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class ValidAnagramSpec extends AnyFlatSpec with should.Matchers {
  private val testCases = List(
    ("anagram", "nagaram") -> true,
    ("rat", "car") -> false,
    ("a", "ab") -> false,
    ("", "") -> true,
    ("abcdddef", "defdcba") -> false
  )

  "validAnagram2" should "return true if t is an anagram of s, false otherwise" in {
    for (((s, t), expect) <- testCases)
      ValidAnagram.validAnagram2(s, t) should be(expect)
  }

  "validAnagram3" should "return true if t is an anagram of s, false otherwise" in {
    for (((s, t), expect) <- testCases)
      ValidAnagram.validAnagram3(s, t) should be(expect)
  }

}
