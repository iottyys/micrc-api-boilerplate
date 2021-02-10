package com.snszyk.iiot.lim.quota.domain.condition;

import lombok.Builder;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
@Builder
public class ConditionRetrieval {
    private String id;
    private String name;
    private String code;
    private String type;
    private String typeName;
    @Builder.Default
    private List<String> values = new ArrayList<>(0);
}
