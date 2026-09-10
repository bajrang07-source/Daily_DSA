class Solution {

    int ans = 0;

    public int averageOfSubtree(TreeNode root) {
        helper(root);
        return ans;
    }

    private int[] helper(TreeNode node) {

        if (node == null) {
            return new int[]{0, 0};
        }

        int[] left = helper(node.left);

        int[] right = helper(node.right);

        int sum = left[0] + right[0] + node.val;

        int count = left[1] + right[1] + 1;

        int avg = sum / count;

        if (node.val == avg) {
            ans++;
        }

        return new int[]{sum, count};
    }
}