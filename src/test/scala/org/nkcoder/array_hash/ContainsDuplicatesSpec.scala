package org.nkcoder.array_hash

import org.nkcoder.array_hash.ContainsDuplicates.containsDuplicates
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class ContainsDuplicatesSpec extends AnyFlatSpec with should.Matchers {

  private val testCases = List(
    Array(1, 2, 3, 4) -> false,
    Array(1, 2, 3, 1) -> true,
    Array(1, 1, 1, 3, 3, 4, 3, 2, 4, 2) -> true
  )

  "containsDuplicates" should "return true if there are any duplicates, false otherwise" in {
    for ((input, expect) <- testCases)
      containsDuplicates(input) should be(expect)
  }

  "containsDuplicates2" should "return true if there are any duplicates, false otherwise" in {
    for ((input, expect) <- testCases)
      ContainsDuplicates.containsDuplicates2(input) should be(expect)
  }

  "containsDuplicates3" should "return true if there are any duplicates, false otherwise" in {
    for ((input, expect) <- testCases)
      ContainsDuplicates.containsDuplicates3(input) should be(expect)
  }

}
