package user;

public class Student {
    private String id = null;
    private String name = null;
    private String sex = null;
    private String Bid = null;
    public Student() {
        // TODO Auto-generated constructor stub
    }
    public Student(String  id, String name, String sex, String Bid) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.Bid = Bid;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getBid() {
        return Bid;
    }
    public void setAge(String Bid) {
        this.Bid = Bid;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Bid == null) ? 0 : Bid.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((sex == null) ? 0 : sex.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (Bid == null) {
            if (other.Bid != null)
                return false;
        } else if (!Bid.equals(other.Bid))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (sex == null) {
            if (other.sex != null)
                return false;
        } else if (!sex.equals(other.sex))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", Bid=" + Bid + "]";
    }
}
