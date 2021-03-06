/**
 * Copyright 2017 Comcast Cable Communications Management, LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package com.comcast.redirector.ruleengine.model.expressions;

public class GreaterOrEqualExpression extends RelationalExpression {

	@Override
	public boolean evaluate(double d1, double d2) {
		return d1 >= d2;
	}

	@Override
	public boolean evaluate(String s1, String s2) {
		return s1.compareTo(s2) >= 0;
	}

	@Override
	public boolean evaluate(int[] i1, int[] i2) {
		return compareArrays(i1, i2) >= 0;
	}

	@Override
	public boolean evaluate(byte[] b1, byte[] b2) {
		return compareArrays(b1, b2) >= 0;
	}
}
