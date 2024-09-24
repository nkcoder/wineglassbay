// https://leetcode.com/problems/reverse-string

/**
  * Run: scala-cli run 344_reverse_string.scala
  */
object ReverseString {
  // use two pointers
  def reverseString(s: Array[Char]): Unit = {
    var i = 0
    var n = s.length - 1
    while (i < n) {
      val temp = s(i)
      s(i) = s(n)
      s(n) = temp
      i += 1
      n -= 1
    }
  }

  // use one pointer
  def reverseString2(s: Array[Char]): Unit = {
    var i = 0
    while (i < s.length / 2) {
      val temp = s(i)
      s(i) = s(s.length - i - 1)
      s(s.length - i - 1) = temp
      i += 1
    }
  }

  def main(args: Array[String]): Unit = {
    val s1 = Array('h', 'e', 'l', 'l', 'o')
    reverseString(s1)
    assert(s1 sameElements Array('o', 'l', 'l', 'e', 'h'))

    val s2 = Array('H', 'a', 'n', 'n', 'a', 'h')
    reverseString(s2)
    assert(s2 sameElements Array('h', 'a', 'n', 'n', 'a', 'H'))

    val s3 = Array('h', 'e', 'l', 'l', 'o')
    reverseString2(s3)
    assert(s3 sameElements Array('o', 'l', 'l', 'e', 'h'))

    val s4 = Array('H', 'a', 'n', 'n', 'a', 'h')
    reverseString2(s4)
    assert(s4 sameElements Array('h', 'a', 'n', 'n', 'a', 'H'))
  }


}
