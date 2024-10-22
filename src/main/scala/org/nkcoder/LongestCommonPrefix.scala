package org.nkcoder

// https://leetcode.com/problems/longest-common-prefix

object LongestCommonPrefix {

  /** Compare each character of the first string with the rest of the strings
    */
  def longestCommonPrefix(strs: Array[String]): String = {
    if strs.isEmpty then return ""
    if strs.length == 1 then return strs(0)

    val minLength = strs.map(_.length).min
    var i = 0
    while i < minLength && strs.forall(_(i) == strs(0)(i)) do i += 1

    strs(0).substring(0, i)
  }

  /** Sort the array and compare the first and last element
    */
  def longestCommonPrefix2(strs: Array[String]): String = {
    if strs.isEmpty then return ""
    if strs.length == 1 then return strs(0)

    val sortedStrs = strs.sorted
    val first = sortedStrs(0)
    val last = sortedStrs(sortedStrs.length - 1)
    var i = 0
    while i < first.length() && first(i) == last(i) do i += 1

    first.substring(0, i)
  }

  /** use `transpose` to get the columns of the strings
    */
  def longestCommonPrefixByTranspose(strs: Array[String]): String = {
    val minLength = strs.map(_.length).min
    strs
      .map(_.toCharArray().take(minLength))
      .transpose
      .takeWhile(_.distinct.size == 1)
      .map(_.head)
      .mkString
  }

  @main def runLongestCommonPrefixExample = {
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

    for ((input, expected) <- testCases) {
      val result = longestCommonPrefix2(input)
      assert(result == expected)
    }

    for ((input, expected) <- testCases) {
      val result = longestCommonPrefixByTranspose(input)
      assert(result == expected)
    }
  }
}
