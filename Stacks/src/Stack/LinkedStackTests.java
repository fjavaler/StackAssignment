/********************************************************
 *
 *  Project :  Generic LinkedStack Class | M6-A4
 *  File    :  LinkedStackTests.java
 *  Name    :  Frederick Javalera
 *  Date    :  4/10/17 (4/10/17)
 *
 *  Description : (Narrative description, not code)
 *
 *    1) What is the purpose of the code; what problem does the code solve.
 *    The purpose of this code is to perform a series of tests on my implementation
 *    of the LinkedStack class.
 *
 *    2) What data-structures are used.
 *    LinkedStacks are used.
 *
 *    3) What algorithms, techniques, etc. are used in implementing the data structures.
 *    JUnit tests.
 *
 *    4) What methods are implemented (optional).
 *
 *  Changes :  <Description|date of modifications>
 *
 ********************************************************/
package Stack;

import static org.junit.Assert.*;

import java.util.EmptyStackException;

import org.junit.Before;
import org.junit.Test;

import Person.Person;

public class LinkedStackTests
{
	// fields
	LinkedStack<Person> stack;
	LinkedStack<Integer> integerStack;
	Person me;
	Person tasha;
	Person presley;
	Person javi;
	Integer one;
	Integer ten;
	Integer oneHundred;
	Integer oneThousand;

	@Before
	public void setUp() throws Exception
	{
		// stacks
		stack = new LinkedStack<Person>();
		integerStack = new LinkedStack<Integer>();

		// persons
		me = new Person("Fred Javalera", 36);
		tasha = new Person("Tasha Javalera", 27);
		presley = new Person("Presley Javalera", 2);
		javi = new Person("Javi Javalera", 42);

		// integers
		one = new Integer(1);
		ten = new Integer(10);
		oneHundred = new Integer(100);
		oneThousand = new Integer(1000);
	}

	@Test
	public void testLinkedStack()
	{
		assertTrue(stack.size() == 0);
	}

	@Test
	public void testIsEmpty()
	{
		stack.push(me);
		stack.pop();
		assertTrue(stack.isEmpty());
	}

	@Test
	public void testIsEmpty2()
	{
		integerStack.push(one);
		integerStack.pop();
		assertTrue(integerStack.isEmpty());
	}

	@Test
	public void testIsEmpty3()
	{
		stack.push(me);
		stack.push(tasha);
		stack.pop();
		assertFalse(stack.isEmpty());
	}

	@Test
	public void testPeek()
	{
		stack.push(me);
		stack.push(javi);
		Person remove = stack.peek();
		assertEquals("Javi Javalera", remove.getName());
		assertEquals(42, remove.getAge());
		assertEquals(Person.class, remove.getClass());
		assertEquals(2, stack.size());
	}

	@Test
	public void testPeek2()
	{
		stack.push(javi);
		Person remove = stack.peek();
		assertEquals("Javi Javalera", remove.getName());
		assertEquals(42, remove.getAge());
		assertEquals(Person.class, remove.getClass());
		assertEquals(1, stack.size());
	}

	@Test(expected = EmptyStackException.class)
	public void testPeek3()
	{
		@SuppressWarnings("unused")
		Person remove = stack.peek();
	}

	@Test
	public void testPeek4()
	{
		integerStack.push(one);
		integerStack.push(ten);
		Integer peeked = integerStack.peek();
		assertEquals("10", peeked.toString());
		assertEquals(10, peeked.intValue());
		assertEquals(Integer.class, peeked.getClass());
		assertEquals(2, integerStack.size());
	}

	@Test
	public void testPop()
	{
		stack.push(me);
		stack.push(javi);
		Person remove = stack.pop();
		assertEquals("Javi Javalera", remove.getName());
		assertEquals(42, remove.getAge());
		assertEquals(Person.class, remove.getClass());
		assertEquals(1, stack.size());
	}

	@Test(expected = EmptyStackException.class)
	public void testPop2()
	{
		@SuppressWarnings("unused")
		Person remove = stack.pop();
	}

	@Test
	public void testPop3()
	{
		stack.push(javi);
		Person remove = stack.pop();
		assertEquals("Javi Javalera", remove.getName());
		assertEquals(42, remove.getAge());
		assertEquals(Person.class, remove.getClass());
		assertEquals(0, stack.size());
	}

	@Test
	public void testPop4()
	{
		stack.push(me);
		stack.push(tasha);
		stack.push(presley);
		stack.push(javi);
		Person remove = stack.pop();
		assertEquals("Javi Javalera", remove.getName());
		assertEquals(42, remove.getAge());
		assertEquals(Person.class, remove.getClass());
		assertEquals(3, stack.size());
	}

	@Test
	public void testPop5()
	{
		integerStack.push(one);
		integerStack.push(ten);
		integerStack.push(oneHundred);
		integerStack.push(oneThousand);
		Integer remove = integerStack.pop();
		assertEquals(1000, remove.intValue());
		assertEquals(Integer.class, remove.getClass());
		assertEquals(3, integerStack.size());
	}

	@Test
	public void testPush()
	{
		stack.push(me);
		stack.push(tasha);
		stack.push(javi);
		stack.push(presley);
		assertEquals(4, stack.size());
	}

	@Test
	public void testPush2()
	{
		stack.push(me);
		stack.push(tasha);
		assertEquals(2, stack.size());
	}

	@Test
	public void testPush3()
	{
		integerStack.push(one);
		integerStack.push(ten);
		assertEquals(2, integerStack.size());
	}

	@Test
	public void testSize()
	{
		stack.push(me);
		stack.push(tasha);
		stack.push(javi);
		assertEquals(3, stack.size());
	}

	@Test
	public void testSize2()
	{
		integerStack.push(one);
		integerStack.push(ten);
		integerStack.push(oneThousand);
		assertEquals(3, integerStack.size());
	}
}
