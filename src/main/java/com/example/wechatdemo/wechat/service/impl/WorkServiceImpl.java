package com.example.wechatdemo.wechat.service.impl;

import com.example.wechatdemo.wechat.constant.CommentConstant;
import com.example.wechatdemo.wechat.entity.*;
import com.example.wechatdemo.wechat.mapper.*;
import com.example.wechatdemo.wechat.service.work.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WorkServiceImpl implements WorkService {
    @Resource
    private PostMapper postMapper;
    @Resource
    private DrugclassificationMapper drugclassificationMapper;
    @Resource
    private DrugsegmentationMapper drugsegmentationMapper;
    @Resource
    private DruggoodMapper druggoodMapper;
    @Resource
    private CommentforgoodMapper commentforgoodMapper;
    @Resource
    private AddressMapper addressMapper;
    @Resource
    private CartMapper cartMapper;
    @Resource
    private MykeepMapper mykeepMapper;
    @Resource
    private DoctorMapper doctorMapper;
    @Resource
    private AppointmentMapper appointmentMapper;
    @Resource
    private UserMapper userMapper;


    @Override
    public List<Post> selectAllPosts() {
        List<Post> postList = postMapper.selectByExample(null);
        return postList;
    }

    @Override
    public int insertPost(Post post) {
        int insertSelective = postMapper.insertSelective(post);
        return insertSelective;
    }

    @Override
    public List<Drugclassification> selAllDrugclass() {
        List<Drugclassification> list = drugclassificationMapper.selectByExample(null);
        return list;
    }

    @Override
    public List<Drugsegmentation> selDrugsegByDrugclassId(Integer drugclassId) {
        DrugsegmentationExample example = new DrugsegmentationExample();
        example.createCriteria().andParentidEqualTo(drugclassId);
        List<Drugsegmentation> list = drugsegmentationMapper.selectByExample(example);
        return list;
    }

    @Override
    public List<Druggood> selDruggoodByDrugsegId(Integer drugsegId) {
        DruggoodExample example = new DruggoodExample();
        example.createCriteria().andParentidEqualTo(drugsegId);
        List<Druggood> list = druggoodMapper.selectByExample(example);
        return list;
    }

    @Override
    public Druggood seleOneByDruggoodId(Integer druggoodId) {
        DruggoodExample example = new DruggoodExample();
        example.createCriteria().andDruggoodidEqualTo(druggoodId);
        List<Druggood> list = druggoodMapper.selectByExample(example);
        if (list.size() == 1){
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<Druggood> selDruggoodBySearchLike(String searchKey) {
        List<Druggood> list = druggoodMapper.selDruggoodBySearchLike(searchKey);
        return list;
    }

    @Override
    public List<Commentforgood> selAllCommentByDruggoodId(Integer druggoodId) {
        CommentforgoodExample example = new CommentforgoodExample();
        example.createCriteria().andGoodidEqualTo(druggoodId);
        List<Commentforgood> list = commentforgoodMapper.selectByExample(example);
        return list;
    }

    @Override
    public Address selDefautAdress(Integer uid) {
        AddressExample example = new AddressExample();
        example.createCriteria().andUseridEqualTo(uid).andIsdefaultEqualTo(CommentConstant.DEFAULT_ADDRESS);
        List<Address> list = addressMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(list)){
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<Address> selAllAdress(Integer uid) {
        AddressExample example = new AddressExample();
        example.createCriteria().andUseridEqualTo(uid);
        List<Address> list = addressMapper.selectByExample(example);
        return list;
    }

    @Override
    public List<Cart> selAllCart(Integer uid) {
        CartExample example = new CartExample();
        example.createCriteria().andUseridEqualTo(uid);
        List<Cart> list = cartMapper.selectByExample(example);
        return list;
    }

    @Override
    public List<Mykeep> selAllKeep(Integer uid) {
        MykeepExample example = new MykeepExample();
        example.createCriteria().andUseridEqualTo(uid);
        List<Mykeep> list = mykeepMapper.selectByExample(example);
        return list;
    }


    @Override
    public List<Doctor> selAllDoctor() {
        List<Doctor> list = doctorMapper.selectByExample(null);
        if (list.size() != 0){
            for (Doctor doctor : list) {
                Integer uid = doctor.getUid();
                //把每个医生doctor中对于的用户uid拿出来查用户id，然后将User装配到Doctor
                User user = userMapper.selectByPrimaryKey(uid);
                doctor.setUser(user);
            }
            return list;
        }
        return null;
    }

    @Override
    public int insertAppoint(Appointment appointment) {
        //int i = appointmentMapper.insertSelective(appointment);
        int i = appointmentMapper.insert(appointment);
        return i;
    }
}
