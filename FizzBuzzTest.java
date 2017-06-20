
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void shouldReturnOne() {

		// arrange
		FizzBuzz underTest = new FizzBuzz();
		// act
		String response = underTest.say();
		// assert
		Assert.assertEquals("should have response '1'", "1", response);

	}

	@Test
	public void shouldReturnTwo() {

		// arrange
		FizzBuzz underTest = new FizzBuzz();
		// act
		String response = underTest.say(2);
		// assert
		Assert.assertEquals("2", response);

	}

	@Test
	public void shouldReturnFizzInsteadof3() {

		// arrange
		FizzBuzz underTest = new FizzBuzz();
		// act
		String response = underTest.say(3);
		// assert
		Assert.assertEquals("Fizz", response);
}
	
	@Test
	public void shouldReturnFizzInsteadof6() {

		// arrange
		FizzBuzz underTest = new FizzBuzz();
		// act
		String response = underTest.say(6);
		// assert
		Assert.assertEquals("Fizz", response);
}
	
	@Test
	public void shouldReturnBuzzInsteadof5() {

		// arrange
		FizzBuzz underTest = new FizzBuzz();
		// act
		String response = underTest.say(5);
		// assert
		Assert.assertEquals("Buzz", response);
}
	@Test
	public void shouldReturnBuzzInsteadof10() {

		// arrange
		FizzBuzz underTest = new FizzBuzz();
		// act
		String response = underTest.say(10);
		// assert
		Assert.assertEquals("Buzz", response);

}
	@Test
	public void shouldReturnBuzzInsteadof15() {

		// arrange
		FizzBuzz underTest = new FizzBuzz();
		// act
		String response = underTest.say(15);
		// assert
		Assert.assertEquals("FizzBuzz", response);
}
	
	@Test
	public void shouldReturnBuzzInsteadof30() {

		// arrange
		FizzBuzz underTest = new FizzBuzz();
		// act
		String response = underTest.say(30);
		// assert
		Assert.assertEquals("FizzBuzz", response);
}
}