package us.nstro.javaauction.types.selection;

/**
 * A BoundedSelection, which specifies a lower bound and an optional upper
 * bound.
*/
public class BoundedSelection<Select extends Comparable<? super Select>> implements Selection<Select> {
    
    private Select min = null;
    private Select max = null;

    /**
     * if upperBound is false
     */
    private boolean upperBound = false;
    
    /**
     *  Create a new BoundedSelection with a lower bound of min and no
     *  upper bound.
     */
    public BoundedSelection(Select min) {
        this.upperBound = false;
        this.min = min;
    }
    
    /**
     *  Create a new BoundedSelection with a lower bound of min and
     *  an upper bound of max.
     */
    public BoundedSelection(Select min, Select max) {
        this.upperBound = true;
        this.min = min;
        this.max = max;
    }
    
    /**
     *	Determine if this bounded selection contains the given value within
     *	its min and max.
     */
    public boolean contains(Select value) {
        if(this.upperBound)
            return
                this.min.compareTo(value) <= 0 &&
                this.max.compareTo(value) >= 0;
        else
            return
                this.min.compareTo(value) <= 0;
    }
    
    /**
     *	Is this an empty selection? I.e., are all possibilities invalid.
     *
     *	@ensure: !isEmpty() if contains(i) is valid for any i
    */
    public boolean isEmpty() {
        return (this.min == null && this.max == null);
    }
    
}