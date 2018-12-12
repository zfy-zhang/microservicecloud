package com.vincent.springcloud.service;

import com.vincent.springcloud.entities.Dept;

import java.util.List;

/**
 * Created with IDEA
 * author:vincent
 * Date:2018/12/12
 */
public interface DeptService {
    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
