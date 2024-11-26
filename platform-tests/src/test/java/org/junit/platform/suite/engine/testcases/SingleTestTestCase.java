/*
 * Copyright 2015-2024 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

package org.junit.platform.suite.engine.testcases;

import java.nio.file.Files;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

/**
 * @since 1.8
 */
public class SingleTestTestCase {

	@Test
	void test(TestReporter testReporter) {
		testReporter.publishFile("test.txt", file -> Files.writeString(file, "test"));
	}
}
