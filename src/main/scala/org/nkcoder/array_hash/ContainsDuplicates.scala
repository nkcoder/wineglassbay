package org.nkcoder.array_hash

import scala.collection.mutable
import scala.util.control.Breaks.{break, breakable}

/** https://leetcode.com/problems/contains-duplicate Easy
  *
  *   - brute force: T-O(n2), S-O(1)
  *   - sort, then compare adjacent elements: T-O(nlog(n), S-O(1)
  *   - set, traverse the array and check one by one: T-O(n), S-O(n)
  */
object ContainsDuplicates:
  def containsDuplicates(nums: Array[Int]): Boolean =
    nums.toSet.size != nums.length

  def containsDuplicates2(nums: Array[Int]): Boolean =
    val set = mutable.HashSet.empty[Int]
    var result = false
    breakable {
      nums.foreach { num =>
        if set.contains(num) then
          result = true
          break
        set.add(num)
      }
    }
    result

  def containsDuplicates3(nums: Array[Int]): Boolean =
    val set = mutable.HashSet.empty[Int]
    nums.exists { num =>
      if set.contains(num) then true
      else
        set.add(num)
        false
    }
