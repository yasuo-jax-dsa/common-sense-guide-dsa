package org.example.leetcode.binarysearch;

public class FirstBadVersion {

	public final int BAD_VERSION;

	public FirstBadVersion(int badVersion) {BAD_VERSION = badVersion;}

	public int findFirstBadVersion(int n) {
		var start = 1; var end = n;

		while (start <= end) {
			var mid = start + ((end - start) / 2); if (isBadVersion(mid))
				end = mid - 1;
			else
				start = mid + 1;
		} return start;
	}

	private boolean isBadVersion(int version) {
		return BAD_VERSION <= version;
	}

	public static void main(String[] args) {
		FirstBadVersion firstBadVersion = new FirstBadVersion(1);

		System.out.println(firstBadVersion.findFirstBadVersion(1));
	}
}
