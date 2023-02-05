package service.impl;

import bean.Dept;
import mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.DeptService;

import java.util.List;


@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> getDepts() {
        List<Dept> depts = deptMapper.selectByExample(null);
        return depts;
    }
}



