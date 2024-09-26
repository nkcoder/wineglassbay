// https://leetcode.com/problems/longest-common-prefix

object LongestCommonPrefix {
  def longestCommonPrefix(strs: Array[String]): String = {
    if strs.isEmpty then return ""
    if strs.length == 1 then return strs(0)

    val minLength = strs.map(_.length).min
    var i = 0
    while i < minLength && strs.forall(_(i) == strs(0)(i)) do i += 1

    strs(0).substring(0, i)
  }

  @main def runExample = {
    val testCases = List(
      Array("flower", "flow", "flight") -> "fl",
      Array("dog", "racecar", "car") -> "",
      Array("a") -> "a",
      Array("a", "a") -> "a",
      Array("a", "b") -> "",
      Array("ab", "a") -> "a",
      Array("interspecies", "interstellar", "interstate") -> "inters"
    )

    for ((input, expected) <- testCases) {
      val result = longestCommonPrefix(input)
      assert(result == expected)
    }
  }
}
