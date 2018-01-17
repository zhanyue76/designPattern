package com.songjy.designPattern.prototype;
/**
 * 工作经历
 * @author lenovo
 *
 */
public class WorkExperience implements Cloneable {
	public String workplace;
	public String workyear;
	public String getWorkplace() {
		return workplace;
	}
	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}
	public String getWorkyear() {
		return workyear;
	}
	public void setWorkyear(String workyear) {
		this.workyear = workyear;
	}
	public WorkExperience(){}
	
	
	public WorkExperience(String workplace,String workyear){
		this.workplace = workplace;
		this.workyear = workyear;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	
}
