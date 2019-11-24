package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	T[] arr;
	
	public ArrayList() {
	arr= (T[]) new Object[0];	
		
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return arr[loc];
	}
	
	
	public void add(T val) {
	T[] arr1=(T[]) new Object[arr.length+1];
	if (arr.length==0) {
		arr1[0]=val;
	}
	else {
		
	
	for (int i = 0; i < arr.length; i++) {
		arr1[i]=arr[i];
		if (i==arr.length-1) {
			arr1[arr.length]=val;
		}
	}
	}
	arr=arr1;
	}
	
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] arr2=(T[]) new Object[arr.length];
		for (int i = 0; i < arr2.length; i++) {
			if (i==loc) {
			arr2[i]=val;
			}
			else {
				arr2[i+1]=arr[i];
			}
		}
		arr=arr2;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		T[] arr2=(T[]) new Object[arr.length];
		for (int i = 0; i < arr2.length; i++) {
			if (i==loc) {
			arr2[i]=val;
			}
			else {
				arr2[i]=arr[i];
			}
		}
		arr=arr2;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}
}