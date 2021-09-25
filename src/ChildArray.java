
public class ChildArray {
	private Child[] children;
	private int nItems;
	
	/**
	 * Class constructor
	 * @param size
	 */
	public ChildArray(int size) {
		this.children = new Child[size];
		this.nItems = 0;
	}
	
	/**
	 * Search child by age
	 * @param age
	 * @return Child object or null if not found
	 */
	public Child getChildByAge(int age) {
		Child result = null;
		for(Child child: this.children) {
			if(child.getAge() == age) {
				result =  child;
				break;
			}
		}
		return result;
	}
	
	/**
	 * Adding a new child into the array
	 * @param firstName
	 * @param lastName
	 * @param age
	 */
	public void addChild(String firstName, String lastName, int age) {
		this.children[this.nItems] = new Child(firstName, lastName, age);
		this.nItems ++;
	}
	
	
	/**
	 * Deleting a child from the children array  
	 * @param age
	 * @return boolean if deleted or not
	 */
	public boolean removeChildByAge(int age) {
		int j = 0;
		for(j = 0; j < this.nItems; j++) {
			if(this.children[j].getAge() == age) {
				break;
			}
		}
		if(j ==  this.nItems) {
			return false;
		} else {
			for(int k = j; k < this.nItems; k++) 
				this.children[k] = this.children[k+1];
			this.nItems --;
			return true;
		}
	}
	
	
	/**
	 * Displaying all children in the array
	 */
	public void displayChildren() {
		for(Child child: this.children) {
			System.out.println("FullName: "+child.getFullName()+" | Age: "+child.getAge());
		}
	}
	
	
}
