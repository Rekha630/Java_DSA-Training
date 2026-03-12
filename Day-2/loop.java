public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		by:
			for(int i=0;i<5;i++)
			{
				for(int j=0;j<5;j++)
				{
					if(i==j)
					{
						continue by;
					}
					System.out.println(i);
				}
			}

	}

}
