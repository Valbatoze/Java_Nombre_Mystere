
public class GenerateNumber{
	Integer digitOne = (int) (Math.random() * 9) + 0;
	Integer digitTwo = (int) (Math.random() * 9) + 0;
	Integer digitThree = (int) (Math.random() * 9) + 0;
	Integer digitFour = (int) (Math.random() * 9) + 0;

	public GenerateNumber() {
		
	}
	
	public String nombreGenerate()
	{
		String allDigit = digitOne.toString() + digitTwo.toString() + digitThree.toString() + digitFour.toString();
		return allDigit;
	}
}
