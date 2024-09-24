// https://leetcode.com/problems/reverse-string

/** Run: scala-cli run 344_reverse_string.scala
  */
object ReverseString {
  // use two pointers: O(n) time and O(1) space
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

  // use one pointer: O(n) time and O(1) space
  def reverseString2(s: Array[Char]): Unit = {
    var i = 0
    while (i < s.length / 2) {
      val temp = s(i)
      s(i) = s(s.length - i - 1)
      s(s.length - i - 1) = temp
      i += 1
    }
  }

  // use stack: O(n) time and space
  def reverseStringByStack(s: Array[Char]): Unit = {
    import scala.collection.mutable.Stack
    val stack = Stack[Char]()
    for (c <- s) {
      stack.push(c)
    }

    for (i <- s.indices) {
      s(i) = stack.pop()
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

    val s5 = Array('h', 'e', 'l', 'l', 'o')
    reverseStringByStack(s5)
    assert(s5 sameElements Array('o', 'l', 'l', 'e', 'h'))
    val s6 = Array('H', 'a', 'n', 'n', 'a', 'h')
    reverseStringByStack(s6)
    assert(s6 sameElements Array('h', 'a', 'n', 'n', 'a', 'H'))
  }

}

/** Notes:
  *   1. use stack: push and pop, O(n) time and space 2. Scala has a built-in
  *      method: s.reverse which returns a new reversed string
  */
