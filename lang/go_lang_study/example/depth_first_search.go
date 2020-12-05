package main

import "fmt"

type TreeNode struct {
	Value       int
	Left, Right *TreeNode
}

func DfsIinOrder(treeNode *TreeNode) {
	if treeNode == nil {
		return
	}

	DfsIinOrder(treeNode.Left)
	fmt.Println(treeNode.Value)
	DfsIinOrder(treeNode.Right)
}
func main() {

	tree := &TreeNode{5,
		&TreeNode{1, nil, nil},
		&TreeNode{2, &TreeNode{7, nil, nil}, nil}}

	DfsIinOrder(tree)
}
