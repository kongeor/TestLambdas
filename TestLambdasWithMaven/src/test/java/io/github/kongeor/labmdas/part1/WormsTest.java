package io.github.kongeor.labmdas.part1;

import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class WormsTest {

	private Worms worms;
	private Worm worm;
	
	@Before
	public void setUp() {
		worms = new Worms();
		worm = new Worm("Chuck", "red");
		worms.getWorms().add(worm);
	}

	@Test
	public void shouldHaveTheCorrectSize() {
		assertThat(worms.getWorms().size()).isEqualTo(1);
	}
	
	@Test
	public void shouldFindTheCorrectWormByName() {
		assertThat(worms.findByName("Chuck")).isEqualTo(worm);
	}
	
	@Test
	public void shouldReturnNullForNonExistingName() {
		assertThat(worms.findByName("asdf")).isEqualTo(null);
	}

}
