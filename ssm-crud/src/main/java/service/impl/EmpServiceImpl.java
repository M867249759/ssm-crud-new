package service.impl;

import bean.Emp;
import bean.EmpExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.EmpService;

import java.util.Arrays;
import java.util.List;

/**
 * @author M33
 * @create 2023-02-03 9:59
 */
@Service
public class EmpServiceImpl implements EmpService{
    @Autowired
    private EmpMapper empMapper;

    public PageInfo<Emp> getPageEmployee(Integer pageNum) {
        //开启分页，设置参数，显示第几页，一页多少行数据
        PageHelper.startPage(pageNum,10);
        //查询所有员工信息
        List<Emp> allEmployee = empMapper.getAllEmployee();
        //分页展示，导航栏中页码显示5页
        PageInfo<Emp> pageInfo = new PageInfo<>(allEmployee, 5);
        //返回每页的信息
        return pageInfo;
    }

    @Override
    public Integer saveEmp(Emp emp) {
        int i = empMapper.insertSelective(emp);

        return i;
    }
    @Override
    public boolean checkName(String empName){
        //创建条件
        EmpExample empExample = new EmpExample();
        EmpExample.Criteria criteria = empExample.createCriteria();
        //是否名字重复
        criteria.andEmpNameEqualTo(empName);
        //得到数据库中名字=empName的数量
        long count = empMapper.countByExample(empExample);
        return count==0;
    }

    @Override
    public Emp getEmpByEditId(Integer empId) {
        Emp emp = empMapper.selectByPrimaryKeyWithDept(empId);
        System.out.println(emp);
        return emp;
    }

    @Override
    public void updateEmp(Emp emp) {
        empMapper.updateByPrimaryKeySelective(emp);
    }

    @Override
    public void deleteEmp(String empName) {
        System.out.println(empName);
        String[] empNameList = empName.split(",");
        List<String> employees = Arrays.asList(empNameList);

        System.out.println(employees);

        EmpExample empExample = new EmpExample();
        EmpExample.Criteria criteria = empExample.createCriteria();
        criteria.andEmpNameIn(employees);
        empMapper.deleteByExample(empExample);
    }


}
