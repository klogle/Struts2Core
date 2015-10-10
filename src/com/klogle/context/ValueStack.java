package com.klogle.context;

import java.util.ArrayList;
import java.util.List;

public class ValueStack {

	private List<Object> valueStack = null;

	public ValueStack() {
		valueStack = new ArrayList<>();
	}

	// 弹栈
	public Object pop() {
		return valueStack.remove(0);
	}

	// 压栈
	public void push(Object element) {
		valueStack.add(0, element);
	}

	// 读取
	public Object seek() {
		return valueStack.get(0);
	}
}
