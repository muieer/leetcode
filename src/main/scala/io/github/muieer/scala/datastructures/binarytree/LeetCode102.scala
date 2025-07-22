package io.github.muieer.scala.datastructures.binarytree

import scala.collection.mutable.ListBuffer

/*
* https://leetcode.cn/problems/binary-tree-level-order-traversal/description/
* 二叉树层序遍历，广度优先搜索算法（BFS）
* */
object LeetCode102 {

  /*
  * 分层保存遍历结果
  * */
  def levelOrder(root: TreeNode): List[List[Int]] = {
    if (root == null) {
      List.empty
    } else {
      var curLevelQueue = ListBuffer.empty[TreeNode]
      var nextLevelQueue = ListBuffer.empty[TreeNode]
      val finalRes = ListBuffer.empty[List[Int]]
      var curLevelRes = ListBuffer.empty[Int]
      curLevelQueue.addOne(root)
      while (curLevelQueue.nonEmpty) {
        val treeNode = curLevelQueue.remove(0)
        curLevelRes.addOne(treeNode.value)
        if (treeNode.left != null) nextLevelQueue.addOne(treeNode.left)
        if (treeNode.right != null) nextLevelQueue.addOne(treeNode.right)
        if (curLevelQueue.isEmpty) {
          finalRes.addOne(curLevelRes.toList)
          curLevelQueue = nextLevelQueue
          nextLevelQueue = ListBuffer.empty[TreeNode]
          curLevelRes = ListBuffer.empty[Int]
        }
      }
      finalRes.toList
    }
  }

  // 无需分层保存结果
  def levelOrder2(root: TreeNode): List[Int] = {
    if (root == null) List.empty[Int]

    val queue = ListBuffer.empty[TreeNode]
    queue.addOne(root)

    val res = ListBuffer.empty[Int]
    while (queue.nonEmpty) {
      val node = queue.remove(0)
      res.addOne(node.value)
      if (node.left != null) queue.addOne(node.left)
      if (node.right != null) queue.addOne(node.right)
    }

    res.toList
  }
}

class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
  var value: Int = _value
  var left: TreeNode = _left
  var right: TreeNode = _right
}
