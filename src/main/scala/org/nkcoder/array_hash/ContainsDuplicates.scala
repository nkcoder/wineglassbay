package org.nkcoder.array_hash

import scala.collection.mutable

/** https://leetcode.com/problems/contains-duplicate Easy
  *
  *   - brute force: T-O(n2), S-O(1)
  *   - sort, then compare adjacent elements: T-O(nlog(n), S-O(1)
  *   - set, traverse the array and check one by one: T-O(n), S-O(n)
*/
object ContainsDuplicates:
  def containsDuplicates(nums: Array[Int]): Boolean =
    nums.toSet.size != nums.length
