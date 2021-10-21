
public class Quiz4673 {
	public static void main(String[] args) {
		findSelfNum();
	}
	public static void findSelfNum() {
		int resultValue = 0;
		int orinValue = 0;
		boolean bFind = false;
		for(int i = 1 ; i<10000; i++)
		{
			bFind =false;
			for(int j= 1; j < i ; j++)
			{
				
				orinValue = j;
				resultValue = j;
				if(orinValue/1000 != 0) {
					resultValue +=  orinValue/1000;
					orinValue = orinValue % 1000;
				}
				if(orinValue/100 != 0) {
					resultValue +=  orinValue/100;
					orinValue = orinValue % 100;	
				}
				if(orinValue/10 != 0) {
					resultValue +=  orinValue/10;
					orinValue = orinValue % 10;	
				}
				else
					resultValue += orinValue;
				if(resultValue == i) {
					bFind = true;
					break;
				}
			}
			if(bFind == false) {
				System.out.println(i);
			}
			
		}
	}
}
