// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class PeekingIterator implements Iterator<Integer> {
    Iterator <Integer> iter = null;
    Integer next = null;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        iter = iterator;
        if(iter.hasNext())
            next = iter.next();   
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return next;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        Integer currVal = next;
	    if(iter.hasNext())
            next = iter.next();
        else
            next = null;
        return currVal;        
	}
	
	@Override
	public boolean hasNext() {
	    return next != null || iter.hasNext();
	}
}

