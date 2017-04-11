package Stack;

import LinkedList.SLNode;
import LinkedList.SinglyLinkedList;

public class LinkedStack<E> implements Stack<E>
{
	SinglyLinkedList<E> stack = new SinglyLinkedList<E>();
	SLNode<E> top = new SLNode<E>();
	SLNode<E> bottom = new SLNode<E>();
	int size = 0;

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
	public E peek()
	{
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
		return null;
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
