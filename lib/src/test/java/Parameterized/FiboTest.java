package Parameterized;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FiboTest {

	@SuppressWarnings("unused")
	@BeforeEach
	void setUp() {
		Fibo fibonacci = new Fibo();
	}

	@ParameterizedTest
	@CsvSource({ "0,0", "1,1", "2,1", "3,2" })
	void 引数が0の場合0(int arg, int expected) {
		Fibo fibonacci = new Fibo();
		assertThat(fibonacci.fibo(arg), is(expected));
	}

	@Nested
	class テスト {
		@SuppressWarnings("boxing")
		@Test
		void test1() {
			Fibo fibonacci = new Fibo();
			assertThat(fibonacci.fibo(1), is("1"));
		}
	}

}
