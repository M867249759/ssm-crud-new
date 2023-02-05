package service;

import bean.Emp;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author M33
 * @create 2023-02-03 9:59
 */
public interface EmpService {
    PageInfo<Emp> getPageEmployee(Integer pageNum);

    Integer saveEmp(Emp emp);
    boolean checkName(String empName);

    Emp getEmpByEditId(Integer empId);

    void updateEmp(Emp emp);

    void deleteEmp(String empName);
}
