package org.cloudcoder.app.shared.model;

import java.io.Serializable;

/**
 * @author shanembonner
 *
 *Model class representing an achievement that is yet to be earned by the user
 */
public class Achievement implements Serializable, IModelObject<Achievement> {
	private static final long serialVersionUID = 1L;
	
	private int id;
	private int courseId;
	private int achievementImageId;
	private String title;
	
	public static final ModelObjectField<? super Achievement, Integer> ID = new ModelObjectField<Achievement, Integer>("id", Integer.class, 0, ModelObjectIndexType.IDENTITY){
		public void set(Achievement obj, Integer value) {obj.setId(value); }
		public Integer get(Achievement obj) {return obj.getId(); }
	};
	
	//TODO: what are the numbers next to the class?
	public static final ModelObjectField<? super Achievement, Integer> COURSEID = new ModelObjectField<Achievement, Integer>("course_id", Integer.class, 0, ModelObjectIndexType.NON_UNIQUE){
		public void set(Achievement obj, Integer value) {obj.setCourseId(value); }
		public Integer get(Achievement obj) {return obj.getCourseId(); }
	};
	
	public static final ModelObjectField<? super Achievement, Integer> ACHIEVEMENTIMAGEID = new ModelObjectField<Achievement, Integer>("achievement_image_id", Integer.class, 0, ModelObjectIndexType.NONE){
		public void set(Achievement obj, Integer value) {obj.setAchievementImageId(value); }
		public Integer get(Achievement obj) {return obj.getAchievementImageId(); }
	};
	
	public static final ModelObjectField<? super Achievement, String> TITLE = new ModelObjectField<Achievement, String>("title", String.class, 20, ModelObjectIndexType.NONE){
		public void set(Achievement obj, String value) {obj.setAchievementTitle(value);}
		public String get(Achievement obj) {return obj.getAchievementTitle(); }
	};
	
	/**
	 * Description of fields (schema version 0).
	 */
	public static final ModelObjectSchema<Achievement> SCHEMA_V0 = new ModelObjectSchema<Achievement>("achievement")
		.add(ID)
		.add(COURSEID)
		.add(ACHIEVEMENTIMAGEID)
		.add(TITLE);
	
	public static final ModelObjectSchema<Achievement> SCHEMA = SCHEMA_V0;
	
	public Achievement(){
		
	}
	

	@Override
	public ModelObjectSchema<? super Achievement> getSchema() {
		return SCHEMA;
	}
	
	/**
	 * set the achievement's unique id
	 * @param value the achievement's unique id
	 */
	public void setId(int value) {
		this.id = value;
	}
	
	/**
	 * Get the achievement's id
	 * @return the achievement's id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * set the achievement's courseId
	 * @param value the achievement's courseId
	 */
	public void setCourseId(int value){
		this.courseId = value;
	}
	
	/**
	 * return the achievement's courseId
	 * @return the achievement's courseId
	 */
	public int getCourseId(){
		return courseId;
	}
	
	/**
	 * set the achievement's image id
	 * @param value the achievement's image id
	 */
	public void setAchievementImageId(int value){
		this.achievementImageId = value;
	}
	
	/**
	 * return the achievement's image id
	 * @return the achievement's image id
	 */
	public int getAchievementImageId(){
		return achievementImageId;
	}
	
	public void setAchievementTitle(String value) {
		this.title = value;
	}

	public String getAchievementTitle() {
		return title;
	}


	
}