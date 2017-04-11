package Stack;

import static org.junit.Assert.*;

import java.util.EmptyStackException;

import org.junit.Before;
import org.junit.Test;

import Person.Person;

public class LinkedStackTests
{
	LinkedStack<Person> stack;
	Person me;
	Person tasha;
	Person presley;
	Person javi;
	
	@Before
	public void setUp() throws Exception
	{
		stack = new LinkedStack<Person>();
		me = new Person("Fred Javalera", 36);
		tasha = new Person("Tasha Javalera", 27);
		presley = new Person("Presley Javalera", 2);
		javi = new Person("Javi Javalera", 42);
	}

	@Test
	public void testLinkedStack()
	{
//		assertTrue(stack.size() == 0);
	}

	@Test
	public void testIsEmpty()
	{
//		stack.push(new Person("Fred Javalera", 36));
//		stack.pop();
//		assertTrue(stack.isEmpty());
	}

	@Test
	public void testPeek()
	{
//		fail("Not yet implemented");
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
	
	@Test(expected=EmptyStackException.class)
	public void testPop2()
	{
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
	public void testSize()
	{
		
	}

}
