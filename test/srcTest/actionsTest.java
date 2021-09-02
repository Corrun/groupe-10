package srcTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jeuDesPetitsCheveaux.Actions;

class actionsTest {

	@Test
	void test() {
		boolean b = false;
		int nb = Actions.rouleDe();
		if (nb > 0 && nb < 7) b = true;
		assertTrue(b);
	}

}
