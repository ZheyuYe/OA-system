package com.giit.www.student.service.Impl;


        import com.giit.www.college.dao.QJDao;
        import com.giit.www.entity.QJ;
        import com.giit.www.entity.custom.SectionCustom;
        import com.giit.www.student.service.QJBiz;
        import org.springframework.stereotype.Service;

        import javax.annotation.Resource;
        import java.util.List;

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

    @Override
    public List<SectionCustom> findAllQJ() {
        return sectionDao.findAllCustom();
    }

    @Override
    public List<SectionCustom> findMyQJ(String stdId) {
        return sectionDao.findMyCustom(stdId);
    }
}
