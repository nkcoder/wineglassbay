// https://leetcode.com/problems/length-of-last-word

/** Run: scala-cli run 58_length_of_last_word.scala
  */
object LengthOfLastWord {
  // scan from the beginning
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

  // scan from the end
  def lengthOfLastWord2(s: String): Int = {
    val n = s.length();
    var i = n - 1;
    var count = 0;
    while (i >= 0 && s(i) == ' ') {
      i -= 1;
    }

    while (i >= 0 && s(i) != ' ') {
      count += 1;
      i -= 1;
    }

    return count;
  }

  def lengthOfLastWord3(s: String): Int = {
    s.trim.split(" ").last.length
  }

  def lengthOfLastWord4(s: String): Int = {
    s.trim.split(" ").reverse.head.length
  }

  @main def runLengthOfLastWordExample: Unit = {

    val testCases = List(
      "Hello World" -> 5,
      "   fly me   to   the moon  " -> 4,
      "luffy is still joyboy" -> 6
    )

    for ((input, expected) <- testCases) {
      val result = lengthOfLastWord(input)
      assert(result == expected)
    }

    for ((input, expected) <- testCases) {
      val result = lengthOfLastWord2(input)
      assert(result == expected)
    }

    for ((input, expected) <- testCases) {
      val result = lengthOfLastWord3(input)
      assert(result == expected)
    }

    for ((input, expected) <- testCases) {
      val result = lengthOfLastWord4(input)
      assert(result == expected)
    }
  }
}
