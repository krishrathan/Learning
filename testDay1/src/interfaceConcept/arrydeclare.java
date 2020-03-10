package interfaceConcept;

public class arrydeclare {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int a[][]= {{9,2,3},{4,1,6}};
		int min= a[0][0];
		
		for (int i=0;i<2;i++)
		{
			
			for (int j=0;j<3;j++)
			{
				
					if(a[i][j]>min)
					{
				
						min=a[i][j];
					}
			}
		
		}
	
		System.out.println(min);

	}

}
