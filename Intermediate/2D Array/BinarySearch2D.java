
// Finding element using binary search in 2D Array

class BinarySearch2D{
   public static void main(String[] args) {
		int a[][] = {{1,3,5,7},
				{10,11,16,20},
				{23,30,34,60}};
		int t = 34;
		int l=0,h=a.length-1;
		boolean flg = false;
		while(l<=h) {
			int mid = (l+h)/2;
			if(t>=a[mid][0] && t<=a[mid][a[0].length-1]) {
				//search ele in mid row
				flg=binarySearch(a[mid],t);
				break;
			}
			else if(t>a[mid][a[0].length-1]) {
				l=mid+1;
			}
			else {
				h=mid-1;
			}
			
		}
		System.out.println(flg);
	}
		public static boolean binarySearch(int a[], int t) {
			int l=0,h=a.length-1;
			while(l<=h) {
				int mid =(l+h)/2;
				if(a[mid]==t) {
					return true;
				}
				else if(t>a[mid]) {
					l=mid+1;
				}
				else {
					h=mid-1;
				}
			}
			return false;
	    }

}