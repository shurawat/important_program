package prepare.map;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Product implements Cloneable, Serializable {

    private String name;
    private String description;
    private List<String> tags;
    
    // standard getters/setters/constructors

    public Product addTagsOfOtherProduct(Product product) {
        this.tags.addAll(product.getTags());
        return this;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	
	
	@Override
	public boolean equals(Object o) {
		if(o == this)
			return true;
		if(o == null || o.getClass() != getClass())
			return false;
		Product product = (Product) o;
		return Objects.equals(product.getName(), name) && Objects.equals(product.getDescription(), description);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, description);
	}
    
    
}
	