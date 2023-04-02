package com.buildertest;

public class Test {

    private static Integer aa;

	public static void main(String[] args) {

    setAa(C.cClassMethod().bClassMethod().aClassMethod());
    }

	public static Integer getAa() {
		return aa;
	}

	public static void setAa(Integer aa) {
		Test.aa = aa;
	}
}
