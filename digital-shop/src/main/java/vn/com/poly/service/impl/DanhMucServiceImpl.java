package vn.com.poly.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import vn.com.poly.entities.DanhMuc;
import vn.com.poly.repository.DanhMucRepository;
import vn.com.poly.service.DanhMucService;

import java.util.List;

@Service
public class DanhMucServiceImpl implements DanhMucService {

    @Autowired
    DanhMucRepository danhMucRespository;


    @Override
    public List<DanhMuc> getAllDanhMuc() {
        return danhMucRespository.findAll();
    }

    @Override
    public List<DanhMuc> findByHangSanXuat(Long idHangSanXuat) {
        return danhMucRespository.findByHangSanXuat(idHangSanXuat);
    }

    @Override
    public void listCategoryToView(Model model) {
        List<DanhMuc> danhMucList = danhMucRespository.findAll();
        model.addAttribute("danhMucs", danhMucList);
    }
}
