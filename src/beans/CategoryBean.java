package beans;

import java.util.*;

public class CategoryBean {
	private int cid;
	String cname;
	List productlist;
	
	public CategoryBean(){
		super();
	}
	public CategoryBean(int cid,String cname,List productlist){
		super();
		cid= this.cid;
		cname= this.cname;
		productlist=this.productlist;
	}
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List getProductlist() {
		return productlist;
	}
	public void setProductlist(List productlist) {
		this.productlist = productlist;
	}
	@Override
	public String toString() {
		return "CategoryBean [cid=" + cid + ", cname=" + cname + ", productlist=" + productlist + "]";
	}
	

}
