package mapper;

import bean.Emp;
import bean.EmpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbggenerated Thu Feb 02 09:35:14 CST 2023
     */
    int countByExample(EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbggenerated Thu Feb 02 09:35:14 CST 2023
     */
    int deleteByExample(EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbggenerated Thu Feb 02 09:35:14 CST 2023
     */
    int deleteByPrimaryKey(Integer empId);

    int deleteMultiByPrimaryKey(@Param("empIds") String empIds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbggenerated Thu Feb 02 09:35:14 CST 2023
     */
    int insert(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbggenerated Thu Feb 02 09:35:14 CST 2023
     */
    int insertSelective(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbggenerated Thu Feb 02 09:35:14 CST 2023
     */
    List<Emp> selectByExample(EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbggenerated Thu Feb 02 09:35:14 CST 2023
     */
    Emp selectByPrimaryKey(Integer empId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbggenerated Thu Feb 02 09:35:14 CST 2023
     */
    List<Emp> selectByExampleWithDept(EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbggenerated Thu Feb 02 09:35:14 CST 2023
     */
    Emp selectByPrimaryKeyWithDept(Integer empId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbggenerated Thu Feb 02 09:35:14 CST 2023
     */

    List<Emp> getAllEmployee();

    int updateByExampleSelective(@Param("record") Emp record, @Param("example") EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbggenerated Thu Feb 02 09:35:14 CST 2023
     */
    int updateByExample(@Param("record") Emp record, @Param("example") EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbggenerated Thu Feb 02 09:35:14 CST 2023
     */
    int updateByPrimaryKeySelective(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_emp
     *
     * @mbggenerated Thu Feb 02 09:35:14 CST 2023
     */
    int updateByPrimaryKey(Emp record);
}