public class ThrowExample {
    public void eligibility (int age)
	{
		if (age < 18) {
			throw new ArithmeticException("Not eligible to vote");
		}
        else{
            System.out.println("Become eligible first");
        }
	}
    public static void main(String[] args)
	{
		ThrowExample example = new ThrowExample();
		try {
			example.eligibility(17);
		}catch(ArithmeticException error) {
			System.out.println("Exception message : "+error.getMessage());
		}

	}
}