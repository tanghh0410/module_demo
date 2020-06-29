package demo.demo_dao;

import javax.persistence.*;
import java.util.Objects;

/**
    用户表
 * @Author: tanghh18
 */
@Entity
@Table(name = "bos_user", schema = "test3", catalog = "")
public  class BosUserModel  {

    private Integer id;
    private String name;
    private String password;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BosUserModel that = (BosUserModel) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(password, that.password);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id,name, password);
    }
}
