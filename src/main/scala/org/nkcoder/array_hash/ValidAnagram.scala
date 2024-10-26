package org.nkcoder.array_hash

/** EASY: https://leetcode.com/problems/valid-anagram/description/
  *
  * An Anagram is a word or phrase formed by rearranging the letters of a
  * different word or phrase, using all the original letters exactly once.
  */
object ValidAnagram:
  // sort: T-O(nlogn), S-O(n)
  def validAnagram2(s: String, t: String): Boolean =
    if s.length != t.length then false
    else
      val sortedS = s.sorted
      val sortedT = t.sorted
      sortedS == sortedT

  // hash: T-O(n), S-O(n)
  def validAnagram3(s: String, t: String): Boolean =
    val hash = collection.mutable.Map[Char, Int]()
    
    for (c <- s)
      hash.put(c, hash.getOrElse(c, 0) + 1)

    for (c <- t)
      hash.put(c, hash.getOrElse(c, 0) - 1)

    hash.forall((_, v) => v == 0)
