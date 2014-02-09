package io.github.kongeor.labmdas.part1;

import java.util.ArrayList;
import java.util.List;

public class Worms {
	
	private List<Worm> worms;
	
	public Worms() {
		worms = new ArrayList<>();
	}
	
	public List<Worm> getWorms() {
		return worms;
	}
	
	public Worm findByName(String name) {
		for (Worm worm : worms) {
			if (worm.getName().equals(name)) {
				return worm;
			}
		}
		return null;
	}


}
