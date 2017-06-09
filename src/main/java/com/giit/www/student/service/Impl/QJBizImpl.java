package com.giit.www.student.service.Impl;


        import com.giit.www.college.dao.QJDao;
        import com.giit.www.entity.QJ;
        import com.giit.www.student.service.QJBiz;
        import org.springframework.stereotype.Service;

        import javax.annotation.Resource;

@Service
public class QJBizImpl implements QJBiz {
    @Resource
    private QJDao Dao;

    public void add(QJ qj) {
        Dao.add(qj);
    }
    @Override
    public void delete(int id) {
        Dao.delete(id);
    }
}
