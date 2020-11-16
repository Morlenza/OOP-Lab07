package it.unibo.oop.lab.nesting2;

import java.util.LinkedList;
import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {
	
	private final List<T> list;
	
	public OneListAcceptable(List<T> list) {
		this.list = new LinkedList<>(list);
	}

	@Override
	public Acceptor<T> acceptor() {
		return new Acceptor<T>() {
			
			public int currIndex = 0;
		
			@Override
			public void accept(T newElement) throws ElementNotAcceptedException {
				if(currIndex == list.size() || !list.get(currIndex).equals(newElement)){
					throw new ElementNotAcceptedException(newElement);
				}
				else {
					currIndex++;
				}
				
			}

			@Override
			public void end() throws EndNotAcceptedException {
				if((currIndex + 1) < list.size() ) {
					throw new EndNotAcceptedException();
				}
				
			}			
		};
	}

}
