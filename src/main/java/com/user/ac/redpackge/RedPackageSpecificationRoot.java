package com.user.ac.redpackge;

import com.user.ac.common.IncentiveAction;
import com.user.ac.common.IncentiveSpecification;
import com.user.ac.common.SpecificationRoot;

import java.util.concurrent.ConcurrentHashMap;

public class RedPackageSpecificationRoot implements SpecificationRoot{
    private ConcurrentHashMap<IncentiveSpecification,IncentiveAction> specifications;
    public void loadSpecifications() {

    }
}
