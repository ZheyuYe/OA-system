package com.giit.www.student.service;

import com.giit.www.entity.QJ;
import com.giit.www.entity.custom.SectionCustom;

import java.util.List;

public interface QJBiz {
    public void add(QJ qj);
    public void delete(int id);
    public List<SectionCustom> findAllQJ();
    public List<SectionCustom> findMyQJ(String stdId);

}
