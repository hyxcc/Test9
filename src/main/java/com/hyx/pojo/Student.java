package com.hyx.pojo;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table student
 */
public class Student implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   图片
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.img
     *
     * @mbg.generated
     */
    private String img;

    /**
     * Database Column Remarks:
     *   姓名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * Database Column Remarks:
     *   职称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.position
     *
     * @mbg.generated
     */
    private String position;

    /**
     * Database Column Remarks:
     *   简介
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.intro
     *
     * @mbg.generated
     */
    private String intro;

    /**
     * Database Column Remarks:
     *   工资
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student. salary
     *
     * @mbg.generated
     */
    private Integer salary;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.create_at
     *
     * @mbg.generated
     */
    private Long createAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.update_at
     *
     * @mbg.generated
     */
    private Long updateAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.id
     *
     * @return the value of student.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.id
     *
     * @param id the value for student.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.img
     *
     * @return the value of student.img
     *
     * @mbg.generated
     */
    public String getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.img
     *
     * @param img the value for student.img
     *
     * @mbg.generated
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.name
     *
     * @return the value of student.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.name
     *
     * @param name the value for student.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.position
     *
     * @return the value of student.position
     *
     * @mbg.generated
     */
    public String getPosition() {
        return position;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.position
     *
     * @param position the value for student.position
     *
     * @mbg.generated
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.intro
     *
     * @return the value of student.intro
     *
     * @mbg.generated
     */
    public String getIntro() {
        return intro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.intro
     *
     * @param intro the value for student.intro
     *
     * @mbg.generated
     */
    public void setIntro(String intro) {
        this.intro = intro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student. salary
     *
     * @return the value of student. salary
     *
     * @mbg.generated
     */
    public Integer getSalary() {
        return salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student. salary
     *
     * @param salary the value for student. salary
     *
     * @mbg.generated
     */
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.create_at
     *
     * @return the value of student.create_at
     *
     * @mbg.generated
     */
    public Long getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.create_at
     *
     * @param createAt the value for student.create_at
     *
     * @mbg.generated
     */
    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.update_at
     *
     * @return the value of student.update_at
     *
     * @mbg.generated
     */
    public Long getUpdateAt() {
        return updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.update_at
     *
     * @param updateAt the value for student.update_at
     *
     * @mbg.generated
     */
    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", img='" + img + '\'' +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", intro='" + intro + '\'' +
                ", salary=" + salary +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }
}