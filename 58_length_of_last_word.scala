// https://leetcode.com/problems/length-of-last-word

object Solution {
  def lengthOfLastWord(s: String): Int = {
    var i = 0
    var count = 0
    val n = s.length
    while (i < n) {
      if (s(i) != ' ') {
        count += 1
        i += 1
      } else {
        while (i < n && s(i) == ' ') {
          i += 1
        }

        if (i == n) {
          return count
        } else {
          count = 0
        }
      }
    }
    return count;
  }

  def main(args: Array[String]): Unit = {
    assert(lengthOfLastWord("Hello World") == 5)
    assert(lengthOfLastWord("   fly me   to   the moon  ") == 4)
    assert(lengthOfLastWord("luffy is still joyboy") == 6)
  }
}
