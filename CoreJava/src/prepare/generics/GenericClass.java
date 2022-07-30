package prepare.generics;

public class GenericClass<T, R> {
	
	T name;
	R id;
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public R getId() {
		return id;
	}
	public void setId(R id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "GenericClass [name=" + name + ", id=" + id + "]";
	}
	
	
	

}
