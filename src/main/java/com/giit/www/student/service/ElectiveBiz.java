package com.giit.www.student.service;

import com.giit.www.entity.Section;
import com.giit.www.entity.custom.SectionCustom;

import java.util.List;

public interface ElectiveBiz {
    public void add(int secId, String stdId);

    public List<SectionCustom> findAllSection();

    public List<SectionCustom> findMySection(String stdId);

    public void delete(int secId, String stdId);
}
