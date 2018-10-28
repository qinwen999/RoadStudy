package demo;

public class MathMine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MathMine m=new MathMine();
		try{
		//System.out.println(m.Mathmine(0));
		//System.out.println(m.Mathmine(100));
		//System.out.println(m.Mathmine(10));
		System.out.println(m.Mathmine(2));
		}catch(Exception e){
			 System.out.println("bad");
		}

	}
	int Mathmine(int x){
		int m=0;
		int i;
		int[] sta = null;
		boolean j=((x+1)==1)?true:false;
		for(i=x-1;j;i++){
			if(i<0) continue;
			if(i>31) break;
			if(sta[i]==-1) m++;
		}		
		return m;
		
	}

}
