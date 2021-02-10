package com.snszyk.iiot.lim.quota.domain.condition.event;

import com.snszyk.iiot.lim.quota.domain.condition.Condition;
import com.snszyk.iiot.lim.quota.domain.condition.exception.ConditionAddException;
import com.snszyk.iiot.lim.quota.domain.condition.repository.ConditionRepository;

public class ConditionAddCommand {
    private ConditionRepository repository;
    private Condition receiver;

    public ConditionAddCommand(Condition condition, ConditionRepository repository) {
        this.repository = repository;
        this.receiver = condition;
    }

    public ConditionRepository getRepository() {
        return this.repository;
    }

    public void execute() throws ConditionAddException {
        this.receiver.add(this);
    }
}
