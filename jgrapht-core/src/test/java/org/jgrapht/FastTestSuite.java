/*
 * (C) Copyright 2018-2018, by John Sichi and Contributors.
 *
 * JGraphT : a free Java graph-theory library
 *
 * This program and the accompanying materials are dual-licensed under
 * either
 *
 * (a) the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation, or (at your option) any
 * later version.
 *
 * or (per the licensee's choosing)
 *
 * (b) the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation.
 */
package org.jgrapht;

import org.junit.runner.*;
import org.junit.experimental.categories.*;
import com.googlecode.junittoolbox.*;

/**
 * Suite of fast unit tests only (as run by mvn test).
 * 
 * @author John Sichi
 */
@RunWith(ParallelSuite.class)
@Categories.ExcludeCategory(SlowTests.class)
@SuiteClasses({ "**/*Test.class", "!**/perf/**" })
public class FastTestSuite
{
}
