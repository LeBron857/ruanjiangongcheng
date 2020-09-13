package demo;

public class Demo02 {
	public static void main(String[] args) {
		int [] arr={34,25,88,65,130,558,1};
		int zj=0;
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<arr.length-i;j++)	{
				if(arr[j]>arr[j+1]){
					zj=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=zj;
				}
			}
		}
		for(int a=0;a<arr.length;a++){
			System.out.print(arr[a]+"	");
		}
	}
}
