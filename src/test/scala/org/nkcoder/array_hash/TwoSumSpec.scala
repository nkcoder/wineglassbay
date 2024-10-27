package org.nkcoder.array_hash

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class TwoSumSpec extends AnyFlatSpec with should.Matchers {
  private val testCases = List(
    (Array(2, 7, 11, 15), 9) -> Array(0, 1),
    (Array(3, 2, 4), 6) -> Array(1, 2),
    (Array(3, 3), 6) -> Array(0, 1)
  )
  "twoSum" should "return the indices" in {
    for (((input, target), expect) <- testCases)
      println(s"Testing, input: ${input.toList}, target: $target")
      TwoSum.twoSum(input, target) should contain theSameElementsAs expect
  }

}
