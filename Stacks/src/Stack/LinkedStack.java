/********************************************************
 *
 *  Project :  Generic LinkedStack Class | M6-A4
 *  File    :  LinkedStack.java
 *  Name    :  Frederick Javalera
 *  Date    :  4/10/17 (4/10/17)
 *
 *  Description : (Narrative description, not code)
 *
 *    1) What is the purpose of the code; what problem does the code solve.
 *	  The purpose of this code is to create a LinkedStack class and its methods.
 *
 *    2) What data-structures are used.
 *    The data structure used is a SinglyLinkedList.
 *
 *    3) What algorithms, techniques, etc. are used in implementing the data structures.
 *    Accessing values from elements are used prevalently in the data structure.
 *
 *    4) What methods are implemented (optional).
 *
 *  Changes :  <Description|date of modifications>
 *
 ********************************************************/
package Stack;

import java.util.EmptyStackException;
import LinkedList.SinglyLinkedList;

public class LinkedStack<E> implements Stack<E>
{
	//field
	SinglyLinkedList<E> stack;

	/**
	 * constructor
	 */
	public LinkedStack()
	{
		stack = new SinglyLinkedList<E>();
	}

	/**
	 * Determine if the stack is empty.
	 * 
	 * @return <code>true</code> if the stack is empty, otherwise return false
	 */
	@Override
	public boolean isEmpty()
	{
		if (stack.getLength() == 0)
			return true;
		return false;
	}

	/**
	 * Return the top element of the stack without removing it. This operation
	 * does not modify the stack.
	 * 
	 * @return topmost element of the stack
	 * @throws EmptyStackException
	 *             if the stack is empty
	 */
	@Override
	public E peek() throws EmptyStackException
	{
		if (isEmpty() == true)
			throw new EmptyStackException();
		return stack.getElementAt(stack.getLength() - 1);
	}

	/**
	 * Pop the top element from the stack and return it.
	 * 
	 * @return topmost element of the stack
	 * @throws EmptyStackException
	 *             if the stack is empty
	 */
	@Override
	public E pop()
	{
		if (isEmpty() == true)
			throw new EmptyStackException();
		E value = peek();
		stack.remove(stack.getLength() - 1);
		return value;
	}

	/**
	 * Push <code>element</code> on top of the stack.
	 * 
	 * @param element
	 *            the element to be pushed on the stack.
	 */
	@Override
	public void push(E element)
	{
		stack.add(element, stack.getLength());
	}

	/**
	 * Return the number of elements currently stored in the stack.
	 * 
	 * @return index of topmost element of the stack
	 */
	@Override
	public int size()
	{
		return stack.getLength();
	}
}
