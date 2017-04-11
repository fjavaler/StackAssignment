package Stack;

import java.util.EmptyStackException;

import LinkedList.SLNode;
import LinkedList.SinglyLinkedList;

public class LinkedStack<E> implements Stack<E>
{
	SinglyLinkedList<E> stack;
	SLNode<E> top;
	SLNode<E> bottom;
	int size;

	public LinkedStack()
	{
		stack = new SinglyLinkedList<E>();
		bottom = new SLNode<E>();
		top = bottom;
		top.setSuccessor(bottom);
		stack.add(bottom.getElement());
		;
		size = 0;
	}

	/**
	 * Determine if the stack is empty.
	 * 
	 * @return <code>true</code> if the stack is empty, otherwise return false
	 */
	@Override
	public boolean isEmpty()
	{
		if (size == 0)
		{
			return true;
		}
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
		{
			throw new EmptyStackException();
		}
		return top.getElement();
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
		if(isEmpty() == true)
		{
			throw new EmptyStackException();
		}
		E element = top.getElement();
		
		int i = 0;
		SLNode<E> next = bottom.getSuccessor();
		SLNode<E> target = null;
		do
		{
			target = next.getSuccessor();
			i++;
		}
		while (i < stack.getLength()-1);
		target.setSuccessor(null);
		target.setElement(null);
		return element;
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
		// TODO Auto-generated method stub

	}

	/**
	 * Return the number of elements currently stored in the stack.
	 * 
	 * @return topmost element of the stack
	 */
	@Override
	public int size()
	{
		// TODO Auto-generated method stub
		return 0;
	}
}
