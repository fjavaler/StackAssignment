package Stack;

import java.util.EmptyStackException;

import LinkedList.SLNode;
import LinkedList.SinglyLinkedList;

public class LinkedStack<E> implements Stack<E>
{
	SinglyLinkedList<E> stack;

	public LinkedStack()
	{
		stack = new SinglyLinkedList<E>();
		stack.setHead(null);
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
		return stack.getElementAt(stack.getLength()-1);
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
		
		SLNode<E> temp = stack.getHead();
		for(int i = 0; i < stack.getLength()-1; i++)
		{
			temp = temp.getSuccessor();
		}
		E returnable = temp.getElement();
		temp.setSuccessor(null);
		temp.setElement(null);
		return returnable;
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
		SLNode<E> newNode = new SLNode<E>();
		newNode.setElement(element);
		newNode.setSuccessor(null);
		SLNode<E> temp = stack.getHead();
		for (int i = 0; i < stack.getLength()-2; i++)
		{
			temp = temp.getSuccessor();
		}
		temp.setSuccessor(newNode);
	}

	/**
	 * Return the number of elements currently stored in the stack.
	 * 
	 * @return topmost element of the stack
	 */
	@Override
	public int size()
	{
		return stack.getLength();
	}
}
