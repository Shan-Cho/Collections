package com.chouguleindustries.collectionss.machine;

public class MachineTester {

	public static void main(String[] args) {
		MachineDTO machine = new MachineDTO("India", Type.straightener, "Steel", 2000);
		System.out.println(machine);

		MachineDTO machine1 = new MachineDTO("G&N", Type.SweingMacine, "Metal", 20000);
		System.out.println(machine1);
		System.out.println(machine.equals(machine1));
	}
}
