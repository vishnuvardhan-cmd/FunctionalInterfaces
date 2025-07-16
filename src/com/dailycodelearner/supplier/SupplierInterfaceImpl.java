package com.dailycodelearner.supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierInterfaceImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supplier<LocalDateTime> s=()-> LocalDateTime.now();
		System.out.println(s.get());
	}

}
