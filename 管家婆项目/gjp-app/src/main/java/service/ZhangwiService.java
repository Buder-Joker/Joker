package service;

import dao.ZhangwuDao;
import domain.ZhangWu;

import java.util.List;

/*
业务层
接收上一层，控制controller的数据
经过计算，传递给dao层
调用dao层的类，类成员位置，创建Dao类的对象
 */
public class ZhangwiService {
    private ZhangwuDao dao = new ZhangwuDao();
    /*
     * 定义方法，实现删除账务功能
     * 由控制层调用，传递主键id
     * 调用dao层方法，传递主键id
     */
    public void deleteZhangWu(int zwid) {
        dao.deleteZhangWu(zwid);
    }

    /*
     * 定义方法，实现编辑账务
     * 由控制层调用，传递ZhangWu对象
     * 调用dao层的方法，传递ZhangWu对象
     */
    public void editZhangWu(ZhangWu zw) {
        dao.editZhangWu(zw);
    }

    /*
     * 定义方法，实现添加账务
     * 是由控制层调用，传递ZhangWu对象
     */
    public void addZhangWu(ZhangWu zw) {
        dao.addZhangWu(zw);
    }

    /*
     * 定义方法,实现条件查询账务
     * 方法由控制层调用,传递2个日期字符串
     * 调用dao层的方法,传递2个日期字符串
     * 获取到查询结果集
     */
    public List<ZhangWu> select(String startDate,String endDate){
        return dao.select(startDate, endDate);
    }
    /*
     *  定义方法,实现查询所有的账务数据
     *  此方法,由控制层调用, 去调用dao层的方法
     *  返回存储ZhangWu对象的List集合
     */
    public List<ZhangWu> selectAll(){
        return dao.selectAll();
    }
}
