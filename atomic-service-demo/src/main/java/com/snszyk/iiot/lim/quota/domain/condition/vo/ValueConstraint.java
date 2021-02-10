package com.snszyk.iiot.lim.quota.domain.condition.vo;

import com.snszyk.iiot.lim.quota.domain.condition.repository.ConditionRepository;

import java.util.LinkedHashSet;
import java.util.Set;

public enum ValueConstraint {

    ENUM {
        private Set<String> values = new LinkedHashSet<>(0);
        public void check(ConditionRepository repository, ConditionId id, String value) {
//            values = repository.getEnumValues();
//            if (!values.contains(value)) {
//                throw new IllegalArgumentException("value not in this enum values;");
//            }
        }
        public void maintain(ConditionRepository repository, ConditionId id) {
//            Set<String> valueSet = repository.getEnumValues();
//            if (!valueSet.containsAll(values) || !values.containsAll(valueSet)) {
//                repository.saveEnumValues(values);
//            }
        }
    }, RANGE {
//        private UnitId unit;
        public void check(ConditionRepository repository, ConditionId id, String value) {
//            if (!StringUtils.isNumeric(value)) {
//                throw new IllegalArgumentException("value is not number");
//            }
        }
        public void maintain(ConditionRepository repository, ConditionId id) {
//            throw new UnsupportedOperationException();
        }

//        public void valueDesc(value) {
//            return value + unit.getValue()
//        }
    };

    public abstract void check(ConditionRepository repository, ConditionId id, String value);
    public abstract void maintain(ConditionRepository repository, ConditionId id);
}
