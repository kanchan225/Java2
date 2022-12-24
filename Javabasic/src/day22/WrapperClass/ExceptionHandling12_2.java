package day22.WrapperClass;

public class ExceptionHandling12_2 {
	public static void validateAge(int age) {
		if (age < 18) {
			// throw Arithmetic exception if not eligible to vote
				try {
					throw new UserDefinedException("Person is not eligible to vote");
				} catch (UserDefinedException e) {
					//e.printStackTrace();
					System.out.println(e);
				}			
		} else {
			System.out.println("Person is eligible to vote!!");
		}
	}

	public static void main(String args[]) {
		System.out.println("I am main of ExceptionHandling12_2");
		validateAge(15);
		System.out.println("Rest of the code..");
	}
}
