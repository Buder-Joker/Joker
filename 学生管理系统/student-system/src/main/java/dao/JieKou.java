package dao;

import java.io.Serializable;
import java.util.List;

public interface JieKou<T> {
    //增加
    public void add(T t);
    //修改
    public void modify(T t);
    //删除
    public void remove(Serializable id);
    //把所有用户都取出来都放在这一页
    public List<T> list();
    //查询有无此人
    public boolean findById(Serializable id);
}
