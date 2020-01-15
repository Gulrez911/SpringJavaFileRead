package com.gul.test;

public class CourseDto {

	String learningPath;
	String course;
	String imageUrl;
	String module;
	String link;
	
	public CourseDto() {
		super();
	}
	public String getLearningPath() {
		return learningPath;
	}
	public void setLearningPath(String learningPath) {
		this.learningPath = learningPath;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}

}
