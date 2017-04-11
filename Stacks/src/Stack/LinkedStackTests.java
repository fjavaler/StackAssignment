package Stack;

import static org.junit.Assert.*;

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
		fail("Not yet implemented");
	}

	@Test
	public void testPop()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testPush()
	{
		stack.push(me);
		stack.push(tasha);
	}

	@Test
	public void testSize()
	{
		
	}

}
