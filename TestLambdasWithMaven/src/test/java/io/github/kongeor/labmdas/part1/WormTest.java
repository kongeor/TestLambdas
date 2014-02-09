package io.github.kongeor.labmdas.part1;


import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class WormTest {

	private final String NAME = "Chuck";
	private final String TEAM = "red";

	private Worm worm;

	@Before
	public void setUp() {
		worm = new Worm(NAME, TEAM);
	}

	@Test
	public void shouldHaveCorrectName() {
		assertThat(worm.getName()).isEqualTo(NAME);
	}

	@Test
	public void shouldHaveCorrectTeam() {
		assertThat(worm.getTeam()).isEqualTo(TEAM);
	}
}
