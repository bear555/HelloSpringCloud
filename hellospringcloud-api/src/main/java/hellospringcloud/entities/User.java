package hellospringcloud.entities;

import java.util.Date;

//@NoArgsConstructor
//@AllArgsConstructor
//@Data
//@Accessors(chain=true)
public class User {
    private Integer id;
    private String username;
    private Date birthday;
    private  Integer sex;
    private  String address;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

//public class Dept<Accessors> {
//    private Long 	deptno; // 主键
//    private String 	dname; // 部门名称
//    private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
//
//    public Dept(String dname)
//    {
//        super();
//        this.dname = dname;
//    }
//
//    public Long getDeptno() {
//        return deptno;
//    }
//
//    public void setDeptno(Long deptno) {
//        this.deptno = deptno;
//    }
//
//    public String getDname() {
//        return dname;
//    }
//
//    public void setDname(String dname) {
//        this.dname = dname;
//    }
//
//    public String getDb_source() {
//        return db_source;
//    }
//
//    public void setDb_source(String db_source) {
//        this.db_source = db_source;
//    }
//}
