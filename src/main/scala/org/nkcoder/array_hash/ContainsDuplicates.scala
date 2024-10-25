package org.nkcoder.array_hash

import scala.collection.mutable

/** https://leetcode.com/problems/contains-duplicate Easy
  *
  *   1. brute force: T-O(n^2), S-O(1)
  *   2. sort, then compare adjacent elements: T-O(nlog(n), S-O(1)
  *   3. set, traverse the array and check one by one: T-O(n), S-O(n)
  */
object ContainsDuplicates:
  def containsDuplicates(nums: Array[Int]): Boolean =
    nums.toSet.size != nums.length
