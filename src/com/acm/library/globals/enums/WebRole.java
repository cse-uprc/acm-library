package com.acm.library.globals.enums;

import java.util.Arrays;

public enum WebRole {
	ADMIN(1), USER(2), GUEST(3);

	private int type;

	WebRole(int type) {
		this.type = type;
	}

	public int text() {
		return type;
	}

	public static WebRole valueOf(int value) {
		return Arrays.stream(values()).filter(role -> role.type == value).findFirst().get();
	}
}