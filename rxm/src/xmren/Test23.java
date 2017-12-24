package xmren;

public class Test23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [] arr = new int[] {8,2,1,0,3};
    int [] index = new int[] {2,0,3,2,4,0,1,3,2,3,3};
    String tel = "";
        
    for (int i : index) {
    	System.out.println("i"+i);
    	tel+=arr[i];
	}
    System.out.println("µç»°£º"+tel);
	}

}
