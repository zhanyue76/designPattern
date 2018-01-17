package com.songjy.designPattern.prototype;
/**
 * 简历类,浅度克隆Prototype
 * @author lenovo
 *
 */
public class Resume implements Cloneable{

	private String name;
	private WorkExperience workexperience;
	
	public Resume(String name){
		this.name = name;
		workexperience = new WorkExperience();
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setWorkExperience(String workplace,String workyear){
		this.workexperience.setWorkplace(workplace);
		this.workexperience.setWorkyear(workyear);
	}
	
	//深度克隆
	protected Object deepClone() throws CloneNotSupportedException {
		
		Resume resume = (Resume)super.clone();
		resume.workexperience = (WorkExperience)this.workexperience.clone();
		return resume;
		
	}
	//浅克隆
	protected Object shallowClone() throws CloneNotSupportedException {

		return super.clone();
		
	}
	
	public String toString(){
		return this.name+"的简历：workyear:"+this.workexperience.getWorkyear()+",workplace:"+this.workexperience.getWorkplace();
	}

}
