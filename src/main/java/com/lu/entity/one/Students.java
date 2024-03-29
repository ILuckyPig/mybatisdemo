package com.lu.entity.one;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table students
 */
public class Students {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column students.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column students.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column students.age
     *
     * @mbg.generated
     */
    private Integer age;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table students
     *
     * @mbg.generated
     */
    public Students(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table students
     *
     * @mbg.generated
     */
    public Students() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column students.id
     *
     * @return the value of students.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column students.id
     *
     * @param id the value for students.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column students.name
     *
     * @return the value of students.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column students.name
     *
     * @param name the value for students.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column students.age
     *
     * @return the value of students.age
     *
     * @mbg.generated
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column students.age
     *
     * @param age the value for students.age
     *
     * @mbg.generated
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}