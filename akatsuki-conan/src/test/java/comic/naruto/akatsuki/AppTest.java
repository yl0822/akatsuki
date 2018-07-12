package comic.naruto.akatsuki;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void shouldAnswerWithTrue() {
		int expected = 51;
		int actual = 51;

		assertThat("failure - They are not same!", actual, equalTo(expected));
	}
}
