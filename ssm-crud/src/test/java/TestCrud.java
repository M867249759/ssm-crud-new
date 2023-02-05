import bean.Dept;
import bean.Emp;
import mapper.DeptMapper;
import mapper.EmpMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.thymeleaf.standard.expression.Each;

import java.util.List;
import java.util.UUID;

/**
 * @author M33
 * @create 2023-02-02 10:22
 */
//*1、@RunWith(SpringJUnit4ClassRunner.class)导入SpringTest模块
// *2、@ContextConfiguration指定Spring配置文件的位置
// *3、@autowired要使用的组件即可 自动装配
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestCrud {
    @Autowired
    private DeptMapper deptMapper;

    @Autowired
    private EmpMapper empMapper;
    @Test
    public void TestCrud1(){
//        System.out.println("输出测试"+deptMapper);
//        deptMapper.insert(new Dept(null,"开发部"));
//        deptMapper.updateByPrimaryKey(new Dept(2,"测试部"));
//        deptMapper.updateByPrimaryKey(new Dept(3,"设计部"));
//        deptMapper.updateByPrimaryKey(new Dept(4,"销售部"));
//        deptMapper.deleteByPrimaryKey(5);
//            for(int i =0;i<50;i++){
//                String s = UUID.randomUUID().toString().substring(0, 3);
//                empMapper.insertSelective(new Emp(null,s,"女",s+"@qq.com",4));
//            }

        List<Emp> allEmployee = empMapper.getAllEmployee();
        for(Emp emp:allEmployee){
            System.out.println(emp);
        }
    }
}
