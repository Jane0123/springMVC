package entity;

import java.io.Serializable;

/**
 * (Abc)实体类
 *
 * @author makejava
 * @since 2021-12-09 11:17:07
 */
public class Abc implements Serializable {
    private static final long serialVersionUID = -62680191440310355L;

    private Integer id;

    private String number;

    private String sex;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Abc{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
